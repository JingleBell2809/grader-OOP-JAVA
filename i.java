import java.util.Scanner ;
public class i{
   public static void main(String[] atgs){
      Scanner sc = new Scanner(System.in) ;
      int a = sc.nextInt() ;
      int b = sc.nextInt() ;
      int total ;
      if(a>=1 && a<=100){
         if(a == b){
            total = 2*(a+b) ;
         }
         else{
            total = a+b ;
         }
      }
   }
}