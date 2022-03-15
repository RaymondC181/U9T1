public class Train extends Vehicle
{
    // instance variables (aka attributes, aka fields)
    private int parts;

    public Train(String name, int wheels, int parts )
    {
        super(name, wheels);
        this.parts=parts ;
    }

    public int getParts ()
    {
        return parts;
    }

    public void honk()
    {
        System.out.println("Honk honk! ");
    }




}