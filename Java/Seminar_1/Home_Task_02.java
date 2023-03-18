// Вывести все простые числа от 1 до 1000

package Java.Seminar_1;

public class Home_Task_02
{
    public static void main(String[] args) 
    {
        int n = 1000;
        System.out.println();
        System.out.println("Все простые числа до 1000: ");
        System.out.println();
        System.out.print("2 3 5 7");
        for (int i = 7; i <= n; i += 2) 
        {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) continue;
            else System.out.printf(" %s", i);
        }
        System.out.println();
    }
}
