import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dang
 */
public class Library {

    private ArrayList<Book> Books;

    public Library() {
        this.Books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        Books.add(newBook);
    }

    public void printBooks() {
        for (Book each : Books) {
            System.out.println(each);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found
        for (Book each : Books) {
            if(StringUtils.included(each.title(), title)) {
                found.add(each);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found
        for (Book each : Books) {
            if (StringUtils.included(each.publisher(), publisher)) {
                found.add(each);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found
        for (Book each : Books) {
            if (each.year()==year) {
                found.add(each);
            }
        }
        return found;
    }

}
