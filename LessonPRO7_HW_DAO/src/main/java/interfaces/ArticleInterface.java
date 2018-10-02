package interfaces;

import model.Article;

import java.io.Serializable;
import java.util.List;

public interface ArticleInterface extends DAOInterface {
    @Override
    List<Article> getAll();

    @Override
    void deleteById(Serializable id);

}


