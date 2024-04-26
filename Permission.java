
package umrah;
import java.util.Scanner;

public class Umrah {

    public static void main(String[] args) {
   


                      //khadija ali alajmi, s443005840 , group 16

   
   
      System.out.println("welcom");
     Scanner k =new Scanner(System.in); 
     System.out.println("please enter your name:");
      String key=k.nextLine();
      System.out.println("please enter your mobile number:");
       int jg=k.nextInt();
       System.out.println("please if you want doing hajj press 1 or doing umrah press 2: \"choose a number\"");
        int umhj=k.nextInt();
      while(umhj>2||umhj<1) {                          //i use loop for if user enter wrong number
      System.out.println("sorry you enter wrong number \nEnter 1 for hajj enter 2 for umrah:");
      umhj=k.nextInt();
       } 
  
    
        
        
        
        
        
        if(umhj==1){            //if user want to do hajj
         System.out.println("if you saudi press 1, not saudi press 2: \"choose a number\"");
         int rr=k.nextInt();
         while(umhj>2||umhj<1) {                    //if user enter wrong number
      System.out.println("sorry you enter wrong number \nEnter 1 for saudi enter 2 for not saudi:");
      umhj=k.nextInt();
       } 
   
         if(rr==1){    //if he\she saudi just enter id number and print the permission
           System.out.println("please enter your ID number");
          int id=k.nextInt();
          printhyphen();
          int x=(int) (Math.random()*1000000000);
   System.out.println("Permission number:"+x);
   System.out.println(key);
   System.out.println(jg);
   System.out.println("Hajj");
       System.out.println(id);
       printhyphen();
        }
           else if(rr==2) {        //if he\she not saudi he\she will enter visa number and expiration year if expiration year less than 2023 he\she will not get the permission 
            System.out.println("please enter your visa number");     // if he\she visa greater than or equal to 2023 will print the premission
             int visa =k.nextInt();
             System.out.println("please enter your expiratoin year");  
             int expration=k.nextInt();
             boolean exp=isVisaValid(expration);
            
           
   if(exp==true){
      printhyphen();  
    int x=(int) (Math.random()*1000000000);
   System.out.println("Permission number:"+x);
   System.out.println(key);
   System.out.println(jg);
   System.out.println("Hajj");
      System.out.println(visa);  
       printhyphen();
   }
   else{
    System.out.println("sorry your visa unvalid");    
   }          
             
           }
        } 
   
             
             
             
                
         else if (umhj==2){          //if user want to do umrah
          System.out.println("if you saudi enter your ID number please: \nnot saudi enter your iqama/passport number please:");
         int jl=k.nextInt(); 
         
         int UsrIn;

       System.out.println("What weekday you want?\n 1. Sunday\n 2. Monday\n 3. Tuesday\n 4. Wednesday\n 5. Thursday\n 6. Friday\n 7. Saturday\n\"choose a number\"" );
            UsrIn = k.nextInt();
      while(UsrIn>7||UsrIn<1) {                       //if user enter wrong number
       System.out.println("sorry you enter wrong number try again \n 1. Sunday\n 2. Monday\n 3. Tuesday\n 4. Wednesday\n 5. Thursday\n 6. Friday\n 7. Saturday:");
      UsrIn=k.nextInt();
        } 
 
            int day = UsrIn;

            String weekday;             // i use switch to select day which he\she prefers
            switch (day) {
                case 1:  weekday = "Sunday";
                         break;
                case 2:  weekday = "Monday";
                         break;
                case 3:  weekday = "Tuesday";
                         break;
                case 4:  weekday = "Wednesday";
                         break;
                case 5:  weekday = "Thursday";
                         break;
                case 6:  weekday = "Friday";
                         break;
                case 7:  weekday = "Saturday";
                         break;      
            
                default: weekday = "Invalid month";
                         break;
            }
            
         
            int goh;

       System.out.println("What time you prefer?\n 1. 6:00 - 9:00\n 2. 9:00 - 12:00\n 3. 12:00 - 15:00\n 4. 15:00 - 18:00y\n 5. 18:00 - 21:00\n 6. 21:00 - 24:00 \"choose a number\"");
            goh = k.nextInt();
       while(goh>6||goh<1){                          //if user enter wrong number
       System.out.println("sorry you enter wrong number try again \n 1. 6:00-9:00\n 2. 9:00-12:00\n 3. 12:00-15:00\n 4. 15:00-18:00y\n 5. 18:00-21:00\n 6. 21:00-24:00");
     goh=k.nextInt();
        } 
 
            int time = goh;

            String weeday;     // i use switch to select time which he\she prefers
            switch (time) {
                case 1:  weeday = "6:00 - 9:00";
                         break;
                case 2:  weeday = "9:00 - 12:00";
                         break;
                case 3:  weeday = "12:00 - 15:00";
                         break;
                case 4:  weeday = "15:00 - 18:00";
                         break;
                case 5:  weeday = "18:00 - 21:00";
                         break;
                case 6:  weeday = "21:00 - 24:00";
                         break;      
            
                default: weeday = "Invalid time";
                         break;
            }
            
            System.out.println("Do you need wheel chair?\n 1. Yes 2. No \"choose a number\"");
            int uk=k.nextInt();
            while(uk>2||uk<1){                   //if user enter wrong number
       System.out.println("sorry you enter wrong number \nEnter 1 for Yes enter 2 for No:");
       uk=k.nextInt();
        } 
            
            if(uk==1){

                                // here will print the permission if he\her choose wheelchair
      int[]kh=Needwheelchair();
      System.out.println("Total price in SR("+kh[3]+")");
      int y=(int) (Math.random()*1000000000);
   System.out.println("Permission number:"+y);
    System.out.println(key);
   System.out.println(jg);
   System.out.println("Umrah");
   System.out.println(jl);
   System.out.println(weekday);
   System.out.println(weeday);
   
   printhyphen();
         } 
                 
           else{                             // here will print the permission without wheelchair
           int y=(int) (Math.random()*1000000000);
   System.out.println("Permission number:"+y);
    System.out.println(key);
   System.out.println(jg);
   System.out.println("Umrah");
   System.out.println(jl);
   System.out.println(weekday);
   System.out.println(weeday);  
             
     }
              
            
    
        }
    }
    
    
    public static boolean isVisaValid (int c) {   // to see the visa is valid or not
     
        if(c>=2023){
    
         return true;}
        else  {  
        return false;
        }
    }
    
