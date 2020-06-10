package animals;

public class Animal
{
    int legs,ears,eyes;
    String family,name;
    public Animal( int legs, int ears, int eyes)
    {
        this.legs=legs;
        this.ears=ears;
        this.eyes=eyes;
    }
    public Animal()
    {
        this(4,2,2);
    }
    public void setFamily(String family)
    {
        this.family=family;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public  String getFamily()
    {
        return family;
    }
}
