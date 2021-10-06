/* Create an IPhone classes should extend from the Phone abstract class and implement the Ringable interface. */

public class iPhone extends Phone implements Ringable
{
    //iPhone subclass
    public iPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone)
    {
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
        return "Unlock via facial recognition";
    }
    @Override
	public void displayInfor() {
		// TODO Auto-generated method stub
		System.out.println("iPhone " + getVersionNumber()+ " from " + getCarrier() + " has " + getBatteryPercentage() + "% battery");
		
	}
}
