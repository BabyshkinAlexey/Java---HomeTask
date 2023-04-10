package Java.Seminar_6;

public class main_cat 
{
    public static void main (String[] arge)
    {
        Cat cat_1 = new Cat();
        Cat cat_2 = new Cat();
        cat_1.setName("Мурзик");
        cat_2.setName("Мурка");

        cat_1.setAge(3);
        cat_2.setAge(4);

        System.out.println();
        System.out.printf("Кличка: %s, возраст: %d \n", cat_1.getName(), cat_1.getAge());
        System.out.printf("Кличка: %s, возраст: %d \n", cat_2.getName(), cat_2.getAge());
        
        cat_1.madeInject();
        cat_2.catSaid(3);
        cat_1.madeInject();
    }
}
