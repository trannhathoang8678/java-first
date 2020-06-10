package people;

public class Person
{
    int age,height,weight;
    String name;
    public Person( int myAge, int myHeight, int myWeight)
    {
        age = myAge;
        height = myHeight;
        weight = myWeight;
    }
    public Person()
    {
        this(28,10,60);
    }
     public void walk(int speed)
    {
        if(speed>10)
        System.out.println("Walking...");
    }
    public void sleep()
    {
        System.out.println("Sleeping...");
    }
    public  void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }

    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void properties()
    {
        System.out.println(age);
    }
    private void takeShower()
    {
        System.out.println("taking a shower");
    }
}
