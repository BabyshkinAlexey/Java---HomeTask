/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
*/

package Java.Seminar_6;

public class notebook 
{
    private int ram;
    private int memory;
    private String os;
    private String color;

    public notebook(int ram, int memory, String os, String color)
    {
        this.ram = ram;
        this.memory = memory;
        this.os = os;
        this.color = color;
    }

    public void setRam(int ram)
    {
        this.ram = ram;
    }
    public void setMemory(int memory)
    {
        this.memory = memory;
    }
    public void setOS(String os)
    {
        this.os = os;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    

    public int getRam()
    {
        return ram;
    }

    public int getMemory()
    {
        return memory;
    }

    public String getOs()
    {
        return os;
    }

    public String getColor()
    {
        return color;
    }

    @Override
    public String toString() 
    {
        //return "ОЗУ - " + ram + " ; " + "Память (ГБ) - " + memory + " ; " + "Операционная система - " + os + " ; " + "Цвет -" + color;
        StringBuilder sb = new StringBuilder();
        sb.append("=========== Ноутбук ===========");
        sb.append(System.lineSeparator());
        sb.append("OS " + this.os);
        sb.append(System.lineSeparator());
        sb.append("HDD " + this.memory);
        sb.append(System.lineSeparator());
        sb.append("RAM " + this.ram);
        sb.append(System.lineSeparator());
        sb.append("Color " + this.color);
        return(sb.toString());
    }

}
