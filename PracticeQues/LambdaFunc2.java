import java.util.Scanner;

@FunctionalInterface
interface CharacterCounter {
    int countOccurrences(String word, char targetChar);
}
// Character Counter 

public class LambdaFunc2{

	    public static void main(String[] args) {

		String str;
		String tofind;
		char[] arr;
		
		Scanner newe = new Scanner(System.in);
		
		str = newe.nextLine();
		tofind = newe.nextLine();
		
		arr = tofind.toCharArray();
		
		
		int cnt = 0;
		
		for(int i=0 ; i<str.length() ; i++)
		{
			if(str.charAt(i) == arr[0])
			{
				cnt++;
			}
		}
		
		System.out.println(cnt);

}
}
