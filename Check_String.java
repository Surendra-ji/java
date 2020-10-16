import java.util.Scanner;
public class Check_String{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Any stream, To check is string or not?");
		String str=input.nextLine();
		if(verify(str))
		{
			System.out.println("Valid string");
		}
		else
		{
			System.out.println("Invalid string");
		}
			
		
	}
	public static boolean verify(String str){
		return str.matches("[a-zA-Z]+");
	}
}

