package interfaces;

import java.io.Serializable;
import java.util.ArrayList;

public interface DAOInterface {
    ArrayList<?> getAll();
    void deleteById (Serializable id);
}
