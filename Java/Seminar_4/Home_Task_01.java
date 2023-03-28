// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

package Java.Seminar_4;

import java.util.LinkedList;
import java.util.Arrays;

public class Home_Task_01
{ 
    public static void main(String[] args) 
    {
        LinkedList<Integer> arr = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Начальный   массив: ");
        System.out.println(arr);
        System.out.println("Перевернутый  массив: ");
        System.out.println(reverse(arr));
    }
    
    public static LinkedList<Integer> reverse(LinkedList<Integer> ls) 
    {
        LinkedList<Integer> rev_ls = new LinkedList<>();
        for(int i=ls.size()-1;i>=0;i--)
        {
            rev_ls.add(ls.get(i));
        }
        return rev_ls;        
    } 
}