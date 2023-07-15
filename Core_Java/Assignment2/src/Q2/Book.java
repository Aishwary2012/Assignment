package Q2;

public class Book {
    private String bookTitle,author,ISBN;
    private int noOfCopies;

    public Book(String bookTitle,String author,String ISBN,int noOfCopies){
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.author = author;
        this.noOfCopies = noOfCopies;
    }


    public void display(){
        System.out.println(this.bookTitle+" "+this.author+" "+this.ISBN+" "+this.noOfCopies);
    }

    public String getBookTitle(Book b){
        return b.bookTitle;
    }

    public String getBookISBN(Book b){
        return b.ISBN;
    }

    public String getBookAuthor(Book b){
        return b.author;
    }

    public int getBookNoOfCopies(Book b){
        return b.noOfCopies;
    }

    public void decNoOfCopies(int x){
        this.noOfCopies-=x;
    }

    public void incNoOfCopies(int x){
        this.noOfCopies+=x;
    }

}
