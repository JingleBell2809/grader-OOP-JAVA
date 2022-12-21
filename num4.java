public class num4 {
    public static void main(String[] args) {
        int[] A = {18,3,48,2,18,78,9};
        int[] B = {9,18,3,18,48,2,78};
        System.out.print(Array(A, B));
    }
    static String Array(int[] x , int[] y){
        SortArray(x);
        SortArray(y);
        int check=0;
        for(int i=0; i<x.length; i++){
            if(x[i]==y[i]){
                check++;
            }
        }
        if(check==x.length){
            return "Set A = Set B";
        }else{
            return "Set A != Set B";
        }
    }
    static void SortArray(int[] x){
        for(int i=0 ; i<x.length; i++){
            for(int j=i+1; j<x.length; j++){
                if(x[i]>x[j]){
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }
    
}
