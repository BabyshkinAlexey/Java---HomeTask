package Java.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Sem_Task_02 
{
    public static void main(String[] args)
    {
        ArrayList <String> arr  = new ArrayList<>(Arrays.asList("Sun", "Mercury", "Pluto", "Venus", "Earth", "Sun", "Mars", "Jupiter", "Mars", "Saturn", "Sun", "Uranus", "Neptune", "Pluto"));
        ArrayList <String> resalt  = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.size(); i++) 
        {
            count = 0;
            if (!resalt.contains(arr.get(i)))
            {
                resalt.add(arr.get(i));
                for (int j = 0; j < arr.size(); j++) 
                {
                    if (arr.get(i).equals(arr.get(j))) 
                    {
                        count += 1;
                    }
                }
                System.out.println(count + " " + arr.get(i));
            }
        }

    }
}