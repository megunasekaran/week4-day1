package practice.exercise1;

public class primenumber {
	
	public static void main (String args[])
	{
		int num = 7;
		boolean isPrime = true;
		for(int i=2; i<=num; i++)
		{
			if(num%2==0)
			{
			System.out.println(num +" "+"is not a prime number");	
			isPrime = false;
			break;
			}
			
		}
		if(isPrime==true)
		{
			System.out.println(num + " "+ "is a prime number");
		}
		
	}

}
