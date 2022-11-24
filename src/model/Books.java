package model;

public class Books {
    String book_name;
    String author;
    double ISBN;
    double time;

    public Books(String book_name, String author, double ISBN, double time) {
        this.book_name = book_name;
        this.author = author;
        this.ISBN = ISBN;
        this.time = time;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getISBN() {
        return ISBN;
    }

    public void setISBN(double ISBN) {
        this.ISBN = ISBN;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void print_books(){

        System.out.println("Name: "+ this.book_name);
        System.out.println("Author: "+ this.author);
        System.out.println("ISBM :"+this.ISBN);
        System.out.println("Published Year :"+this.time);
    }
}
