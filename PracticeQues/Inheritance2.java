import java.util.Scanner;

// AryanxD

class Product
{
	String prodname;
	double Price;
}

class ProductInfo extends Product
{
	void inputProductDetails()
	{
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("product name: ");
		prodname = myscanner.nextLine();
		System.out.print("price: $");
		Price = myscanner.nextDouble();

		myscanner.close();
	}
	
	void displayProductInfo()
	{
		System.out.println("product name: " + prodname);
		System.out.println("price: $" + Price);
	}
}




public class Inheritance2
{
    public static void main(String[] args) {
        ProductInfo productData = new ProductInfo();
        productData.inputProductDetails();
        productData.displayProductInfo();
    }
}