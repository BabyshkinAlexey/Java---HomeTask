package Java.Seminar_1;
import java.util.Arrays;
public class Sem_Task_03
{
    public static void main(String[] args)
    {
        int[] array = new int[] {3, 2, 2, 3, 4, 5, 3};
        int val = 3;
        int temp = 0;
        System.out.println();
        System.out.println("Начальный массив: ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array.length - 1; j++)
            {
                if (array[j] == val)
                {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Измененный массив: ");
        System.out.println(Arrays.toString(array));
    }
}
