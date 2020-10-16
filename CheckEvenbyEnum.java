import java.util.Scanner;
public class CheckEvenbyEnum
{
	enum points{
		VALID, INVALID, EVEN, ODD;
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number between 1 to 100");
		int num=input.nextInt();
		check_InRange_andEven(num);
		
	}
	public static void check_InRange_andEven(int a)
	{
		if(a>=1&&a<=100)
		{
			System.out.println(points.VALID);
			if(a%2==0)
				System.out.println(points.EVEN);	
			else
				System.out.println(points.ODD);
		}
		else
			System.out.println(points.INVALID);
			
	}
}