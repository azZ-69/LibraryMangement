package model;

public class Student {
    String name;
    double grade;
    int borrowed_books;

    public Student(String name, double grade, int borrowed_books) {
        this.name = name;
        this.grade = grade;
        this.borrowed_books = borrowed_books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getBorrowed_books() {
        return borrowed_books;
    }

    public void setBorrowed_books(int borrowed_books) {
        this.borrowed_books = borrowed_books;
    }
    public void print_student() {

        System.out.println("The student is "+ this.name +"of class "+this.grade+ "has borrowed " +this.borrowed_books + "books" );

    }
}
