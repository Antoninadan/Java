package interfaces;

import model.Article;

import java.io.Serializable;
import java.util.ArrayList;

public interface ArticleInterface extends DAOInterface {
    @Override
    ArrayList<Article> getAll();

    @Override
    void deleteById(Serializable id);

}


