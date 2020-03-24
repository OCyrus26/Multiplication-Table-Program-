import java.util.Scanner;

public class MultiTableV2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);

		int i = 1;		

		while(i <= 10)
		{ 
			int j = 1; 

			while(j <= 10)
			{
				System.out.print(twoFactor(i,j)+"\t");
				j++;
			}
			i++;
			System.out.println();
		}

	}

	public static int twoFactor(int a, int b)
	{
		return a*b;
	}
	

}
