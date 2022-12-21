import java.util.Scanner;
public class PointInRectangle{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double x2,y2;
       double x1 = sc.nextDouble();
       double y1 = sc.nextDouble();
       double m = sc.nextDouble();
       double n = sc.nextDouble();
       double x0 = sc.nextDouble();
       double y0 = sc.nextDouble();
       x2 = x1+m;
       y2 = y1+n;
       if(x1 <= x0 &&  x2 >= x0 && y1 <= y0 && y2 >= y0){
         System.out.print("Yes");
       }else{System.out.print("No");}
       
    }
}