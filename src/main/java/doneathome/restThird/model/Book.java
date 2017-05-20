package doneathome.restThird.model;

import java.util.Date;

/**
 * Created by dzhukov on 09.05.17.
 */
public class Book {
    int id;
    String author;
    String title;
    String language;
    Date year;

    public Book() {
    }

    public Book(int id, String author, String title, String language, Date year) {

        this.id = id;
        this.author = author;
        this.title = title;
        this.language = language;
        this.year = year;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", language='" + language + '\'' +
                ", year=" + year +
                '}';
    }
}
