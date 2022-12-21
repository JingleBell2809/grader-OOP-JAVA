import java.util.Scanner;

public class missnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inx = sc.nextInt();
        int[] arr = new int[inx];
        for(int i=0; i<inx; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<inx; i++){
            for(int j=0; j<inx; j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0; i<inx; i++){
            if(arr[i+1]-arr[i]!=1){
                System.out.printf("%d",arr[i]+1);
            }
        }
    }
    
}
