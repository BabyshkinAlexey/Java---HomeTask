// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


package Java.Seminar_2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Home_Task_02 
{
    public static void main(String[] args) throws Exception 
    {
        String sign = "\"";
        // чтение файла
        File file = new File("H_T_2.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) 
            {
                System.out.println();
                line = line.replace(":", " ");
                line = line.replace(",", " ");
                String [] words = line.split(sign);
                for (String word: words)
                {
                    // // Студент Иванов получил 5 по предмету Математика.
                    if (word.equals("фамилия")) word = "Студент";
                    if (word.equals("оценка")) word = "получил";
                    if (word.equals("предмет")) word = "по предмету";
                    sb.append(word);
                }
                sb.append("\n");
            }
            System.out.println(sb);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
