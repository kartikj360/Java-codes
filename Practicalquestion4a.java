

import K.fabi.Fabic;
import java.util.Scanner;

public class Practicalquestion4a extends Fabic {
    
    private int first=0, second=1,third;              //private - cant be access by outside

    @Override                                //overrided the function of abstract 
    public void createfabicseries(int y){   
        for(int x=0; x<y;x++){               
            first=second;                          //Logic of fabi series 
            second=third;                          //next digit = sum of previous two digit
            third = second+first;
            System.out.println(third+" ");      //printing series to console
        }
    }

    public static void main(String[] args) {
       Fabic obj1 = new Practicalquestion4a();       // Using Dynamic method dispatch for f
       Scanner scan = new Scanner(System.in);  // For input taking form user

        System.out.println("Enter n'th number: ");
        obj1.createfabicseries(scan.nextInt());    //Calling the func. and printing output
    }
}