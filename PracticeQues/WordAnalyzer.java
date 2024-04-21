import java.util.Scanner;

class WordAnalyzer
{
	
	
	String sentence1;
	
	WordAnalyzer(String para)
	{
		this.sentence1 = para;
	}
	
	class VowelCounter
	{
		
		int cunt = 0;
		
		int countVowels()
		{
			for(int i=0 ; i<sentence1.length() ; i++)
			{
				if(sentence1.charAt(i) == 'A' || sentence1.charAt(i) == 'E' || sentence1.charAt(i) == 'I' || sentence1.charAt(i) == 'O' || sentence1.charAt(i) == 'U')
				{
					cunt++;
				}
				
				else if(sentence1.charAt(i) == 'a' || sentence1.charAt(i) == 'e' || sentence1.charAt(i) == 'o' || sentence1.charAt(i) == 'i' || sentence1.charAt(i) == 'u')
				{
					cunt++;
				}
			}
			
			return cunt;
		}
	}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        WordAnalyzer wordAnalyzer = new WordAnalyzer(input);
        WordAnalyzer.VowelCounter vowelCounter = wordAnalyzer.new VowelCounter();
        int vowelCount = vowelCounter.countVowels();
        System.out.println(vowelCount);

        scanner.close();
    }
}