package people;

public class Student extends Person
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.setName("James Gosling");
        student.walk(20);
        student.sleep();
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}