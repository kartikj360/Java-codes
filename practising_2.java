import java.util.Scanner;
public class practising_2 {
    public static void main(String[] args)
    {
        System.out.println("How many courses have you enrolled in");
        Scanner scan= new Scanner(System.in);
        int x=scan.nextInt();
        int sum=0;
        int[] no= new int[x];
        for(int i=0;i<no.length;i++)
        {
          System.out.println("Enter the marks on"+(i+1)+"course");
          no[i]=scan.nextInt();         
          sum+=no[i];
        }
        int average;
        average=(sum/no.length);
        System.out.println("Your averge is " + average +".");
        if(average>=90)
          System.out.println("You have gained A grade");
          else
            if(average>=70)
               System.out.println("You have gained B grade");
                else 
                  if(average>=50)
                    System.out.println("You have gained C grade");
                     else 
                      if(average>=30)
                       System.out.println("You have gained D grade");
                        else 
                         System.out.println("You have failed");

    }
}