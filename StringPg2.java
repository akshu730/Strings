import java.util.Scanner;

class StringPg2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int count = 0;
		System.out.println(s1.length());
		for(int i=0;i<s1.length();i++)
		{
			if((i==0 && s1.charAt(i)!=' ') || (s1.charAt(i)!=' ' && s1.charAt(i-1)==' '))
				count++;
		}

		System.out.println("No of words in given String is "+count);
	}
}