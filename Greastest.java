import java.util.*;
class Greastest {
    static int gcd(int a, int b) {
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
    static int fgcd(int[] a, int n) {
        int result = 0;
        for(int i=0; i<n; i++){
            result = gcd(result, a[i]);
            if(result == 1){
                return 1;
            }
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
        int ans = fgcd(a, n);
        System.out.println(ans);
    }
}