import java.util.Scanner;

public class biggestarray {

	public static void main(String args[])
	{
		int n,  i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the terms:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max = arr[0];
		for(i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("The biggest element is:" +max);
	}
}
