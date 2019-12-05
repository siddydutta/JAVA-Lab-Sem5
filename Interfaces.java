interface Car 
{
    public abstract void engine();
}

class Ferrari implements Car
{
    @Override
    public void engine() 
    {
        System.out.println("Ferrari Engine");
    }
}

class RedBull implements Car
{
    @Override
    public void engine() 
    {
        System.out.println("Honda Engine");
    }
}

public class Interfaces 
{
    public static void main(String[] args) 
    {
        Car obj = new RedBull();
        obj.engine();
    }
}
