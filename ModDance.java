import java.util.Scanner;
public class ModDance {
    public static void main(String[] args) {
       double x=0,y=0,nn;
       Scanner sc = new Scanner(System.in);
       double n = sc.nextDouble();
       for(int i = 0; i<n ; i++){
         nn = sc.nextDouble();
         if(nn%4==1){
            y+=1;
         }else if(nn%4==2){
            x-=1;
         }else if(nn%4==3){
            x+=1;
         }else if(nn%4==0){
            y-=1;
         }
       }
       double x1 = sc.nextDouble();
       double y1 = sc.nextDouble();
       System.out.format("%.0f %.0f",x+x1,y+y1);
       
    }
}