import java.util.Scanner;
	
class NumberIn
{
	int num;
	
	void inputNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		num = scan.nextInt();

		scan.close();
	}
}

class SquareOut extends NumberIn
{
	void displaySquare()
	{
		System.out.println(num*num);
	}
}
	

public class Inheritance {
    public static void main(String[] args) {
    	SquareOut squareout = new SquareOut();
        squareout.inputNum();
        squareout.displaySquare();
    }
}
