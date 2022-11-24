package model;

public class Borrowing {
    public Borrowing(int bookId, int studentId, int extradays, int fineRate) {
        this.bookId = bookId;
        this.studentId = studentId;
        this.extradays = extradays;
        this.fineRate = fineRate;
    }

    int bookId;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getExtradays() {
        return extradays;
    }

    public void setExtradays(int extradays) {
        this.extradays = extradays;
    }

    public int getFineRate() {
        return fineRate;
    }

    public void setFineRate(int fineRate) {
        this.fineRate = fineRate;
    }

    int studentId;
    int extradays;
    int fineRate;

    public void finerates() {

        double fine= this.fineRate*this.extradays;
        System.out.println("The total fine for bookid " + this.bookId + "for" + this.extradays + "days is Rs" + fineRate );
    }
}
