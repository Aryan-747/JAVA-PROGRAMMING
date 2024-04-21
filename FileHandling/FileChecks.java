package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileChecks {

    public static void main(String[] args)
    {
        try
        {
        File myFile = new File("/home/aryan/Desktop/LearningJava/FileHandling/File2.txt");
        myFile.createNewFile();

        if(myFile.exists())
        {
            System.out.println("File Name: " + myFile.getName());
            System.out.println("Absolute Path: " + myFile.getAbsolutePath());
            System.out.println("Writable: " + myFile.canWrite());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("File Size in Bytes: " + myFile.length());
        }

        else
        {
            System.out.println("File does not exist!");
        }
        }

        catch(IOException e)
        {
            System.out.println("An error occurred!");
        }
    }

    
}
