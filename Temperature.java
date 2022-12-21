import java.util.Scanner;
public class Temperature {
	public static void main(String[] args) {
      System.out.print("Enter Fahrenheit : ");
		Scanner scan = new Scanner(System.in);
		double Fah = scan.nextDouble();
		double Cel = 5.0/9*(Fah-32);
		System.out.format("%.4f Fahrenheit = %.4f Celsius",Fah,Cel);
	}

}