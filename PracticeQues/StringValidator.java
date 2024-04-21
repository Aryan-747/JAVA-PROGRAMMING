import java.util.Scanner;

interface Validator {
    boolean isValid(String input);
}

public class StringValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        Validator alphabeticValidator = input ->
        {
        	boolean valid = true;
        	
        	//char[] array = input.toCharArray();
        	
        	for(int i=0 ; i<input.length() ; i++)
        	{
        		if(Character.isAlphabetic(input.charAt(i)) != true)
        		{
        			valid = false;
        			break;
        		}
        	}
        	
        	return valid;
        };

        if (alphabeticValidator.isValid(inputString)) {
            System.out.println(inputString + " is valid");
        } else {
            System.out.println(inputString + " is invalid");
        }

        scanner.close();
    }
}
