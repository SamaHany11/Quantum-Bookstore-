package fawry2;
import java.time.Year;
import java.util.*;

public class Inventory{
	 private Map<String,Book>books;

	    public Inventory(){
	        books=new HashMap<>();
	    }
	    public void addBook(Book book){
	        books.put(book.get_Isbn(),book);
	        System.out.println("Quantum book store: Book added – " +book.get_Title());
	    }

	    public List<Book>removeOutdatedBooks(int maxYears){
	        List<Book>removedBooks=new ArrayList<>();
	        int currentYear=Year.now().getValue();

	        Iterator<Map.Entry<String,Book>>iterator=books.entrySet().iterator();

	        while(iterator.hasNext()){
	            Map.Entry<String,Book>entry=iterator.next();
	            Book book=entry.getValue();
	            if(currentYear-book.get_Year()>maxYears){
	                removedBooks.add(book);
	                iterator.remove();
	                System.out.println("Quantum book store: Removed outdated book – " +book.get_Title());
	            }
	        }

	        return removedBooks;
	    }

	    public double buyBook(String isbn,int quantity,String email,String address){
	        Book book=books.get(isbn);
	        if(book==null){
	            System.out.println("Quantum book store: Book with ISBN "+isbn+" not found");
	            return 0;
	        }

	        if(!book.is_available()){
	            System.out.println("Quantum book store: Book is not available for sale");
	            return 0;
	        }

	        return book.buy(quantity,email,address);
	    }
}
