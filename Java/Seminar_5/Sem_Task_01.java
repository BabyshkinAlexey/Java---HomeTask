// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

package Java.Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class Sem_Task_01 
{
    public static void main(String[] args)
    {
        Map  <Integer, String> data = new HashMap<>();
        data.put(123456, "Иванов");
        data.put(321456, "Васильев");
        data.put(234561, "Петрова");
        data.put(234432, "Иванов");
        data.put(654321, "Петрова");
        data.put(345678, "Иванов");

        for (Map.Entry<Integer, String> element : data.entrySet())
        {
            System.out.println("key : " + element.getKey() + " | Value : " + element.getValue());
        }

        for (Map.Entry<Integer, String> element : data.entrySet())
        {
            if (element.getValue().equals("Иванов")) System.out.println(element.getKey());
        }
    }
}
