import java.util.Scanner;
public class num8 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1[] = new int[a];
        int s = 1;
        for (int i = 0; i < a; i++) {
            a1[i] = sc.nextInt();
            if (a1[i] > 0) {
                s = s* a1[i];
            }
        }
         System.out.println("The maximum product is "+s);

    }
 }
