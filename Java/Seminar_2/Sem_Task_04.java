package Java.Seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sem_Task_04 
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("sem_4.txt");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) sb.append(" Test");
        try
        {
            FileWriter fr = new FileWriter(file);
            fr.write(sb.toString());
            fr.close();
        }
        catch(IOException  e)
        {
            System.out.print("ERROR");
        }
    }
}
