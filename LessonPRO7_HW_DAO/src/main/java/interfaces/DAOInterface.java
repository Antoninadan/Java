package interfaces;

import java.io.Serializable;
import java.util.List;

public interface DAOInterface {

    List<?> getAll();
    void deleteById (Serializable id);

}
