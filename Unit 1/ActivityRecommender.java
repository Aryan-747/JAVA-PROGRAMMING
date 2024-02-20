import java.util.Scanner;
public class ActivityRecommender {

    // Method to recommend outdoor activity based on weather and user preferences
    public static void recommendOutdoorActivity(String weather, String activityPreference) {
	
	String su = "sunny";
	String ru = "rainy";
	String sn = "snowy";
	
	String act = "active";
	String rel = "relaxed";
	
	
	if(weather.equals(su) && activityPreference.equals(act))
	{
		System.out.println("Hiking");
	}
	
	else if (weather.equals(su) && activityPreference.equals(rel))
	{
		System.out.println("Picnic");
	}
	
	else if (weather.equals(ru) && activityPreference.equals(act))
	{
		System.out.println("Play board games indoors");
	}
	
	else if (weather.equals(ru) && activityPreference.equals(rel))
	{
		System.out.println("Read a book indoors");
	}
	
	else if (weather.equals(sn) && activityPreference.equals(act))
	{
		System.out.println("Skiing");
	}
	
	else if( weather.equals(sn) && activityPreference.equals(rel))
	{
		System.out.println("Build a snowman");
	}
	
	else
	{
		System.out.println("Invalid weather conditions.");
	}



    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current weather conditions (sunny/rainy/snowy): ");
        String weather = scanner.nextLine();
        System.out.print("Enter your activity preference (active/relaxed): ");
        String activityPreference = scanner.nextLine();
        recommendOutdoorActivity(weather, activityPreference);

        scanner.close();
    }
}

