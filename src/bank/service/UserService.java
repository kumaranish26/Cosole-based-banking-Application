package bank.service;
import bank.entity.User;
import bank.repository.UserRepository;


public class UserService {
    private UserRepository userRepository = new UserRepository();
    public void printUsers(){
        userRepository.printUsers();
    }
    public User login(String username, String password){
        return userRepository.login(username,password);
    }
    public boolean addNewCustomer(String username,String password,String contact){
        return userRepository.addNewCustomer(username,password,contact);
    }
    public String CheckAccountBalance(String userid)
    {
          return userRepository.CheckAccountBalance(userid);
    }
    public User getUser(String userId)
    {
        return userRepository.getUser(userId);
    }
}

