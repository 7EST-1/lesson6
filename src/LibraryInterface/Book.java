package LibraryInterface;

public class Book {

    private String Title;
    private String Author;
    boolean isavailable;
    boolean borrowed = false;
    boolean canborrow = true;

    Book(String Title, String Author) {
        this.Title = Title;
        this.Author = Author;
    }

    String getTitle() {
        return Title;
    }

    String getAuthor() {
        return Author;
    }
}

class Patron {

    int booksB = 0;

    private String Name;

    Patron(String Name) {
        this.Name = Name;
    }

    String getName() {
        return Name;
    }

    public void borrow() {

    }

    boolean hasBook(Book b) {
        return true;

    }

    boolean returnBook(Book b) {
        booksB--;
        return false;
    }

    boolean borrow(Book b) {
        boolean canborrow = false;
        if (booksB == 3) return canborrow;
        else if (booksB > 4);
            return true;
        }
    }




    
