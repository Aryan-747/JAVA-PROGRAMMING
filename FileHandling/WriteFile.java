package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {

    public static void main(String[] args)
    {   
        File myfile = new File("/home/aryan/Desktop/LearningJava/FileHandling/File2.txt");
        try
        {
        if(myfile.exists())
        {
            FileWriter writer = new FileWriter("/home/aryan/Desktop/LearningJava/FileHandling/File2.txt");
            writer.write("Hello, My Name is Aryan Salaria and i am currently in my Second Year of Btech CSE");
            writer.close();
            System.out.println("Text Written in File Successfully!");
        }

        else
        {
            System.out.println("File does not exist!");
        }
        }

        catch(IOException e)
        {
            System.out.println("An Error Occurred!");
        }


    }
    
}
