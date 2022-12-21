public class US {
   public static void main(String[] args){

      int five_years = 5*365*24*60*60; // 5years -> sec      
      int birth = five_years/7;         
      int death = five_years/13;     
      int immigrant = five_years/45;
      
      System.out.format("Populations = %d",312032486 + birth - death + immigrant);
   }
}