package bank.main;


import bank.entity.User;
import bank.service.UserService;

import java.util.Scanner;

public class Main
{

     private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        Main main=new Main();
         UserService userservice=new UserService();
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

             switch(choice)
             {
                 case 1:
                     flag=false;
                     System.out.println("You are logged out successfully");
                     break;
                 case 2:
                     System.out.println("Add new customer account");
                     break;
                 default:
                     System.out.println("Invalid choice");




             }
         }

    }
    public void addNewCustomer()
    {
        System.out.println("Enter your username:");
        String username=sc.nextLine();
        System.out.println("Enter your password:");
        String password=sc.nextLine();
        System.out.println("Enter contact number:");
        String contact=sc.nextLine();

    }
    private void initCustomer()
    {

        System.out.println("You are an user");
    }
}