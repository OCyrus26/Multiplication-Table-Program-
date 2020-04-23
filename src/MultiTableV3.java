import java.util.Scanner;

public class MultiTableV3 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);

		int i = 1;	
		int num,range;
		System.out.print("Input a number: ");
		int num1 = scan.nextInt();

		while(i <= 10)
		{ 
			int j = 1; 

			while(j <= 10)
			{
				System.out.print(i * j+"\t");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}

