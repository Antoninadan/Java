package ua.i.mail100;

public class Article {
    private String name;
    private String content;
    private String date;
    private String username;

    public Article(String name, String content, String date, String username) {
        this.name = name;
        this.content = content;
        this.date = date;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

