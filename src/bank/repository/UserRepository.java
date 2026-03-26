package bank.repository;
//package bank.entity.User;
import bank.entity.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;


public class UserRepository
{
     private static Set<User> users = new HashSet<User>();
     static {
         User user1=new User("admin","admin","12345","admin","0.00");
         User user2=new User("user1","user1","123456","user","1000.00");
         User user3=new User("user2","user2","123457","user","2000.00");
         users.add(user1);
         users.add(user2);
         users.add(user3);
     }
    public User getUser(String userId)
    {
        List<User>result=users.stream().filter(user->user.getUsername().equals(userId)).collect(Collectors.toList());
        if(result.size()!=0)
        {
            return result.get(0);
        }
        else
        {
            return null;
        }
    }
    public String  CheckAccountBalance(String userid)
    {
        List<User>result=users.stream().filter(user -> user.getUsername().equals(userid)).collect(Collectors.toList());

        if(!result.isEmpty())
        {
            return result.get(0).getAccountbalance();
        }
        else
        {
            return null;
        }
    }
     public void printUsers()
     {
         System.out.println(users);
     }
     public User login(String username,String password)
     {
         List<User>finallist=users.stream()
                 .filter(user -> user.getUsername().equals(username)&&user.getPassword().equals(password))
                 .collect(Collectors.toList());


          if(finallist.size()==1)
         {
             System.out.println("User found");
             System.out.println("You are logged in successfully");
             return finallist.get(0);
         }
          else
          {
              System.out.println("User not found");
              return null;
          }
     }
        public boolean addNewCustomer(String username,String password,String contact)
        {
            User user=new User(username,password,contact,"user","500.00");
            return users.add(user);
        }
}
