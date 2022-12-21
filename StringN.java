import java.util.Scanner;
public class StringN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        if(str.length()<=100 && n>0){
            String N = "";
            for (int i = 0; i < n; i++) {
                N += str;
            }
            System.out.println(N);
        }
    }
}
