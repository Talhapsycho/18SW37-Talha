import java.util.*;
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
		return "Author=[name="+" "+this.name+" "+"Email"+" "+this.email+" "+"Gender"+" "+this.gender+"]";
	}
}
class mainclass{
	public static void main(String args[]){
		Author a1=new Author("Talha","range.cannon@yandex.com",'M');
	 System.out.print(a1.toString());
	}
}