package Java.Seminar_4;

import java.util.LinkedList;
import java.util.ArrayList;
import java.io.IOException;

public class Sem_Task_01 
{
    public static void main(String[] args) throws IOException
    {
        int size = 100000;

        long time_start_1 = System.currentTimeMillis();
        ArrayList<Integer> ArrList = new ArrayList<>();
        for (int i = 0; i < size; i++) ArrList.add(0, i);
        long time_finish_1 = System.currentTimeMillis();

        long time_start_2 = System.currentTimeMillis();
        LinkedList<Integer> ListLink = new LinkedList<>();
        for (int i = 0; i < size; i++) ListLink.add(0, i);
        long time_finish_2 = System.currentTimeMillis();

        System.out.printf("Time_arr  = %d \n", time_finish_1 - time_start_1);
        System.out.printf("Time_list = %d \n", time_finish_2 - time_start_2);
        System.out.println(time_start_2);
    }
}
