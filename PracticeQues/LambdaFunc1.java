import java.util.Scanner;

@FunctionalInterface
interface FactorialCalculator {
    long calculateFactorial(int number);
}

public class LambdaFunc1{
    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	int num;
	
	num = scan.nextInt();
	
	FactorialCalculator factorial = number -> 
	{
		int k=1;
		
		for(int i=1 ; i<=number ; i++)
		{
			k *=i;
			
		}
		
		return k;
	};
	
	System.out.println("Factorial: " + factorial.calculateFactorial(num));

	scan.close();
	
}
}