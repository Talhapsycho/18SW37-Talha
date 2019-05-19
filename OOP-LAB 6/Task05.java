class Student{
   String  name;
   static int age;
   String address;
   // int count=214;
   String  [] student={"Yasir","Talha","Saad","Mohammad moiz","jawad","Inayat","Umesh","Avinash"};

    void setinfo(String name,int age){
   	 this.name=name;
   	 this.age=age;
   	 for(int i=0;i<=student.length-1;i++){
      System.out.print(i+"="+student[i]+age+"");
      System.out.println();
   	 }
   }
   void setinfo(String name,int age,String address){
   	 this.name=name;
   	 this.age=age;
   	 this.address=address;
   	 int count=214;	
   	 for(int i=0;i<=student.length-1;i++){
   	 	
        System.out.print(i+"="+student[i]+" "+"Age="+age+" "+"Address="+" "+address+" "+count);
        count=count+1;
        System.out.println();
        
   	 }
   }
}
class mainclass{
	public static void main(String talha[]){
		Student s1=new Student();
		// s1.setinfo("Talha",18);
		s1.setinfo("Talha",18,"MUET Sheikh Sindhi");
	}
}