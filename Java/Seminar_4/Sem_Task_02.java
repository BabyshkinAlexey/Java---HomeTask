// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида text
// 2. Нужно сохранить text в связный список
// 3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

package Java.Seminar_4;

import java.util.Scanner;
import java.util.LinkedList;
// import javax.sql.rowset.serial.SQLOutputImpl;

public class Sem_Task_02
{
    public static void main(String[] args) 
    {
        Scanner scan  = new Scanner(System.in);
        LinkedList<String> linklist = new LinkedList<>();
        System.out.println("Enter string");
        String str = scan.nextLine();
        while (!str.equals("stop"))
        {
            if (! str.contains("print~")) linklist.add(str);
            else
            {
                String st = str.substring(  6);
                System.out.println(st);
                int index = Integer.parseInt(st);
                System.out.print(linklist.get(index) + " ");
                linklist.remove(index);
            }
            System.out.println(linklist.toString());
            System.out.println("Enter string");
            str = scan.nextLine();
        }        
        scan.close();
    }
}

