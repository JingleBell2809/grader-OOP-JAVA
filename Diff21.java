import java.util.Scanner;
public class Diff21 {
   public static void main(String[] args) {
      int ans;
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if(a >= 21){
   		ans = (a-21)*2 ;
   		System.out.print(ans) ;}
	   else{
   		ans = 21-a ;
   		System.out.print(ans) ;}
   }
}