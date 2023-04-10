package Java.Seminar_6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class main_notebook 
{
    public static void print(notebook laptop_1, notebook laptop_2, notebook laptop_3, notebook laptop_4, notebook laptop_5, notebook laptop_6, notebook laptop_7, notebook laptop_8)
    {
        System.out.println(laptop_1);
        System.out.println(laptop_2);
        System.out.println(laptop_3);
        System.out.println(laptop_4);
        System.out.println(laptop_5);
        System.out.println(laptop_6);
        System.out.println(laptop_7);
        System.out.println(laptop_8);

    }
    public static void main(String[] args) 
    {
        notebook laptop_1 = new notebook( 4, 512, "Windows", "Black");
        notebook laptop_2 = new notebook(8, 1024, "Windows", "Black");
        notebook laptop_3 = new notebook(2, 256, "Linux", "White");
        notebook laptop_4 = new notebook(4, 512, "Linux", "Black");
        notebook laptop_5 = new notebook(16, 1024, "Windows", "White");
        notebook laptop_6 = new notebook(4, 1024, "Windows", "Black");
        notebook laptop_7 = new notebook(4, 1024, "Windows", "White");
        notebook laptop_8 = new notebook(16, 512, "Linux", "White");

        System.out.println();
        System.out.println("Доступные ноутбуки: ");
        print(laptop_1, laptop_2, laptop_3, laptop_4, laptop_5, laptop_6, laptop_7, laptop_8);

        HashSet <notebook> laptops = new HashSet<>(Arrays.asList(laptop_1, laptop_2, laptop_3, laptop_4, laptop_5, laptop_6, laptop_7, laptop_8));
        HashSet <notebook> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n");
        System.out.println("Когда закончите с введением минимальных критереев, введите 5 для вывода подходящих моделей");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5)
        {
            if(n==1)
            {
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if(n==2)
            {
                System.out.println("Введите минимальный объем ЖД" );
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("HDD", temp);
            }
            if(n==3)
            {
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }
            if(n==4)
            {
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("Color", temp);
            }
            System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
            n = sc.nextInt();
            sc.nextLine();
        }

        for (Entry<String, Object> entry : filters.entrySet()) 
        {
            if(entry.getKey().equals("RAM"))
            {
                Iterator it = laptops.iterator();
                while(it.hasNext())
                {
                    notebook lap = (notebook) it.next();
                    if(lap.getRam()>=(Integer)entry.getValue())
                    {
                        res.add(lap);
                    }
                }
            }
             if(entry.getKey().equals("HDD"))
             {
                Iterator it = laptops.iterator();
                while(it.hasNext())
                {
                    notebook lap = (notebook)it.next();
                    if(lap.getMemory()>=(Integer)entry.getValue())
                    {
                        res.add(lap);
                    }
                }
            }
            if(entry.getKey().equals("OS"))
            {
                Iterator it = laptops.iterator();
                while(it.hasNext())
                {
                    notebook lap = (notebook)it.next();
                        if(lap.getOs().equals(entry.getValue()))
                        {
                            res.add(lap);
                        }
                    }
                }
            if(entry.getKey().equals("Color"))
            {
                Iterator it = laptops.iterator();
                while(it.hasNext())
                {
                    notebook lap = (notebook)it.next();
                        if(lap.getColor().equals(entry.getValue()))
                        {
                            res.add(lap);
                        }
                }
            }
        }
        Iterator it = res.iterator();
        while(it.hasNext())
        {
        notebook lap = (notebook)it.next();
        System.out.println(lap.toString());
        System.out.println();
        } 
    }
}
