public class Book {
    String title;
    String author;
    int year;

    //Constructor
    Book(String title , String author , int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //mehtod to display book details //captalize labels for eg. "Title:" ✔️ and not "title:"
    void displayBookDetails(){
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Year:" + year);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Atmoic Habbits" , "john " , 2012);
        b1.displayBookDetails();

        Book b2 = new Book("Alice & wonderlands" , "Alfred" , 2002);
        b2.displayBookDetails();
    }
}
