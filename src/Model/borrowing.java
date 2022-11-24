package Model;

public class borrowing {
    int bookid;
    int studentid;
    int extradays;
    int fineRates;

    public borrowing(int bookid, int studentid, int extradays, int fineRates) {
        this.bookid = bookid;
        this.studentid = studentid;
        this.extradays = extradays;
        this.fineRates = fineRates;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getExtradays() {
        return extradays;
    }

    public void setExtradays(int extradays) {
        this.extradays = extradays;
    }

    public int getFineRates() {
        return fineRates;
    }

    public void setFineRates(int fineRates) {
        this.fineRates = fineRates;
    }
    public void calc(){
        double total_fine = this.extradays*this.fineRates;
        System.out.println();

        System.out.println("The total fine for bookid"+"\t"+this.bookid+"\t"+"for"+"\t"+this.extradays+"\t"+"extra days is"+"\t"+total_fine);
    }
}
