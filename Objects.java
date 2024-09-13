import java.util.Scanner;
public class Objects{
   Scanner sc = new Scanner(System.in);
   Meaning means = new Meaning();
   
   private String month;
   private int monthnum;
   private int day;
   private int year;
   
   Objects(int monthnum, int day, int year){
      
      this.monthnum=monthnum;
      this.day=day;
      this.year=year;
   }
   
   void Date(){ 
      switch(monthnum){
         case 1:
            month="January";
               if(day>0 && day<20){
                  means.Capricorn();
               }
               if(day>=20 && day<=31){ 
                  means.Aquarius();                  
               }
         break;   
         
         case 2:
            month="February";
               if(day>0 && day<19){
                  means.Aquarius();
               }
               else if(day>=19 && day<=30){ 
                  means.Pisces();                 
               }
         break;     
         
         case 3:
            month="March";
               if(day>0 && day<21){
                  means.Pisces();
               }
               else if(day>20 && day<=31){ 
                  means.Aries();                 
               }
         break; 
         
         case 4:
            month="April";
               if(day>0 && day<20){
                  means.Aries();
               }
               else if(day>=20 && day<=30){ 
                  means.Taurus();               
               }
         break; 
    
         case 5:
            month="May";
               if(day>0 && day<=20){
                  means.Taurus();
               }
               else if(day>20 && day<=31){ 
                  means.Gemini();                 
               }
         break; 
         
         case 6:
            month="June";
               if(day>0 && day<=21){
                  means.Gemini();
               }
               else if(day>=22 && day<=30){ 
                  means.Cancer();                 
               }
         break; 
         
         case 7:
            month="July";
               if(day>0 && day<=22){
                  means.Cancer();
               }
               else if(day>=23 && day<=31){ 
                  means.Leo();                 
               }
         break;
         
         case 8:
            month="August";
               if(day>0 && day<23){
                  means.Leo();
               }
               else if(day>=23 && day<=31){ 
                  means.Virgo();                 
               }
         break;
         
         case 9:
            month="September";
               if(day>0 && day<=22){
                  means.Virgo();
               }
               else if(day>=23 && day<=30){ 
                  means.Libra();                 
               }
         break;   
         
         case 10:
            month="October";
               if(day>0 && day<=23){
                  means.Libra(); 
               }
               else if(day>=24 && day<=31){ 
                  means.Scorpio();                 
               }
         break; 
         
         case 11:
            month="November";
               if(day>0 && day<=21){
                  means.Scorpio();
               }
               else if(day>=22 && day<=30){ 
                  means.Sagittarius();                 
               }
         break; 
         
         case 12:
            month="December";
               if(day>0 && day<=21){
                  means.Sagittarius();
               }
               else if(day>=22 && day<=31){ 
                  means.Capricorn();                 
               }
         break; 
         
         default: System.out.print("wrong input");
      }
   }
   
   //---GETTER METHODS---  
   public String getMonth(){
      return month;
   }
      
   public int getDay(){
      return day;
   }
   
   public int getYear(){
      return year;
   }
   
   
   //---Calc Age---
   void Age(int year){
      int currentYear=2024;
      int age;
      age=currentYear-year;
      System.out.println("You are approximately "+age+" years old");         
   }
}
