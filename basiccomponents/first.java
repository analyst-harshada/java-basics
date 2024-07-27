package basiccomponents;


public class first {


   public static void main(String[] args){


       System.out.println("My First JAVA Program");
      
           System.out.println("Print hello!!");
           System.out.println("Print hello!!");


           // Calling static method
           staticmethod();
           addition();
   }


   public static void staticmethod(){
           System.out.println("this will print static block!");
         
       }
  
   public static void addition(){
           int a = 4;
           int b = 6;
           int sum = a + b;
           System.out.println(sum);
   }
   }
