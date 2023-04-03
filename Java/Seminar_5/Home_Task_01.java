// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.
// Добавить функции 
// 1) Добавление номера
// 2) Вывод всего

// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

package Java.Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class Home_Task_01 
{
    static void interfaceik()
    {
        System.out.println("Введите 1, для пдобавления новой записи");
        System.out.println("Введите 2, для выводла всех записей");
        System.out.println("Введите stop, для завершения работы");
        System.out.print("===> ");
    }


    public static void main(String[] args)
    {
        Map  <String, ArrayList<String>> data = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        interfaceik();
        String command = scan.nextLine();
        
        while (!command.equals("stop")) 
        {
            if (command.equals("1"))
            {   
                System.out.print("Введите фамилию: ");
                String surname = scan.nextLine();
                System.out.print("Введите номер телефона: ");
                String number = scan.nextLine();
                if (data.containsKey(surname)) 
                {
                    data.get(surname).add(number);
                } 
                else 
                {
                    ArrayList<String> list = new ArrayList<>();
                    list.add(number);
                    data.put(surname, list);
                }
            }
            
            if (command.equals("2"))
            {
                System.out.println();
                System.out.println(" === Вывод списка на экран ===");
                for (Map.Entry<String, ArrayList<String>> element : data.entrySet())
                {
                    System.out.println("Фамилия : " + element.getKey() + " | Номер : " + element.getValue());
                }
                System.out.println();
            }
            interfaceik();
            command = scan.nextLine();
        }
        scan.close();
    }
}
