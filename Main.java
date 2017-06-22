import java.util.Scanner;

public class Main {
	
	public static void main(String [] args)
	{
		Scanner myScan = new Scanner(System.in);
		int i, j;
		
		i = myScan.nextInt();
		j = myScan.nextInt();
		
		int max =findMax(i, j);
		System.out.println(i + " " + j + " " + max);
		
	}
	public static int threeAlgorithm(int x)
	{
		int count = 1;
		while(x!=1)
		{
			if(x%2 == 0)
			{
				x = x/2;
				//System.out.print(" " + x );
				count++;
			}	
			else
			{
				x = x * 3 + 1;
				//System.out.print(" " + x);
				count++;
			}
		}
		return count;
	}
	public static int findMax(int i, int j)
	{
		int max = 0;
		for(; i<j; i++)
		{
			int temp = threeAlgorithm(i);			
			if (temp>max)
				max = temp;
			
		}
			
		System.out.println(max);
		return max;
		
		
	}
}
