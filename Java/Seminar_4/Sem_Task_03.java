// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.

package Java.Seminar_4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

//import javax.sql.rowset.serial.SQLOutputImpl;

public class Sem_Task_03 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        Deque <String> queue = new LinkedList<String>();

        System.out.println("Enter string: ");
        String str = scn.nextLine();
        while (! str.contains("print")) 
        {
            queue.add(str);
            System.out.print(queue.toString());
            System.out.println("Enter new string: ");
            str = scn.nextLine();
        }
        while(! queue.isEmpty()) 
        {
            System.out.println(queue.pollLast());
        }
        System.out.print(queue.toString());
        scn.close();
    }
}

