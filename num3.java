import java.util.Scanner ;
public class num3{
   public static void main(String[] atgs){
      Scanner sc = new Scanner(System.in) ;
      System.out.print("Enter num1 : ") ;
      int num1,v = sc.nextInt() ;
      System.out.print("Enter num2 : ") ;
      int num2 = sc.nextInt() ;
      int result = sumDouble(num1,num2) ;
      System.out.print(result);
   }
   
   static int sumDouble(int a , int b){     
      if(a == b){
         int total = 2*(a+b) ;
         return total ;
      }
      else{
         int total = a+b ;
         return total ;
      }
   }
}