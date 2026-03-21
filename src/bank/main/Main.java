package bank.main;


import bank.entity.User;
import bank.service.UserService;

import java.util.Scanner;

public class Main
{

     private static Scanner sc=new Scanner(System.in);
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
                 main.initCustomer();
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
                     addNewCustomer();
                     break;
                 default:
                     System.out.println("Invalid choice");




             }
         }

    }
    public void addNewCustomer()
    {
        System.out.println("Enter your first username:");
        String username=sc.nextLine();
        System.out.println("Enter your password:");
        String password=sc.nextLine();
        System.out.println("Enter contact number:");
        String contact=sc.nextLine();
        boolean result=userservice.addNewCustomer(username,password,contact);
        if(result==true)
        {
            System.out.println("Your account has been created successfully");
        }
        else
        {
            System.out.println("Your account  creation failed");
        }

    }
    private void initCustomer()
    {

        System.out.println("You are an user");
    }
}