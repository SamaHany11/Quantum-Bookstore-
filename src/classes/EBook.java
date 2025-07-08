package fawry2;

public class EBook extends Book{
	 private String fileType;

	    public EBook(String isbn,String title,String author,int year, double price,String fileType){
	        super(isbn,title,author,year,price);
	        this.fileType=fileType;
	    }

	    @Override
	    public boolean is_available(){
	        return true;
	    }

	    @Override
	    public double buy(int quantity,String email,String address){
	        double total=price*quantity;
	        System.out.println("Quantum book store: EBook purchased. Total = " +total);
	        System.out.println("Quantum book store: Sent to MailService at email: " +email + " as " + fileType +" file");
	        return total;
	    }

	    public String getFileType(){
	        return fileType;
	    }
}
