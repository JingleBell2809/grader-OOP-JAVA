import java.util.Scanner;

public class num10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
//            System.out.print("stored energy of element "+(i+1)+"= ");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int h=n;
        for(int i=0;i<n/2;i++)
        {
            int max=0,N1=0,N2=0;
            if(h>1)
            {
                for(int j=0;j<h-1;j++)
                {
                    int buff=arr[j]-arr[j+1];
                    if(buff<0)
                    {
                        buff=buff*(-1);
                    }
                    if(buff>max)
                    {
                        max=buff;
                        N1=j;
                        N2=j+1;
                    }
                }
                sum+=max;
                for(int k=0;k<n-N2-1;k++)
                {
                    arr[N1]=arr[N1+2];
                    N1++;
                }
                arr[N1]=0;
                arr[N1+1]=0;
                h=h-2;
            }
            
        }
        System.out.println(sum);
    }
    
}
