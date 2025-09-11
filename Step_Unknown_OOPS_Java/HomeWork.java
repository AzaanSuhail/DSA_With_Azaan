import java.util.*;

public class HomeWork {
   public static boolean isLeapYear(int n) {
      return (n % 4 == 0) && (n % 100 != 0 || n % 400 == 0);
   }

   public static void main(String[] args) {
      //Ques A person start saving 100 rs a day from the new year and you have to find how much he saves from new year to your birth date which is String in the format "mm/dd/yyyy"

      String BirthDate = "05/11/2000"; 
      String split[]=BirthDate.split("/");

      int month=Integer.parseInt(split[0]);   //LEARN String.valueOf
      int day=Integer.parseInt(split[1]);   
      int year=Integer.parseInt(split[2]);   

      boolean Check_Year=isLeapYear(year);

      int days_in_months[]={31,28,31,30,31,30,31,31,30,31,30,31}; // 1 2 3 4 5 6 7 8 9 10 11 12

      if(Check_Year){
         days_in_months[1]=29;
      }

      int total_days=0;

      for(int i=0;i<month-1;i++){
         total_days += days_in_months[i];
      }

      total_days += day;

      System.out.println(total_days*100);


   }
}
