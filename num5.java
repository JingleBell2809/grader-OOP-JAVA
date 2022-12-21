import java.util.Scanner ;
public class num5{
   public static void main (String[] atgs){
      Scanner sc = new Scanner(System.in) ;
      System.out.print("Enter a = ") ;
      int a = sc.nextInt() ;
      System.out.print("Enter b = ") ;
      int b = sc.nextInt() ;
      double x = power(a,b) ;
       if(x == -1){
         System.out.println("Out of range") ; 
      }
      else{
         System.out.printf("Answer = %.0f" , x) ;}
   }
   
   static double power (int a , int b){
      if((a > 0 && a < 200) && (b > 0 && b < 200)){
         double result = Math.pow(a,b) ;
         return result ;
      }
      return -1 ;
   }
}