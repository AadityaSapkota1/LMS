package Model;

public class book {
    String name;
    String author;
    String isbn;
    String published_year;

    public book(String name, String author, String isbn, String published_year) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.published_year = published_year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublished_year() {
        return published_year;
    }

    public void setPublished_year(String published_year) {
        this.published_year = published_year;
    }
    public void printFormat(){
        System.out.println("name:"+this.name);
        System.out.println("Author:"+this.author);
        System.out.println("ISBN:"+this.isbn);
        System.out.println("Published Year:"+this.published_year);


    }

}
