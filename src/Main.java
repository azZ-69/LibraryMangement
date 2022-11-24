import model.Books;
import model.Borrowing;
import model.Student;

public class Main {
    public static void main(String[] args) {


        Student s1=new Student("Aswin",11,10);
        Student s2=new Student("Raj",12,5);

s1.print_student();

        Books b1=new Books("The Alchemist","Paulo Coelho",12345,2016);
        Books b2=new Books("Norwegian Wood","Murakami",23456,2010);
        b1.print_books();


        Borrowing B1=new Borrowing(01,23014,2,50);
        Borrowing B2=new Borrowing(02,23040,1,25);

        B2.finerates();


    }
}
