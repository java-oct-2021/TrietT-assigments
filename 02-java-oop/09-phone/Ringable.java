
/* Create a Ringable interface that contains the following methods:
ring(): This method returns a String.
unlock(): This method returns a String. */

public interface Ringable 
{
    public default String ring()
    {
        return "Ring Ring";
    }
    public default String unlock()
    {
        return "Your phone is unlocked";
    }
    
}
