import java.util.Scanner;

class StringPg1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int count = 0;

		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
				count++;
		}

		System.out.println("No of characters in given String is "+count);
	}
}