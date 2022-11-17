import java.util.Arrays;
import java.util.Scanner;
public class string2 {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Please enter the line of sentence you want to break in?");
        String sent= a.nextLine();
        System.out.println("Enter the no. of words to be seprated by");
        int i=a.nextInt();
         
        String[] ab= a.split("\\s");
        String[] filterd=filterword(a,ab);
        System.out.println(Arrays.toString(filtered));

        public static String[] filterword(int a,String[] ab)
        {
            
        }
    }
    
}
