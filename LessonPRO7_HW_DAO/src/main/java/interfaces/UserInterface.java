package interfaces;

import java.util.ArrayList;

public interface UserInterface extends DAOInterface{
    @Override
    ArrayList<?> getAll();
}
