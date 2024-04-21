import java.util.Scanner;

// This Program capitalizes the first letter of every word in the given input sentence


class WordCapitalizer
{
	String word;
	
	WordCapitalizer(String para)
	{
		this.word = para;	
	}
	
	class CapitalizationProcessor
	{
		char[] wordarray = word.toCharArray();
		char[] capitalizeWords()
		{
			wordarray[0] = Character.toUpperCase(wordarray[0]);
			for(int i=1 ; i<word.length() ; i++)
			{
				if(wordarray[i] == ' ')
				{
					wordarray[i+1] = Character.toUpperCase(wordarray[i+1]);
				}
			}
			
			return wordarray;
		}
	}


public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        WordCapitalizer wordCapitalizer = new WordCapitalizer(inputString);

        CapitalizationProcessor capitalizationProcessor = wordCapitalizer.new CapitalizationProcessor();

        System.out.println(capitalizationProcessor.capitalizeWords());

        scanner.close();
    }
}