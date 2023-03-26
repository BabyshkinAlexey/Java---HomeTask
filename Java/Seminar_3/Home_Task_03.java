// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package Java.Seminar_3;

import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;

public class Home_Task_03
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
        int result = 0;
        float average = 0;
        for (int i = 0; i < size_arr; i++) 
        {
            if (arr.get(i) > result) result = arr.get(i);
        }
        System.out.println("Max: " + result);
        for (int i = 0; i < size_arr; i++) 
        {
            average += arr.get(i);
            if (arr.get(i) < result) result = arr.get(i);
        }
        System.out.println("Min: " + result);
        System.out.println("Average: " + (average / size_arr));

    }
}