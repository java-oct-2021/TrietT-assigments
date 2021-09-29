public class Fizzbuzz {
    public void count() 
	{
		for(int i =1; i <=50; i++) 
		{
			String result =  fizzbuzz(i);
			System.out.println("Number: " + i + " is " + result);
		}
	}

	/**
	 * @param initial variable
	 * @return return result
	 */
	private String fizzbuzz(int n) 
	{
		if(n %3 ==0 && n %5 ==0)
		{
			// TODO Auto-generated method stub
			return "FizzBuzz";
		}
		else if (n %3 ==0)
		{
			return "Fizz" ;
			
		}
		else if (n % 5 == 0)
		{
			return "Buzz";
		}
		else 
		{
			return Integer.toString(n);
		}
	}
}
