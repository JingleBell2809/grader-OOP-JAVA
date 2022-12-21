public class runner1{
   public static void main(String[] args){
         
      int dis = 14;
      double time = ((30.0/60.0)+45)/60;   // convert to hour      
      double speed_kilo = dis/time;  // speed in kilometers     
      double speed_miles = speed_kilo/1.6;  // convert to miles      
      
      System.out.format("Speed = %f miles/hour",speed_miles);
   }

}