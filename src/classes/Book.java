package fawry2;

public abstract class Book{
	protected String isbn;
    protected String title;
    protected String author;
    protected int year;
    protected double price;
    
    public Book(String isbn,String title,String author,int year,double price){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.year=year;
        this.price=price;
    }
    public String get_Isbn(){
        return isbn;
    }

    public String get_Title(){
        return title;
    }

    public int get_Year(){
        return year;
    }

    public double get_Price(){
        return price;
    }

    public String get_Author(){
        return author;
    }

    public abstract boolean is_available();

    public abstract double buy(int quantity,String email,String address);
}
    

