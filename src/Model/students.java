package Model;

public class students {
    String name;
    String clas;
    String book_borrowed;

    public students(String name, String clas, String book_borrowed) {
        this.name = name;
        this.clas = clas;
        this.book_borrowed = book_borrowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getBook_borrowed() {
        return book_borrowed;
    }

    public void setBook_borrowed(String book_borrowed) {
        this.book_borrowed = book_borrowed;
    }
    public void stud(){
        System.out.println("This Student"+"\t"+this.name+"\t"+"of class"+"\t"+this.clas+"\t"+"has"+"\t"+this.book_borrowed+"\t"+"books borrowed");
    }
}

