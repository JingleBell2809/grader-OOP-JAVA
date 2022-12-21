import java.util.Scanner ;
class num6{

       int arryCount9(int[] ar,int n){
       int count=0;
       for(int i=0;i < n;i++)
        {
          if(ar[i] == 9)
          {
            count += 1;
          }
        }
      return count;
    }
}
class as8_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("n : ") ;
        int n = sc.nextInt();
        
        int[] ar = new int[n] ;
        System.out.print("arryCount9{}: ") ;
        for(int i = 0 ; i < n ; i++){
            ar[i] = sc.nextInt() ;
        }
        num6 x = new num6();
        int y = x.arryCount9(ar,n);
        System.out.println(y) ;

    }
}
