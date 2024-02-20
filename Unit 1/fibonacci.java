import java.util.Scanner;


public class fibonacci
{
    public static void main(String[] args)
    {

        Scanner myscanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int number = myscanner.nextInt();

        int first = 0;
        int second = 1;
        int next = 0;

        System.out.print("Fibonacci Numbers upto "+ number +" are: ");
        System.out.print("0 1 ");

        for(int i=1 ; i<number ; i++)
        {
            next = first + second;

            if(next == (first+second))
            {
                System.out.print(next + " ");
            }

            first = second;
            second = next;
        }

        myscanner.close();

    }

};