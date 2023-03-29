// В калькулятор добавьте возможность отменить последнюю операцию

package Java.Seminar_4;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Home_Task_03 
{
    public static int inputNum(String text) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        int num = sc.nextInt();
        return num;
    }
    public static String inputStr(String text) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        String str = sc.nextLine();
        return str;
    }
    public static void main(String[] args) throws Exception 
    {

        int a;
        int b;
        int res = 0;
        String op;
        Scanner sc = new Scanner(System.in);
        a = inputNum("Введите первое число: ");
        b = inputNum("Введите второе число: ");
        op = inputStr("\nВведите оператор (+, -, *, /): ");
        Stack<Integer> stack = new Stack<>();
        if (Objects.equals(op, "+")) 
        {
            res = a + b;
        } 
        else if (Objects.equals(op, "-")) 
        {
            res = a - b;
        } 
        else if (Objects.equals(op, "*")) 
        {
            res = a * b;
        } 
        else if (Objects.equals(op, "/")) 
        {
            res = a / b;
        } 
        else
            System.out.printf("Неверный ввод !");

        System.out.println("ответ:" + res);

        boolean flag = true;

        stack.push(res);
        while (flag) 
        {
            op = inputStr("\n> Введите оператор (+, -, *, /), " +
                          "\n> Либо ведите \"del\" для удаления последнего результата " +
                          "\n> Для остановки программы введите stop " + 
                          "\n ===> ");

            if (Objects.equals(op, "del")) 
            {
                System.out.println("удаленное значение: " + stack.pop());
                res = stack.peek();
                System.out.println("Текущее значение: " + res);
            }
            if (Objects.equals(op, "stop")) flag = false;
            else 
            {
                b = inputNum("Введите число: ");
                if (Objects.equals(op, "+")) {
                    res = res + b;
                } else if (Objects.equals(op, "-")) {
                    res = res - b;
                } else if (Objects.equals(op, "*")) {
                    res = res * b;
                } else if (Objects.equals(op, "/")) {
                    res = res / b;
                } else
                    System.out.printf("Неверный ввод !");
                stack.push(res);
                System.out.println("Ответ = " + res);
            }
        }
    }
}