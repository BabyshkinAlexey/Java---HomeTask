// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом

// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)

// Пример 1:

// Input: s = "foo", t = "bar"

// Output: false

// Пример 2:

// Input: s = "paper", t = "title"

// Output: true

package Java.Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Sem_Task_02 
{
    static boolean isomorf(String strFerst, String strSecond)
    {
        if (strFerst.length() != strSecond.length()) return false;

        Map <Character, Character> data = new HashMap<>();

        for (int i = 0; i < strFerst.length(); i++) 
        {
            if (!data.containsKey(strFerst.charAt(i))) data.put(strFerst.charAt(i), strSecond.charAt(i));
            else if (data.get(strFerst.charAt(i)) != strSecond.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String str_firs = scn.nextLine();
        System.out.print("Введите второе слово: ");
        String str_second = scn.nextLine();
        if (isomorf(str_firs, str_second)) System.out.println("True");
        else System.out.println("False");
        scn.close();

    }
}
