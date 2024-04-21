import java.util.Arrays;
import java.util.Scanner;

// Step 1: Create a functional interface
interface MaxValueFinder {
    int findMax(int[] array);
}

public class LambdaArray {
    public static void main(String[] args) {

	Scanner newscan = new Scanner(System.in);
	
	int size;
	//int k;
	
	System.out.print("Size of the array: ");
	size = newscan.nextInt();
	
	int[] array = new int[size];
	
	for(int i=0 ; i<size ; i++)
	{
		System.out.print("Element " + (i+1) + ": ");
		array[i] = newscan.nextInt();
	}
	
	Arrays.sort(array);
	
	System.out.println(array[array.length-1]);

	newscan.close();
	
	
	

}
}