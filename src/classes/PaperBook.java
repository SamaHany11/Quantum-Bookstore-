package fawry2;

public class PaperBook extends Book{
	  private int stock;
	  public PaperBook(String isbn,String title,String author,int year,double price,int stock){
	        super(isbn,title,author,year,price);
	        this.stock=stock;
	    }
	  
	  @Override
	    public boolean is_available(){
	        return stock>0;
	    }

	    @Override
	    public double buy(int quantity,String email,String address){
	        if(quantity<=stock){
	            stock-=quantity;
	            double total=price*quantity;
	            System.out.println("Quantum book store: Paper book purchased. Total = " +total);
	            System.out.println("Quantum book store: Sent to ShippingService at address: " +address);
	            return total;
	        }
	        else{
	            System.out.println("Quantum book store: Not enough stock for ISBN " +isbn);
	            return 0;
	        }
	    }

	   public int getStock(){
	        return stock;
	    }
	}

