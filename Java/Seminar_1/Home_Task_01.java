// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120


package Java.Seminar_1;
import java.util.Scanner;

public class Home_Task_01
{
    public static void main(String[] args) 
    {
        System.out.println();
        System.out.print("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        iScanner.close();

        int sum = 0;
        int factorial = 1;

        for (int i = 1; i <= n; i++)
        {
            sum += i;

            factorial *= i;
        }
        System.out.println();
        System.out.printf("Сумма чисел от 1 до " + n + " = " + sum);
        System.out.println();
        System.out.printf("Факториал числа " + n + " = " + factorial);
    }
}
