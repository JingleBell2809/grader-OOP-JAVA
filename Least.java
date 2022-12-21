import java.util.*;
class Least {
    static int gcd(int a, int b) {
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
    static int flcm(int[] a, int n) {
        int result = 1;
        for(int i=0; i<n; i++){
            result = (result / gcd(result, a[i])) * a[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int ans = flcm(a, n);
        System.out.println(ans);
    }
}