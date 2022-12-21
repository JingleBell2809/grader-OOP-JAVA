import java.util.Scanner;
class Runner { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] time = new float[10];
        int[] id = new int[10];
        int p1 = 0 , p2 = 0 , p3 = 0;
        double time1 = 21 , time2 = 21 , time3 = 21;
        for(int i=1;i<=10;i++){
            System.out.print("ID Runner " + (i) + " : ");
            id[i-1]=sc.nextInt();
            System.out.print("Time Runner " + (i) + " : ");
            time[i-1]=sc.nextFloat();
            if(time[i-1] >20.00) {
                System.out.println("Time must lower than 20 seconds");  
            }
        }
        for(int i=1;i<=10;i++) {
            if(time[i-1]<time1) {
                time3=time2;
                time2=time1;
                time1=time[i-1];
                p1=id[i-1];
            }
            else if(time[i-1]<time2) {
                time3=time2;
                time2=time[i-1];
                p2=id[i-1];
            }
            else if(time[i-1]<time3) {
                time3=time[i-1];
                p3=id[i-1];
            }
        }
        System.out.println("First is " + p1 + " and Time is " + time1);
        System.out.println("Second is " + p2 + " and Time is " + time2);
        System.out.println("Third is " + p3 + " and Time is " + time3);
    }
}