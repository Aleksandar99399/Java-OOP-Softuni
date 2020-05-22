package src.SolidLab.inclass;


import src.SolidLab.inclass.repositories.TextFileRepository;
import src.SolidLab.inclass.users.Admin;
import src.SolidLab.inclass.users.User;

public class Main {

    public static void main(String[] args) {
        UserService userService=new UserService(new TextFileRepository());
        User admin=new Admin();
        userService.readResourceFor(admin);

    }
}
