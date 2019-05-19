import java.util.*;
class Task03{
    int c;
    char n;
    void callmethod(int c,char n){
    	System.out.print("C="+c+" "+"N="+n);
    }
    void callmethod(char n, int c){
    	System.out.print("N="+n+" "+"C="+c);
    }

}
class mainclass{
	public static void main(String talha[]){
    Task03 t=new Task03();
    callmethod(6,'T');
    callmethod('Y',12);
	}
}