import java.util.*;
class Matrix{
      public static void main(String talha[]){
       Scanner sc=new Scanner(System.in);
       int array_[][]={{2,3,4},{5,6,7},{7,8,9}};
       int array2_[][]={{4,6,7},{2,3,4},{2,8,9}};
       int[][] result=new int[2][3];
       for(int i=0;i<=array_.length-1;i++){
         
         for(int j=0;j<=array_.length-1;j++){
         	
         	result[i][j]=array_[i][j]+array2_[i][j];
         	System.out.print(result[i][j]+" ");
            
          
         }
         System.out.println();
      
      }

}
}