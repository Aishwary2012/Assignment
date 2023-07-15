package Q2;

public class BookStore {
    private int noOfBooksInStore;
    private String bookStoreName;
    private Book[] books = new Book[10];

    public BookStore(String bookStoreName,int noOfBooksInStore){
        this.bookStoreName = bookStoreName;
        this.noOfBooksInStore = noOfBooksInStore;
        init();
    }

    public void init(){
        books[0]=new Book("rich dad poor dad", "RK", "54545A12", 10);
        books[1]=new Book("basic physics", "abc", "54595A12", 20);
        books[2]=new Book("pointer in c", "YK", "94545A12", 8);
        books[3]=new Book("head first core java", "foo", "50545A12", 20);
        books[4]=new Book("spring in action", "bar", "14545A12", 10);
    }

    public void sell(String bookTitle,int noOfCopiesReq){
        for(int i=0;i<this.noOfBooksInStore;i++){
            String x = books[i].getBookTitle(books[i]);

            if(x == bookTitle){
                books[i].decNoOfCopies(noOfCopiesReq);
                System.out.println("Book is updated");
                return ;
            }
        }

        System.out.println("Book is not found");
    }

    public void order(String ISBN,int noOfCopies){
        for(int i=0;i<this.noOfBooksInStore;i++){
            String x = books[i].getBookISBN(books[i]);

            if(x == ISBN){
                books[i].incNoOfCopies(noOfCopies);
                System.out.println("Book is updated");
                return ;
            }
        }
        System.out.println("Book is not found");
    }

    public void display(){
        for(int i=0;i<noOfBooksInStore;i++){
            System.out.println(books[i].getBookTitle(books[i]));
            System.out.println(books[i].getBookISBN(books[i]));
            System.out.println(books[i].getBookAuthor(books[i]));
            System.out.println(books[i].getBookNoOfCopies(books[i]));
            System.out.println();

        }

    }

}
