package service;

import interfaces.UserInterface;
import model.User;

import java.util.List;

public class UserService {

    private UserInterface userInterface;

    public UserService (UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public List<User> getAll() {
        return userInterface.getAll();
    }

}
