import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		int i = 1;		

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