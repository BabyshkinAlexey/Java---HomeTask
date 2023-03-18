// 1234 5 4321
// 1234 5 5 4321
package Java.Seminar_2;
import java.util.Scanner;

public class Sem_Task_03
{
    public static boolean palindrome(String str)
    {
        int size = str.length();
        for (int i = 0; i < str.length() / 2; i++) 
        {
            if (str.charAt(i) == str.charAt(size - (i + 1))) continue;
            else return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        System.out.print("Введите строчку из символов: ");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        console.close();
        System.out.print(palindrome(str));
    }
}