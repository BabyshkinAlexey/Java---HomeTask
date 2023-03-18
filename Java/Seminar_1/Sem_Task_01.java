package Java.Seminar_1;
import java.util.Scanner;
import java.util.*;      


public class Sem_Task_01 
{
    public static void main(String[] args) 
    {
        System.out.print("Print name: ");
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine();
        System.out.println();
        System.out.printf("Hellow %s ", name);
        System.out.println();
    }
}