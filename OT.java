import java.util.Scanner;

public class OT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int salary;
        if(x>=1 && x<=100){
            if(x<=40){
                salary=x*120;
                
            }else{
                salary=4800+((x-40)*20);
            }
            System.out.println(salary) ;
        }
        
    }
}
