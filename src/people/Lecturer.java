package people;

public class Lecturer extends Person
{
    public static void main(String[] args)
    {
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Prof. James Gosling");
        lecturer.walk(20);
        lecturer.sleep();
        System.out.println(lecturer.getName());
    }
}
