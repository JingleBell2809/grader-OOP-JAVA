import java.util.Scanner;
public class StringMN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (str.length() < 100 && n > 0 && m > 0) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(str.charAt(j));
                }
            }
        }
    }

}
