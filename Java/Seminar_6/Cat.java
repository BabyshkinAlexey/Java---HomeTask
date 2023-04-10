package Java.Seminar_6;

public class Cat
{
    private String name;
    private int age;
    private boolean inject;
    private boolean gender;

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setIngect(boolean inject)
    {
        this.inject = inject;
    }

    public void setGender(boolean gender)
    {
        this.gender = gender;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }



    public void catSaid(int n) 
    {
        System.out.printf("%s мяукнул %d раз \n", this.name, n);
    }

    public void madeInject()
    {
        if (!this.inject) System.out.println("Кот привит.");
        else System.out.println("Кот еже привит.");
        this.inject = true;
    }
}
