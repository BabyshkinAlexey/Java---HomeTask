package Java.Seminar_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.io.IOException;

public class Sem_Task_01 
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random ran = new Random();
        int size = 10;
        for (int i = 0; i < size; i++)
        {
            int x = ran.nextInt(size);
            arr.add(x);
        }
        System.out.println(arr.toString());
        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);
    }
}