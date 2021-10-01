
/* 
Objectives:
● Implement exception handling.
Tasks:
● Create ArrayList
● Try to cast each element to an Integer
● Use try/catch blocks to handle the exceptions
 */

import java.util.ArrayList;

public class ListofExceptions 
{
    public static void main(String[] args) {
        try{
            ArrayList<Object> myList = new ArrayList<Object>();
            myList.add("13");
            myList.add("hello world");
            myList.add(48);
            myList.add("Goodbye World");

            for(int i = 0; i < myList.size(); i++) 
            {
                Integer value = (Integer) myList.get(i);
            }

        } catch(Exception e){
            System.out.println("Error");
        }
        
    }
    
}
