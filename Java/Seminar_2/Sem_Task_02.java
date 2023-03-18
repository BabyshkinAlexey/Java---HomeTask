package Java.Seminar_2;
import java.util.Scanner;

public class Sem_Task_02 
{
    public static void str_counter(String str)
    {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char temp = str.charAt(0);
        sb.append(temp);
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) != temp)
            {
                if (count != 1)
                {
                    sb.append(count);
                    count = 1;
                }
                sb.append(str.charAt(i));
                temp = str.charAt(i);
            }
            else
            {
                count++;
            }
        }
        if (count != 1) sb.append(count);
        System.out.println(sb.toString());
    }
    public static void main(String[] args) 
    {
        System.out.print("Введите строчку из символов: ");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        console.close();
        str_counter(str);
    }
}
