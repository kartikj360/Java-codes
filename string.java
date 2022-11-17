import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Array;
import java.util.Arrays;

public class string {
    public static void main(String[] args) {
    
        // System.out.println(Integer.toBinaryString(-3));
        
        // BigDecimal new4 = BigDecimal.valueOf(20).setScale(2);
        // BigDecimal new2 = BigDecimal.valueOf(3);
        // BigDecimal new3 = new4.divide(new2, RoundingMode.HALF_UP);     
        // System.out.println(new3);  
        // double new6=3.1;
        // double new7=1.94;
         
        // System.out.println(new6-new7);
        // BigDecimal d= BigDecimal.valueOf(3.1);
        // BigDecimal d1=  BigDecimal.valueOf(1.94);
        // System.out.println(d.subtract(d1));
        // System.out.println(1/0);
        // System.out.println((int)(Math.random()));
        String s =" Kartik ";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.endsWith("\t"));
        System.out.println(s.startsWith(" "));
        System.out.println(s.replaceAll("Kar", "car"));
        System.out.println(s.substring(1,3));
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(Arrays.toString(s.split("r")));

       
    }
    
}
