public class Pet
{
    private String name;
    private String type;
    private int age;

    // Default constructor
    public Pet()
    {
        setType("Animal");
        setName("Pet Name");
        setAge(1);
    }

    // Custom constructor (3 inputs: type, name, age)
    public Pet(String type, String name, int age)
    {
        setType(type);
        setName(name);
        setAge(age);
    }

    // Accessors
    public String getType()
    {
        return type;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    // Mutators
    public void setType(String type)
    {
        this.type = type;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    // speak() method (2 conditions + else)
    public String speak()
    {
        if (type != null && type.equalsIgnoreCase("dog"))
        {
            return "Woof";
        }
        else if (type != null && type.equalsIgnoreCase("cat"))
        {
            return "Meow";
        }
        else
        {
            return "Yowl";
        }
    }

    // toString() includes new fields and calls speak()
    public String toString()
    {
        String output = "";
        output += "Pet information:\n";
        output += "Type: " + getType() + "\n";
        output += "Name: " + getName() + "\n";
        output += "Sound: " + speak() + "\n";
        output += "Age:  " + getAge() + "\n";
        return output;
    }
}
