import java.util.Scanner;
public class godnice {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     	  float total = 0 , a=0 ;
        System.out.print("Enter month : ");
     	  int month = sc.nextInt();
   	  for(int i=1 ; i<=month ; i++)
   	  {
      	 total=(float)((100+a)*(1.00417));
      	 a = 0 ;
       	 a += total ;
   	  }
   	 System.out.printf("Amount = %.3f" , total) ;    }
}