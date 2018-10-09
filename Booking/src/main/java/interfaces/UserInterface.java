package interfaces;

import models.User;

import java.util.List;

public interface UserInterface extends DAOInterface{
    @Override
    List<User> getAll();
}
