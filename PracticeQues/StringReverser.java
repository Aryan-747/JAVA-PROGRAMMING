import java.util.Scanner;

interface StringModifier {
    String modify(String input);
}

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

    	StringModifier stringReverser = input ->
    	{
    		char[] rev = new char[input.length()];
    		char[] str = new char[input.length()];
    		
    		int back = input.length()-1;
    		
    		str = input.toCharArray();
    
    		for(int i=0 ; i<input.length() ; i++)
    		{
    			rev[i] = str[back];
    			back--;
    		}
    		
    		String returnstr = String.valueOf(rev);
    		
    		return returnstr;
    		
    	};

        String reversedString = stringReverser.modify(inputString);
        System.out.println(reversedString);
        scanner.close();
    }
}
