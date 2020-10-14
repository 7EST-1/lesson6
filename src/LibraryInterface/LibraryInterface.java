package LibraryInterface;

public class LibraryInterface {

    public static void main(String[] args) {
        Book b1, b2, b3, b4, b5;
        b1 = new Book("From Russua With Love", "Greg Hines");
        b2 = new Book("Living Smart", "Rita Langill");
        b3 = new Book("Singing In The Rain", "Harry Conner");
        b4 = new Book("Good Housekeeping", "Pat Burns");
        b5 = new Book("To Be a Model", "Lisa Lahey");
        System.out.println("Here are the books available: ");
        System.out.format("%s by: %s\n",b1.getTitle(), b1.getAuthor());
        System.out.format("%s by: %s\n",b2.getTitle(), b2.getAuthor());
        System.out.format("%s by: %s\n",b3.getTitle(), b3.getAuthor());
        System.out.format("%s by: %s\n",b4.getTitle(), b4.getAuthor());
        System.out.format("%s by: %s\n",b5.getTitle(), b5.getAuthor());
        System.out.println("=================================\n");
        Patron p = new Patron("Miles Davis");
        
        
        System.out.println("=================================\n");

        //lend books out
        System.out.println("Lending 3 books to " + p.getName());
        if (p.borrow(b1)) {
            System.out.println(b1.getTitle() + " successfully borrowed");
        } else {
            System.out.println(b1.getTitle() + " could not be borrowed");
        }

        if (p.borrow(b2)) {
            System.out.println(b2.getTitle() + " successfully borrowed");
        } else {
            System.out.println(b2.getTitle() + " could not be borrowed");
        }

        if (p.borrow(b3)) {
            System.out.println(b3.getTitle() + " successfully borrowed");
        } else {
            System.out.println(b3.getTitle() + " could not be borrowed");
        }
        if (p.borrow(b4)) {
            System.out.println(b4.getTitle() + " successfully borrowed");
        } else {
            System.out.println(b4.getTitle() + " could not be borrowed");
        }

       

        //return books
        System.out.println("------\nAttempting to return the first book:\n--------------");
        if (p.returnBook(b1)) {
            System.out.println(b1.getTitle() + "successfully returned.");
        } else {
            System.out.println(b1.getTitle() + "was not borrowed out.");
        }
        if (p.returnBook(b2)) {
            System.out.println(b2.getTitle() + "successfully returned.");
        } else {
            System.out.println(b2.getTitle() + "was not borrowed out.");
        }
        if (p.returnBook(b3)) {
            System.out.println(b3.getTitle() + "successfully returned.");
        } else {
            System.out.println(b3.getTitle() + "was not borrowed out.");
        }
        if (p.returnBook(b4)) {
            System.out.println(b4.getTitle() + "successfully returned.");
        } else {
            System.out.println(b4.getTitle() + "was not borrowed out.");
        }
       
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("----\nHere is a list of books currently lent to " + p.getName() + "\n----");
        if (p.hasBook(b1)) {
              System.out.format("%s by: %s\n",b1.getTitle(), b1.getAuthor());
        }
        if (p.hasBook(b2)) {
              System.out.format("%s by: %s\n",b2.getTitle(), b2.getAuthor());
        }
        if (p.hasBook(b3)) {
              System.out.format("%s by: %s\n",b3.getTitle(), b3.getAuthor());
        }
    }
}
