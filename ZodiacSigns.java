import java.util.Scanner;

public class ZodiacSigns{
   public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
          
      int day;
      int year;
      String name;
      int monthnum;
      String repeat;
      
      do{
         System.out.print("Enter your name please: ");
         name=sc.next();
         
         System.out.println("Hello "+name+"! please enter your birth date... ");
         
         System.out.print("Enter your birth month: ");
         monthnum=Check();

         System.out.print("Enter your birth day: ");
         day=Check();
            
         System.out.print("Enter your birth year: ");
         year=Check();
         
         Objects obj = new Objects(monthnum, day, year);
         obj.Age(year);
         obj.Date(); 
         System.out.println("You inputted "+obj.getMonth()+" "+obj.getDay()+" "+obj.getYear()+" and");
         
         System.out.print(" Do you want to try again? Yes or No? ");
         repeat=sc.next();
         
      }while(repeat.equalsIgnoreCase("YES"));
   }
     
   //---CHECKER METHOD---
      public static int Check(){
         Scanner sc = new Scanner(System.in); 
            while(!sc.hasNextInt()){    
               if(!sc.hasNextInt()) {
                  System.out.println("Invalid Input.");               
                  System.out.print("Please answer using integers only: ");
                  sc.next();
               }     
            }
         int x=sc.nextInt();
         return x;             
      }
}