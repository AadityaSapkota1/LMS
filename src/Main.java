import Model.book;
import Model.borrowing;
import Model.students;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        book book1 = new book("Aaditya","J.K Rowling","13432","2018");
        book book2 = new book("Ankit","Shiva Dhakal","109992","2005");
        book book3 = new book("Sushant","Dilliram Pandey","28990","2093");
        students stud1 = new students("Aaditya","12","8");
        students stud2 = new students("Ankit","12","5");
        students stud3 = new students("Sushant","12","5");
        borrowing borr1 = new borrowing(19,2,3,100);
        borrowing borr2 = new borrowing(23,3,4,190);
        borrowing borr3 = new borrowing(22,90,2,90);

        book1.printFormat();
        stud2.stud();
        borr2.calc();


    }
}