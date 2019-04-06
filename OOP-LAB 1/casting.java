class casting {
    public static void main(String []args){
    	double value=50.25;
    	int value2=(int)value;
    	double value3;
    	value3=(double)(value-value2);
    	System.out.println("The Integral part is:"+value2);
    	System.out.println("The remaining floating part is:"+value3);
    }
}