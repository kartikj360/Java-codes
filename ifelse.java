import java.util.Scanner;

class ifelse{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the month no. to check the season");
		int month=in.nextInt();
		String season;
		if(month == 12 || month == 1 || month == 2)
			season = "Winter";
		else if(month == 3 || month == 4 || month == 5)
			season = "Spring";
		else if(month == 6 || month == 7 || month == 8)
			season = "Summer";
		else if(month == 9 || month == 10 || month == 11)
			season = "Autumn";
		else
			season = "!! WRONG MONTH ENTERED!!";
		
		System.out.println("Your entered month no is in the "+season+".");
	}
}