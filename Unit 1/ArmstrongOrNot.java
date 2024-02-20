import java.util.Scanner;
public class ArmstrongOrNot{

public static void main(String args[]) 
{
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter The Number: ");
	int num = input.nextInt();
	
	int temp1 = num;
	int temp2 = num;
	double sum = 0;
	
	int numbofdig = 0;
	
	while(temp1>0)
	{
		numbofdig++;
		temp1 = temp1/10;
	}
	
	while(temp2>0)
	{
		
		int dig = temp2%10;
		sum = sum + Math.pow(dig,numbofdig);
		temp2 = temp2/10;
	}
	
	int sum2 = (int)sum;
	
	if(sum2 == num)
	{
	System.out.println(sum2 + " is an Armstrong number");
	}
	
	else
	{
		System.out.println(num+ " is not an Armstrong number");
	}

	input.close(); // Closing the Scannner variable
}



}
