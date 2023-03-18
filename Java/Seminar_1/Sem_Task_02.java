package Java.Seminar_1;
import java.util.Arrays;
public class Sem_Task_02

{
    public static void main(String[] args) 
    {
        int[] array = new int[] {1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0};
        int n = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] == 1)
            {
                n++;
                if (n > max)
                {
                    max = n;
                }
            }
            else
            {
                n = 0;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.printf("maximum consecutive 1 = %s ", max);
        System.out.println();
    }
}