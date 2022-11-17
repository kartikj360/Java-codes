// By Kartik Joshi 3932
// Set B
import java.util.Scanner;  
// importing the package for sacnner class
public class Practicalquestion4b
 {  
   public static void main(String[] args)
    {  
    //    main class 
      Scanner scan = new Scanner(System.in);  
    //   scanner class object from java.util.Scanner package
       System.out.print("Enter the number : ");  
       int input = scan.nextInt();  
    //    inputting the value from the user
       int start=1;
    //    setting the starting value as 1
       System.out.println("List of prime numbers between " + start + " and " + input);  
       for (int i = start; i <= input; i++) 
       {  
            //    loop to check all the numbers between start and end are prime or not
           if (checkPrime(i)) { 
           
               System.out.println(i); 
            //    if they are prime then printing out the number 
           }  
       }  
   }  
   public static boolean checkPrime(int y)
    {  
        // a bool valued function to check number is prime or not
       if (y <= 1) {  
        //    if the number is less then 1 then it will return false for the if then else statement
                   return false;  
       }  
       for (int x = 2; x <= Math.sqrt(y); x++)
        {  
            // finding the nearest squareroot value of n
           if (y % x == 0)
            {  
               return false; 
            //    checking the condition where we find the nearest square root of the number 
            //    and then dividing the number by all the prime numbers from 2 to nearest squareroot value of end
           }  
       }  
       return true; 
    //    proved that the number is a prime 
   }  
//    the return value provided by this boolean funtion will serve as a vale for the the first if then else in main
}
// By Kartik Joshi 3932
// Set 4