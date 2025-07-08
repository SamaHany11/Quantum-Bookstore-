package fawry2;

public class ShowcaseBook extends Book{
	 public ShowcaseBook(String isbn,String title,String author,int year,double price){
	        super(isbn,title,author,year,price);
	    }

	    @Override
	    public boolean is_available(){
	        return false;
	    }

	    @Override
	    public double buy(int quantity,String email,String address){
	        System.out.println("Quantum book store: Showcase books are not for sale");
	        return 0;
	    }
}
