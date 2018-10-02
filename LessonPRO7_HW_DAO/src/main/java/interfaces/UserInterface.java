package interfaces;

import model.User;

import java.util.List;

public interface UserInterface extends DAOInterface{
    @Override
    List<User> getAll();
}
