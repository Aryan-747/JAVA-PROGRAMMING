package FileHandling;

import java.io.File;
import java.io.IOException;


public class CreateFile {

    public static void main (String[] args)
    {
        try
        {
            File myfile = new File("/home/aryan/Desktop/LearningJava/FileHandling/File1.txt");

            if(myfile.createNewFile())
            {
                System.out.println("File Successfully Created!");
                System.out.println("Name of File: " + myfile.getName());
            }

            else
            {
                System.out.println("File already Exists.");
            }
        }

        catch(IOException e)
        {
            System.out.println("An error Occurred!");
            e.printStackTrace();
        }
    }

    
}
