package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args)
    {
       
        try
        {

        File mf = new File("/home/aryan/Desktop/LearningJava/FileHandling/File2.txt");

            Scanner reader = new Scanner(mf);

            while(reader.hasNextLine())
            {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();

        }

        catch (FileNotFoundException e)
        {
            System.out.println("Error Encountered! :( Big Oooof");
        }

    }

    
}
