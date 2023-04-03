// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}. Распечатайте содержимое данного множества.

// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.

// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.

package Java.Seminar_6;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sem_Task_01 
{
    public static void main(String[] args) 
    {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println(set);
        System.out.println();

        Set<Integer> setLinked = new LinkedHashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println(setLinked);
        System.out.println();

        Set<Integer> setTree = new TreeSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println(setTree);
        System.out.println();

        Set<Integer> setTree2 = new TreeSet<>(Comparator.reverseOrder());
        // setTree2.add(1);
        // setTree2.add(2);
        // setTree2.add(300000);
        // setTree2.add(2);
        // setTree2.add(4);
        // setTree2.add(5000);
        // setTree2.add(6);
        setTree2.addAll(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println(setTree2);
        System.out.println();
    }
}
