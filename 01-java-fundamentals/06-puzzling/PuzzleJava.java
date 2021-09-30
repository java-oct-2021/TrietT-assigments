import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava 
{
    
	private static int getRand(int i) 
    {
        Random randMachine = new Random();
        return randMachine.nextInt(i);
    }
    
    /* getTenRolls
    Write a method that will generate and return an array with 10 random numbers
    between 1 and 20 inclusive. 
    */
    public ArrayList<Integer> getTenRolls()
    {
        ArrayList<Integer> randomInt = new ArrayList<Integer>();
        for(int i=1; i<=10; i++)
        {
            randomInt.add(getRand(20) +1);
        }
        return randomInt;
    }

    /* getRandomLetter
    Write a method that will:
    Create an array within the method that contains all 26 letters of the alphabet 
    (this array must have 26 values). 
    Generate a random index between 0-25, and use it to pull a random letter out of the array.
    Return the random letter. 
    */
    public char getRandomLetter()
    {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        //System.out.println("Print alphabet: " + Arrays.toString(alphabet));
        return alphabet[getRand(26)];
        
    }

    /* generatePassword
    Write a method that uses the previous method to create a random string of 
    eight characters, and return that string.
     */
    public String generatePassword() 
    {
        String pw = "";
        for (int i = 0; i < 8; i++) {
            pw += getRandomLetter();
        }
        return pw;
    }
    /* getNewPasswordSet
    Write a method that takes an int length as an argument and creates an array 
    of random eight character words. 
    The array should be the length passed in as an int.
     */
    public ArrayList<String> getNewPasswordSet(int length) 
    {
        ArrayList<String> pwlist = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            pwlist.add(generatePassword());
        }
        return pwlist;
    }
    
}
