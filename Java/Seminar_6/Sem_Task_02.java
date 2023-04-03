// 1. Напишите метод, который заполнит массив из 100 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве 
// и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package Java.Seminar_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sem_Task_02 
{
    static ArrayList<Integer> createArrRandomNum(int size)
    {
        ArrayList<Integer> listArr = new ArrayList<>();
        for (int i = 0; i < size; i++)
        {
            listArr.add((int)(Math.random()*(200)));
        }
        return listArr;
    }

    static double getUnicNum(ArrayList<Integer> listarr)
    {
        Set<Integer> sun = new HashSet<>(listarr);
        return (double) sun.size() / listarr.size();
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> listArr = createArrRandomNum(200);
        System.out.println(createArrRandomNum(200).toString());
        System.out.println();
        System.out.printf("%.2f %%",getUnicNum(listArr) * 100);
    }
    
    
    
}
