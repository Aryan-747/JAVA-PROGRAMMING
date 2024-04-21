package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args)
    {
        File mf = new File("/home/aryan/Desktop/LearningJava/FileHandling/File2.txt");

        try
        {
        if(mf.exists())
        {
            Scanner reader = new Scanner(mf);

            while(reader.hasNextLine())
            {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();
            
        }

        else
        {
            System.out.println("File Does Not Exist!");
        }
        }

        catch (IOException e)
        {
            System.out.println("Error Encountered! :( Big Oooof");
        }

    }

    
}
