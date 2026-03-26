package bank.main;

import bank.entity.User;
import bank.service.UserService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{

    private static Scanner sc=new Scanner(System.in);
    static Main main=new Main();
    static UserService userservice=new UserService();
    public static void main(String[] args)
    {
        Main main=new Main();

         while(true)
         {
             System.out.println("Enter your username:");
             String username=sc.nextLine();
             System.out.println("Enter your password:");
             String password=sc.nextLine();
             User user=userservice.login(username,password);
             if(user!=null&&user.getRole().equals("admin"))
             {
                 main.initAdmin();
             }
              if(user!=null&&user.getRole().equals("user"))
             {
                 main.initCustomer(user);
             }
             else
             {
                 System.out.println("You are not logged in");
             }
         }


    }
    private void initAdmin()
    {
        boolean flag=true;
         while(flag)
         {
             System.out.println("You are an administrator");
             System.out.println("1.Exit/logout");
             System.out.println("2.Create Customer account");
             int choice=sc.nextInt();
             sc.nextLine();

             switch(choice)
             {
                 case 1:
                     flag=false;
                     System.out.println("You are logged out successfully");
                     break;
                 case 2:
                     System.out.println("Add new customer account");
                     main.addNewCustomer();
                     break;
                 default:
                     System.out.println("Invalid choice");




             }
         }

    }
    public void addNewCustomer()
    {
        System.out.println("Enter the username:");
        String username=sc.nextLine();
        System.out.println("Enter the password:");
        String password=sc.nextLine();
        System.out.println("Enter customer's contact number:");
        String contact=sc.nextLine();
        boolean result=userservice.addNewCustomer(username,password,contact);
        if(result==true)
        {
            System.out.println("Your account has been created successfully");
        }
        else
        {
            System.out.println("Customer's account  creation has been failed");
        }

    }
    private void initCustomer(User user)
    {
        boolean flag=true;
        while(flag)
        {
            System.out.println("1. Exit or  logout");
            System.out.println("2. Check Account balance");
            System.out.println("3. Fund Transfer");
            int choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    flag=false;
                    System.out.println("You are logged out successfully");
                    break;

                    case 2:
                       String balance= main.CheckAccountBalance(user.getUsername());
                       if(balance!=null)
                       {
                           System.out.println("Your account balance is "+balance);
                       }
                       else
                       {
                           System.out.println("Recheck your account details");
                       }
                case 3:
                    main.FundTransfer();
                      break;
                       default:
                        System.out.println("Invalid choice");
            }
        }
        System.out.println("You are an user");
    }
    private void FundTransfer()
    {
        System.out.println("Enter payee userid");
        String payeeAccountId=sc.next();
        User user=getUSer(payeeAccountId);


        if(user==null)
        {
            System.out.println("Please Enter valid user name");
        }
        else
        {
            System.out.println("Valid Username");

        }

    }
    public User getUSer(String userid)
    {
        return userservice.getUser(userid);
    }

    private String CheckAccountBalance(String userid)
    {
         return userservice.CheckAccountBalance(userid);
    }
}