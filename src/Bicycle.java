public class Bicycle extends Vehicle
{
    // instance variables (aka attributes, aka fields)
    private int gears;

    public Bicycle(String name, int wheels, int gears)
    {
        super(name, wheels);
        this.gears = gears;
    }

    public void bell()
    {
        // write some code here to honk, etc.
        System.out.println("Ring Ring! Get outta the way!");
    }

    public int getGears()
    {
        return gears;
    }


}