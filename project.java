import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        System.out.println("Hello welcome to the application");
        System.out.println("Please create your password");
        Scanner scan =new Scanner(System.in);
        String pass= scan.next();
        System.out.println("Your password is "+pass);
        System.out.println("Please enter your password");
        String pass1=scan.next();
        while(!pass1.equals(pass))
        {
            System.out.println("Please enter the correct password");
            pass1=scan.next();
        }
        System.out.println("You have enter the correct password");
        System.out.println("Are you hungary?");
       // String pass7= "/n";
        String pass7=scan.next();
        while(!pass7.equals("yes")&& !pass7.equals("no"))
        {
            System.out.println("You have selected the wrong answer,Please enter the correct option");
            pass7=scan.next();

        }
        if(pass7.equals("yes"))
    {
              System.out.println("What would you like to eat between fish,pizza or burger?");
              String pass3=scan.next();
              while(!pass3.equals("fish")&&!pass3.equals("burger")&& !pass.equals("pizza"))
              {
                  System.out.println("We don't have this, Please select the correct option");
                  pass3=scan.next();

              }
              System.out.println("You have selected "+pass3);
              System.out.println("Would you like to drink something yes or no?");
            String pass4=scan.next();
            while(!pass4.equals("yes")&&!pass4.equals("no"))
            {
                System.out.println("You have given invaild output,Please give the correct option");
                pass4=scan.next();

            }
            if(pass4.equals("yes"))
            {
              System.out.println("What would you like to drink between coke and coffe?");
              String pass5=scan.next();
              while(!pass5.equals("coke")&&!pass.equals("coffe"))
              {
                  System.out.println("we don't have this please select other option");
                  pass5=scan.next();

              }
              System.out.println("You have ordered"+pass5);

    }
    else
    {
        System.out.println("You have ordered "+ pass3 +"and"+ pass5);
           System.out.println("Please enter your password to confirm the order");
           String pass6=scan.next();
           while(!pass6.equals(pass))
           {
               System.out.println("Please enter the correct password");
               pass1=scan.next();
           }
           System.out.println("Your order has been placed");
    }
}
    System.out.println("Have a nice day.... :)");
}


}   

