// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Java.Seminar_3;

import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;

public class Home_Task_02 
{

    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random ran = new Random();
        int size_arr = 10;
        int size_num = 100;
        for (int i = 0; i < size_arr; i++)
        {
            int x = ran.nextInt(size_num);
            arr.add(x);
        }
        System.out.println();
        System.out.println("Начальный массив: ");
        System.out.println(arr.toString());
        System.out.println();
        for (int i = 0; i < size_arr; i++) 
        {
            if (arr.get(i) % 2 == 0)
            {
                arr.remove(i);
                i--;
                size_arr--;
            }
        }
        System.out.println();
        System.out.println("Измененный массив: ");
        System.out.println(arr.toString());
        System.out.println();
    }
}