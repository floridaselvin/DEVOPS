public class primerange{

	public static void main(String args[])
	{
		int count =0;
	
		for(int number = 2; number <= 100; number++)
			{
			for(int i = 1; i <= number/2;i++)
			{
				if(number % i == 0)
					count++;
			}
			if(count == 2)
				{
				System.out.println(number);
				}
			}		
	}
}
