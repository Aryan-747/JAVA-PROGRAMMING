import java.util.Scanner;

class Product1
  {
    String productName;
    int quantity;
    
    void inputProductDetails()
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter product name: ");
			productName = scanner.nextLine();

			scanner.close();
		}
		
		void displayQuantity()
		{
			System.out.println("Current Quantity: " + quantity);
		}
	}
	
class Purchase extends Product1
	{
		int purchaseQuantity;
		
		void inputPurchaseDetails()
		{
			System.out.print("Enter quantity purchased: ");
			
			Scanner scanner = new Scanner(System.in);
			
			purchaseQuantity = scanner.nextInt();

			scanner.close();
		}
		
		void updateInventory()
		{
			System.out.println("Inventory Updated Successfully!");
			System.out.println("Current Quantity: " + purchaseQuantity);
		}
	}
	
	
	

public class InventorySys1 extends Purchase{
    public static void main(String[] args) 
    {
        Purchase purchase = new Purchase();
        purchase.inputProductDetails();
        purchase.displayQuantity();
        purchase.inputPurchaseDetails();
        purchase.updateInventory();
    }
}