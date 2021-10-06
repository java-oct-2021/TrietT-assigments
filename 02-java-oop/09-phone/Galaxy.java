/* Create an Galaxy classes should extend from the Phone abstract class and implement the Ringable interface. */

public class Galaxy extends Phone implements Ringable 
{
    //Galaxy subclass
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() 
    {
       String ringer = getRingTone();
       return ringer;
    }
    @Override
    public String unlock() 
    {
    	return "Unlocked by FingerPrint";
    }

	/*
	 * @Override public void displayInfo() { System.out.println("Galaxy " +
	 * getVersionNumber() + " from " + getCarrier()); }
	 */
	@Override
	public void displayInfor() 
    {
		// TODO Auto-generated method stub
		System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier()+ " has " + getBatteryPercentage() + "% battery");      
	}
}


