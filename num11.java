import java.util.Scanner;

public class num11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int theinx = sc.nextInt();
        int[] arr = new int[theinx];
        for(int i=0; i<theinx; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        int sumarr1=arr[0]+arr[arr.length-1];
        int sumarr2=0;
        for(int i=1; i<arr.length-1; i++){
            sumarr2 += arr[i];
        }
        int total = sumarr2 - sumarr1;
        System.out.println(total + " " + sumarr1 + " " + sumarr2);
    }
}
