package services;

import interfaces.ArticleInterface;
import models.Article;

import java.util.List;

public class ArticleService {

    private ArticleInterface articleInterface;

    public ArticleService (ArticleInterface articleInterface) {
        this.articleInterface = articleInterface;
    }

    public List<Article> getAll() {
        return articleInterface.getAll();
    }

    public void deleteById(int removeId) {
        articleInterface.deleteById(removeId);
    }
}
