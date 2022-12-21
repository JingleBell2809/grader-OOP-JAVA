import java.util.Scanner;

public class TenOrSumTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inx = sc.nextInt();
        int iny = sc.nextInt();
        System.out.println(TenOrSumTen(inx, iny));
    }
    static String TenOrSumTen(int x , int y){
        if(x==10 || y==10 || x+y == 10){
            return "True";
        }else{
            return "False";
        }
    }
}
