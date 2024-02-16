import java.util.Scanner;   

public class primeupton {

    public static void main (String[] args)
    {
        Scanner myinp = new Scanner(System.in);

        int range = myinp.nextInt();

        int n = 3;

        System.out.print(2 + " ");

        for(int i=1 ; i<range; i++)
        {
            boolean isprime = true;

            for(int j=2 ; j<n ; j++)
            {
                if(n%j == 0)
                {
                    isprime = false;
                    i--;
                    break;
                }
            }        
            if(isprime)
            {
                System.out.print(n + " ");
            }
            n++;
        }
    }
    
}
