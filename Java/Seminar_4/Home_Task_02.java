// Реализуйте очередь с помощью LinkedList со следующими методами:
//      enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package Java.Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Home_Task_02 
{
    static void interfaceik()
    {
        System.out.println("Введите 1, для помещения эллемента в конец очереди");
        System.out.println("Введите 2, для возрата и удаления первого эллемента");
        System.out.println("Введите 3, для возрата первого эллемента");
        System.out.println("Введите stop для завершения работы программы");
        System.out.print("Введите номер команды (из выше перечисленных): ");
    }

    public static void enqueue(LinkedList<String> list, String str) 
    {
        list.add(str);
        System.out.println(list);
    }

    public static void dequeue(LinkedList<String> list) 
    {
        String temp = list.get(0);
        list.remove(0);
        System.out.println("Возвращаемое и удаленное значение: " + temp);
    }

    public static void first(LinkedList<String> list) 
    {
        String temp = list.get(0);
        System.out.println("Возвращаемое значение: " + temp);
    }

    public static void main(String[] args) 
    {
        LinkedList<String> arr = new LinkedList<>();

        for (int i = 0; i < 5; i++) 
        {
            arr.add(i, "Переменная " + (i + 1));
        }

        System.out.println("Начальный массив: ");
        System.out.println(arr);

        Scanner scan = new Scanner(System.in);
        interfaceik();
        String str = scan.nextLine();

        while (!str.equals("stop")) 
        {

            if (str.equals("1"))
            {
                System.out.print("Введите новый эллемент для добавления: ");
                String new_str = scan.nextLine();
                enqueue(arr, new_str);
                System.out.println("Эллемент добавлен в конец");
            }
            if (str.equals("2"))
            {
                dequeue(arr);
                System.out.println("Измененный массив: ");
                System.out.println(arr);
            }
            if (str.equals("3"))
            {
                first(arr);
                System.out.println("Имеющийся  массив: ");
                System.out.println(arr);
            }
            System.out.print("Введите номер команды (из выше перечисленных): ");
            str = scan.nextLine();
        
        }
        scan.close();
    }
}
