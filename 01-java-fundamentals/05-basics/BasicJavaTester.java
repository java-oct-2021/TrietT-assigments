
public class BasicJavaTester {
    public static void main(String[] args)
     {
        BasicJava.printAllnumber(); 
        BasicJava.printOddnumber();
        // print sum
        int n =225;
        System.out.println("Sum all: " + BasicJava.printSumnumber(n));
        // print IterateArray
        BasicJava.printIterateArray();
        // print max value in the array
        int [] arr = {-3, -5, -7};
        int i = arr.length;
        System.out.println("Maximum: " + BasicJava.printFindMax(arr, i));
        // print all Odd number in the array
        BasicJava.printOddnumberArray();
    }
    
}
