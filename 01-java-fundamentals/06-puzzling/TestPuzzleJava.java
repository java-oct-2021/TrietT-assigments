import java.util.ArrayList;

public class TestPuzzleJava 
{
    public static void main(String[] args)
    {
        PuzzleJava.getTenRoll();
        PuzzleJava.getRandomLetter();
        PuzzleJava puzz = new PuzzleJava();
        //String pws = puzz.generatePassword();
        ArrayList<String> pws = puzz.getNewPasswordSet(8);
        System.out.println(pws);
       // System.out.println(puzz.shuffle(pws));

    }
    
}
