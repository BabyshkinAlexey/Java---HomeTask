// Пусть дан список сотрудников:

// Написать программу, которая найдет и выведет повторяющиеся
// имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.
// data.put("Иван", "Иванов");
// data.put("Светлана", "Петрова");
// data.put("Кристина", "Белова");
// data.put("Анна", "Мусина");
// data.put("Анна", "Крутова");
// data.put("Иван", "Юрин");
// data.put("Петр", "Лыков");
// data.put("Петр", "Чернов");
// data.put("Мария", "Федорова");
// data.put("Марина", "Светлова");
// data.put("Мария", "Савина");
// data.put("Мария", "Рыкова");
// data.put("Марина", "Лугова");
// data.put("Анна", "Владимирова");
// data.put("Иван", "Мечников");
// data.put("Петр", "Петин");
// data.put("Иван", "Ежов");

// data.add("Иван Иванов");
// data.add("Светлана Петрова");
// data.add("Кристина Белова");
// data.add("Анна Мусина");
// data.add("Анна Крутова ");
// data.add("Иван Юрин");
// data.add("Петр Лыков");
// data.add("Павел Чернов");
// data.add("Петр Чернышов");
// data.add("Мария Федорова");
// data.add("Мария Савина");
// data.add("Марина Светлова");
// data.add("Мария Рыкова");
// data.add("Марина Лугова");
// data.add("Анна Владимирова");
// data.add("Иван Мечников");
// data.add("Петр Петин");
// data.add("Иван Ежов");
package Java.Seminar_5;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;
    
    public class Home_Task_02 
    {       
        public static ArrayList<String> getName(String [] list)
        {
            ArrayList<String> listName = new ArrayList<>();
            for (String el : list) {
                String [] elList = el.split(" ");
                listName.add(elList[0]);
            }
            return listName;
        }

        public static Map<String, Integer> getMap(ArrayList<String> name) 
        {
            Map<String, Integer> mapName = new HashMap<>();
            for (int i = 0; i < name.size(); i++) 
            {
                int count = 1;
                for (int j = i + 1; j < name.size(); j++)
                {
                    if (name.get(i).equals(name.get(j))) count += 1;
                }
                if (mapName.containsKey(name.get(i)) == false) mapName.put(name.get(i), count);
            }
            return mapName;
        }

        public static void nameRepeat(Map<String, Integer> map)
        {
            for(var item: map.entrySet())
            {
                if (item.getValue() > 1) System.out.printf("%s: %d \n", item.getKey(), item.getValue());
            }
        }
        public static void sortName(Map<String, Integer> map)
        {
            ArrayList<Integer> listCount = new ArrayList<>();
            for(var item: map.entrySet()) 
            {
                if (listCount.contains(item.getValue()) == false) listCount.add(item.getValue());
            }
            listCount.sort(null);
            for (int i = listCount.size()-1; i > -1; i--)
            {
                for (var item: map.entrySet())
                {
                    if (listCount.get(i) == item.getValue()) System.out.printf("%s : %d \n", item.getKey(), item.getValue());
                }
            }
        }
        public static void main(String[] args) {
            String[] emploees = new String[] {"Иван Иванов", "Иван Петров", "Сергей Козлов", "Евгений Петров", "Сергей Васильев", "Иван Смирнов", "Андрей Петров"};
            ArrayList<String> emploeesName = getName(emploees);
            Map<String, Integer> mapName =  getMap(emploeesName);
            System.out.println("Повторяющиеся имена: ");
            nameRepeat(mapName);
            System.out.println("Имена, отсортированные по убыванию популярности: ");
            sortName(mapName);
        }
        
    }
/*
 * import java.util.*;
 * 
 * public class EmployeeList {
 * 
 * public static void main(String[] args) {
 * 
 * List employees = new ArrayList(); // создаем коллекцию для хранения имен
 * сотрудников
 * employees.add("Иван Иванов");
 * employees.add("Светлана Петрова");
 * employees.add("Иван Иванов"); // добавляем повторяющееся имя
 * 
 * Map nameCount = new HashMap(); // создаем коллекцию для хранения количества
 * вхождений каждого имени
 * 
 * for (String name : employees) { // перебираем имена сотрудников
 * if (nameCount.containsKey(name)) { // если имя уже встречалось, увеличиваем
 * количество вхождений на 1
 * nameCount.put(name, nameCount.get(name) + 1);
 * } else {
 * nameCount.put(name, 1); // иначе добавляем имя в коллекцию с количеством
 * вхождений 1
 * }
 * }
 * 
 * List<Map.Entry> sortedNames = new ArrayList(nameCount.entrySet()); // создаем
 * коллекцию для сортировки имен по убыванию вхождений
 * Collections.sort(sortedNames, new Comparator<Map.Entry>() { // сортируем по
 * убыванию вхождений
 * public int compare(Map.Entry o1, Map.Entry o2) {
 * return o2.getValue().compareTo(o1.getValue());
 * }
 * });
 * 
 * for (Map.Entry entry : sortedNames) { // выводим результаты на экран
 * System.out.println(entry.getKey() + " - " + entry.getValue() + " раз(а)");
 * }
 * }
 * }
 */