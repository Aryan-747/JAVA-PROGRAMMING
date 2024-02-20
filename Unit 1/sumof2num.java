import java.util.Scanner;

public class sumof2num {
    
    public static void main (String[] args)
    {
        Scanner myinp = new Scanner(System.in);

        int n1 = myinp.nextInt();
        int n2 = myinp.nextInt();

        int sum = n1 + n2;

        System.out.println("Sum of the numbers is: " + sum);

        myinp.close();

    }

}
