import java.util.*;
public class MrsFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inx = sc.nextInt();
        String p = sc.next();
        String first="0";
        String second="1";
        String temp="";
        int count=0;
        for(int i=0; i<inx-1; i++){
            temp = second+first;
            first=second;
            second=temp;
        }
        int M = p.length();
        int N = temp.length();
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++)
                if (temp.charAt(i + j) != p.charAt(j))
                    break;
            if (j == M)
                count++;
        }
        System.out.println(count);
    }
}
