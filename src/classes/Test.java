package fawry2;
import java.time.LocalDate;
public class Test {

	public static void main(String[] args) {
		

		Inventory inventory=new Inventory();

        Book paperBook=new PaperBook("P001","Java Fundamentals","Sama Hany",2015,150,5);
        Book ebook=new EBook("E001","Learn Python","Aysel Hany",2022,100,"PDF");
        Book showcase=new ShowcaseBook("S001","Design Patterns Showcase","GOF",2010,0);

          inventory.addBook(paperBook);
        inventory.addBook(ebook);
        inventory.addBook(showcase);

        inventory.buyBook("P001",2,"customer@email.com","Nasr City");
        inventory.buyBook("E001",1,"reader@email.com","fayoum");
        inventory.buyBook("S001",1, "user@email.com","giza");
        inventory.buyBook("B999",1,"host@email.com","cairo");

        inventory.removeOutdatedBooks(8);
    }

	}


