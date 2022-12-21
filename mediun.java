import java.util.Scanner;

public class mediun {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int inx = sc.nextInt();
            int[] arr = new int[inx*2];
            float med=0;
            for(int i=0; i<inx*2; i++){
                int theip = sc.nextInt();
                arr[i]=theip;
            }
            for(int i=0; i<inx*2; i++){
                for(int j=0; j<inx*2; j++){
                    if(arr[i]<arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            med=(arr[inx-1]+arr[inx]);
            med=med/2;
            System.out.println(med);
        }
}
