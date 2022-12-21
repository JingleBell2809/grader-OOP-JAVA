import java.util.Scanner;
class swap{
    static void SWAP(int x,int arr[])
    {
        int buff=arr[0];
        arr[0]=arr[x-1];
        arr[x-1]=buff;
        for(int j=0;j<x;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
   
}
public class test11_7 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       swap a = new swap();
       int num=sc.nextInt();
       int Arr[]=new int[num];
       for(int i=0;i<num;i++)
       {
           Arr[i]=sc.nextInt();
       }
       a.SWAP(num,Arr);
    }
}
