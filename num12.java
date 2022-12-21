import java.util.Scanner;
import java.util.Arrays;
public class num12{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c_even=0;
        int c_odd=0;
        int j=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                c_even+=1;
            }
            else if(arr[i]%2==1){
                c_odd+=1;
            }
        }
        int[] s = new int[c_even];
        int[] t = new int[c_odd];
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                s[j]=arr[i];
                j++;
            }
        }
        j=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                t[j]=arr[i];
                j++;
            }
        }
        Arrays.sort(s);
        Arrays.sort(t);
        int size_new = c_even + c_odd;
        int[] rev_s = new int[c_even];
        j=c_even;
        for(int i=0;i<c_even;i++) {
            rev_s[j-1]=s[i];
            j=j-1;
        }
        int[] A = new int[size_new];
        System.arraycopy(t, 0, A, 0, c_odd);
        System.arraycopy(rev_s, 0, A, c_odd, c_even);
        for(int i=0;i<size_new;i++){
            System.out.print(A[i] + " ");
        } 
    }
}