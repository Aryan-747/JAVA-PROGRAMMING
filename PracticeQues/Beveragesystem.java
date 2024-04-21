import java.util.Scanner;

class Beverage
{
	void orderBeverage()
	{
		System.out.println("Ordering a beverage");
	}
	
}

class Coffee extends Beverage
{
	String type;
	String size;
	
	void orderBeverage()
	{
		Scanner myscan = new Scanner(System.in);
		System.out.print("Coffee type: ");
		type = myscan.nextLine();
		System.out.print("size of the coffee: ");
		size = myscan.nextLine();
		
		System.out.println("Ordered Coffee Details:");
		System.out.println("Coffee Type: " + type);
		System.out.println("Size: " + size);

		
	}
}

class Tea extends Beverage
{
	String type;
	String sweetness;
	
	void orderBeverage()
	{
		Scanner myscan = new Scanner(System.in);
		System.out.print("Tea type: ");
		type = myscan.nextLine();
		System.out.print("Sweetness level: ");
		sweetness = myscan.nextLine();
		
		System.out.println("Ordered Tea Details:");
		System.out.println("Tea Type: " + type);
		System.out.println("Sweetness Level: " + sweetness);

	}
}
		

public class Beveragesystem {
    public static void main(String[] args) {
        Beverage beverage = new Beverage();
        beverage.orderBeverage();

        Coffee coffee = new Coffee();
        coffee.orderBeverage();

        Tea tea = new Tea();
        tea.orderBeverage();
    }
}