    public static int[] Needwheelchair (){
    Scanner k=new Scanner(System.in);     //in this method i ask the user about wheelchair in detail and store it in array
  int[] array=new int[4];
  System.out.println("what type of wheelchair you like? \"choose a number\"");
   System.out.println("1. Manual with assistant \n2. Eclectic");
   int s=k.nextInt();  
     while(s>2||s<1) {                              //if user enter wrong number
       System.out.println("sorry you enter wrong number \nEnter 1 for manual enter 2 for eclectic: ");
       s=k.nextInt();
        } 
   array[0]=s;
   
      System.out.println("how many seats of wheelchair you like? \"choose a number\"");
   System.out.println("3. One seat \n4. Two seat");
   int t=k.nextInt();
   
    while(t>4||t<3) {                               // if user enter wrong number
       System.out.println("sorry you enter wrong number \nEnter 3 for one seat enter 4 for two seat:");
       t=k.nextInt();
        } 
   array[1]=t;
   
   
   System.out.println("where to use? \"choose a number\"");
   System.out.println("5. tawaf \n6. sai \n7. both");
   int d=k.nextInt();
    while(d>7||d<5) {                               //if user enter wrong number
       System.out.println("sorry you enter wrong number \nEnter 5 for tawaf enter 6 for sai enter 7 for both:");
      d=k.nextInt();
        }
   array[2]=d;
   
   printhyphen();
   
 if(s==1&t==3&d==5){            // i use "if" to put value of array in index [3] to put total price depending on the user choices with wheelchair detail
  System.out.println("Manual\tOne seat\tTawaf");
  array[3] =150;
   
   }
 else if(s==1&t==3&d==6){
      System.out.println("Manual\tOne seat\tSai");
     array[3] =100;  
    }
 else if(s==1&t==3&d==7) {
      System.out.println("Manual\tOne seat\tBoth Tawaf&Sai");
     array[3]=250;
 }  
 else if(s==2&t==3&d==5) {
      System.out.println("Eclectic\tOne seat\tTawaf");
     array[3]=50;
 }  
 else if(s==2&t==3&d==6) {
      System.out.println("Electic\tOne seat\tSai");
     array[3]=50;
 }
 else if(s==2&t==3&d==7) {
      System.out.println("Electic\tOne seat\tBoth Tawaf&Sai");
     array[3]=100;
 } 
else if(s==2&t==4&d==5) {
     System.out.println("Eclectic\tTwo seat\tTawaf");
     array[3]=100;
 } 
 else if(s==2&t==4&d==6) {
      System.out.println("Eclectic\tTwo seat\tSai");
     array[3]=100;
 } 
else {
      System.out.println("Eclectic\tTwo seat\tBoth Tawaf&Sai");
     array[3]=200;
 }   
    
    
    
        return array;
    }  
    
    public static void printhyphen(){           //to print hyphen for desgin
        
     System.out.println("----------------------------------");
            
        
    }
    
    
    
    
}
   
    
    

