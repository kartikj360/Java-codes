import java.util.Scanner;
//3912 Pushpender labwork june 05 2021
class box{
    double height;
    double breadth;
    double length;

    //parameterised contructor
    box(double l,Double b,Double h){
        length=l;
        breadth=b;
        height=h;
    }
    //default constructor
    box(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of box :- ");
        height=in.nextFloat();
        System.out.println("Enter the breadth of box :- ");
        breadth=in.nextFloat();
        System.out.println("Enter the length of box :- ");
        length=in.nextFloat();
    }
    //volume method defined
    double volume(){     
        double volume=length*breadth*height;
        return volume;                                    //returning a value
    }
}
public class labworkjune05 {
    public static void main(String[] args) {
        box b1=new box(11.5,12.6,19.58);          //parameterised constructor called
        box b2=new box();
        
        //default constructor automatically called
        
        System.out.println("\n\nVolume of box b1 :- ");
        System.out.print(b1.volume());                                       //volume method called

        System.out.println("\n\nVolume of box b2 :- ");
        System.out.print(b2.volume());                                    //volume method called
    }
}
