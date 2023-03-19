// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

package Java.Seminar_2;
import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Home_Task_01 
{
     public static void main(String[] args) 
    {
        int[] array = new int[] {5, 7, 2, 4, 6, 1, 1, 5, 6, 2, 11, 8};
        System.out.println();
        System.out.println("Начальный массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println();
        
        File file = new File("H_T_1.txt");
        StringBuilder sb = new StringBuilder();

        int temp = 0;
        for (int i = 0; i < (array.length) - 1; i++)
        {
            for (int j = 0; j < (array.length) - 1; j++) 
            {
                if (array[j] > array[j + 1])
                {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sb.append((Arrays.toString(array)));
                    sb.append("\n");
                }
            }    
        }
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
        
        System.out.println("Конечный массив: ");
        System.out.println(Arrays.toString(array));
    }
}