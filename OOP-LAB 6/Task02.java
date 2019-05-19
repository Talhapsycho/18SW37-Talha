import java.util.*;
class Book{
	private String name;
	private Author[] authors;
	private double price;
	private int qty;
	  Book(String name,Author[] authors,double price){
    this.name=name;
    this.authors=authors;
     
    this.price=price;
    	}
	  Book(String name,Author[] authors,double price,int qty){
    this.name=name;
    this.authors=authors;
    this.price=price;
    }
    public String getName(){
    	return name;
    }
    public Author[] getauthors(){
    	return authors;
		
    }
    
    public int getqty(){
    	return qty;
    }
    public double getprice(){
    	return price;
    }
    public void setname(String name){
    	this.name=name;
    }
    public void setprice(double price){
    	this.price=price;
    }
    
     
    	  }

class Author{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName(){
		return name;
	}
	public String getemail(){
		return email;
	}
	public char getgender(){
		return gender;
	}
	public void setemail(String email){
		this.email=email;
	}
	public String toString(){
		return "Author=[name="+" "+this.name+" "+"Email"+" "+this.email+" "+"Gender"+" "+this.gender+" "+"]";
	}
}
class Pass_Objects{
	String  name;
	String email;
	char gender;
	Author authors[];
	double price;
	int qty;
	 void Pass_Object1(Book b1,Author a1){
		name=b1.getName();
		email=a1.getemail();
		gender=a1.getgender();
		price=b1.getprice();
		authors=b1.getauthors();
		
		System.out.print( "name"+" "+this.name+" "+"Email"+" "+this.email+" "+"Gender"+" "+this.gender+" "+"Price"+" "+price);
	}

}

class mainclass1{
	public static void main(String talha[]){
Author a1=new Author("Talha","range.cannon@yandex.com",'M');
Author a[]={a1};		
Book b1=new Book("Talha",a,2000,2);
		
		Pass_Objects p1=new Pass_Objects();
		p1.Pass_Object1(b1,a1);
		
	
	}
}