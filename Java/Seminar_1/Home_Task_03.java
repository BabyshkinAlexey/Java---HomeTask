// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package Java.Seminar_1;
import java.util.Scanner;

public class Home_Task_03 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите 1-ое число: ");
        int num1 = console.nextInt();
   
        System.out.print("Введите операцию: + ; - ; / ; * .     ");
        char operation = console.next().charAt(0);

        System.out.print("Введите 2-ое число: ");
        int num2 = console.nextInt();
        
        console.close();

        if (operation == '+')
        {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } 
        else if (operation == '-')
        {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if (operation == '*')
        {
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        }
        else if (operation == '/')
        {
            if (num1 == 0 || num2 == 0)
            {
                System.out.println("На 0 делить нельзя!");
            }
            else
            {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
        }
        else
        {
            System.err.println("Что-то пошло не так :( ");
        }
    }
}
