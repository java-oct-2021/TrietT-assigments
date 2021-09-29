import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    // class print all number 1 -225 method
    public static void printAllnumber()
    {
        //for loop to print 1 to 255
        for(int i = 1; i<=225; i++)
        { 
            System.out.println("All number: " + i);
        }
    }
    // class print odd numbers between 1-255
    public static void printOddnumber()
    {
        for(int i = 1; i<=225; i++)
        { 
            if(i % 2 !=0)
            {
                System.out.println(i + " is odd number ");
            }  
        }
    }

    /* Sigma of 255 AKA Sum to 255
    Write a method that creates and eventually returns 
    a sum variable that adds up all the numbers from 1 to 255. 
    In this method you are not printing the sum, except to debug 
    if you need to, the method should return the sum. 
    Note: You do not need an array to write this function.*/
    public static int printSumnumber(int n)
    {
        // initial sum
        int sum =0;
        for(int i =1; i<=n; i++)
        {
            sum += i;
        }
        //return sum;
        return sum;
    }
    
    /* Iterating through an array
    Given an array X, say [1,3,5,7,9,13], write a method that would iterate 
    through each member of the array and print each value on the screen. 
    Being able to loop through each member of the array is extremely important. */
    public static void printIterateArray()
    {
        int array[] = {1,3,5,7,9,13};
        int i, n;
        for(i =0; i<array.length; i++)
        {
            n = array[i];
            System.out.println("Print array number: " + n );
        }
    }

    /* Find Max
    Write a method (sets of instructions) that takes any array and prints the 
    maximum value in the array. Your method should also work with a given array 
    that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive 
    numbers, negative numbers and zero. */
    // public static int printFindMax(int[] max, int n)
    // {
    //     Arrays.sort(max);
    //     return max[n-1];
    // }
    public static int printFindMax(int[] max, int i2)
    {
        int i;
        int arr = max[0];
        for( i = 1; i<max.length; i++)
        {
            if(max[i]>arr)
            arr = max[i];
        }
        return arr;

    }

    /* Array with Odd Numbers 
    Write a method that creates an array 'y' that contains all the odd numbers 
    between 1 to 255. When the method is done, 'y' should have the value
    of [1, 3, 5, 7, ... 255]. */
    public static void printOddnumberArray()
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i =1; i<=225; i++)
        {
            if(i % 2 !=0)
            {
                array.add(i);
            }
        }
        System.out.println(array);
    }



}
