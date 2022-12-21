import java.util.Scanner ;
public class num2{
   public static void main(String[] atgs){
      Scanner sc = new Scanner(System.in) ;
      System.out.print("Enter a : ") ;
      int num1 = sc.nextInt() ;
      System.out.print("Enter b : ") ;
      int num2 = sc.nextInt() ;
      boolean result = makes10(num1,num2) ;
      System.out.print(result);

   }
   
   static boolean makes10(int a , int b){
      if((a == 10 || b == 10) || (a + b == 10))
         return true ;
      else
         return false ; 
   }
}