package ie.tudublin;

public class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }

    public void setnumlives(int numlives)
    {
        this.numlives = numlives;
    }

    public void kill()
    {
        numlives = numlives - 1;
        if (numlives > 0)
        {
            System.out.println("Ouch!");
        }
        else
        {
            System.out.println("Dead");
        }
    }

    public int toNum()
    {
        return numlives;
    }

    private int numlives;

    public int getNum()
    {
        return numlives;
    }


    
}