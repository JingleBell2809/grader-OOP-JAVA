import java.util.*;

public class Max3Odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int first = 0;
        int second = 0;
        int third = 0;
        int odd = 0;
        int i = 0;
        if (n >= 3 && n <= 10000) {
            for (i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            for (i = 0; i < n; i++) {
                if (array[i] % 2 != 0) {
                    if (odd < array[i]) {
                        if (array[i] > first) {
                            third = second;
                            second = first;
                            first = array[i];
                        } else if (array[i] > second) {
                            third = second;
                            second = array[i];
                        } else if (array[i] > third) {
                            third = array[i];
                        }
                    }
                }
            }
        } else {
            System.exit(0);
        }
        if (first != 0 && second != 0 && third != 0) {
            System.out.println(first + " " + second + " " + third);
        } else {
            System.out.println("0");
        }

    }
}
