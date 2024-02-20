import java.util.Scanner;
public class DayOfWeek{
    public static void checkDayOfWeek(int dayNumber) {
    	
    	
    	if(dayNumber == 1)
    	{
    		System.out.println("The corresponding day of the week is: Monday");
    	}
    	
    	else if (dayNumber == 2)
    	{
    		System.out.println("The corresponding day of the week is: Tuesday");
    	
    	}
    	
    	else if (dayNumber == 3)
    	{
    		System.out.println("The corresponding day of the week is: Wednesday");
    	}
    	
    	else if (dayNumber == 4)
    	{
    		System.out.println("The corresponding day of the week is: Thursday");
    	}
    	
    	else if (dayNumber == 5)
    	{
    		System.out.println("The corresponding day of the week is: Friday");
    	}
    	
    	else if (dayNumber == 6)
    	{
    		System.out.println("The corresponding day of the week is: Saturday");
    	}
    	
    	else if (dayNumber == 7)
    	{
    		System.out.println("The corresponding day of the week is: Sunday");
    	}
    	
    	else 
    	{
    		System.out.println("The corresponding day of the week is: Invalid Day Number");
    	}
    	
    	
    	
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number (1 to 7): ");
        int dayNumber = scanner.nextInt();
        checkDayOfWeek(dayNumber);
		scanner.close();
    }
}
