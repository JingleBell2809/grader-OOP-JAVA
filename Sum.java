import java.util.Scanner;
class Sum { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        double sum = 0;
        for(int i=n;i>=1;i--){
            sum += (Math.pow(x,i))/i;
        }
        System.out.println(sum);
    }
}