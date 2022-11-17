// By Kartik Joshi 3932
// Set 4
package K.mainclass.main;
// packing it up in a singel package 
import K.pack.Fabic;
// importing the abstract class from the package 
import java.util.Scanner;
// importing scanner class to scan user inputs 
public class Practicalquestion4a extends Fabic
 {
    
    private 
    int first=0, second=1,third;             
     //values are set to private so  they cant be accesed out of the class

    @Override                               
     //overriding the function createfabisries from the Fabic class
    public void createfabicseries(int y)
    {   
        for(int x=0; x<y;x++)
        {               
            first=second;                          
            //setting the first vlaue of  series as second one
            second=third;                         
             //setting the second value of series as the third one
            third = second+first;                
            //  the next vlaue is equal to the sum of the last two number(first and second)
            System.out.println(third+" ");      
            // output the values of fabinoci series 
        }
    }

    public static void main(String[] args) 
    {
        // the main function
       Fabic obj1 = new Practicalquestion4a();
       // dynamic  method dispatch for obj1
       Scanner scan = new Scanner(System.in);  
       // taking the input value from the user

        System.out.println("Enter n'th number: ");
        obj1.createfabicseries(scan.nextInt());    
        //calling the function createfabicseries from the obj1 referencing
    }
}
// By Kartik Joshi 3932
// Set 4