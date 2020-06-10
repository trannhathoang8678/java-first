package animals;

public class Animals
{
    public static void main(String[] args)
    {
        Animal Cow= new Animal(2,2,2);
        Cow.setName("Cow");
        System.out.println(Cow.getName());
        Animal Goat= new Animal();
        Goat.setName("Goat");
        System.out.println(Goat.getName());
        Animal Anatidae= new Animal();
        Anatidae.setName("Anatidae");
        System.out.println(Anatidae.getName());
    }
}
