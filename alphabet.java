import java.util.*;
class alphabet
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().trim().charAt(0);
		
		if(ch >= 'a' && ch <= 'z')
		{
			System.out.println("Smaller case letter");
			
		}
		else if(ch >= 'A' && ch<='Z')
		{
			System.out.println("Upper case letter");
		}
	}
}