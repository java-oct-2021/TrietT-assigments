/* Phone test class. Implement the Override method  (ring, unlock, displayInfo) 
from the IPhone and Galaxy class */
public class PhoneTest 
{
    public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
		iPhone iPhoneTen = new iPhone("X", 11, " AT&T ", "Zing");
		
		s9.displayInfor();
		System.out.println("Galaxy S9 Says " + s9.ring());
		System.out.println(s9.unlock());
		
		iPhoneTen.displayInfor();
		System.out.println("Iphone X says " + iPhoneTen.ring());
		System.out.println(iPhoneTen.unlock());
	}
    
}
