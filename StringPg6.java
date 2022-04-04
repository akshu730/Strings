import java.util.Scanner;

class StringPg6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int count = 0;
		int count1 = 0;
		String s2 = "";
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
				s2+=s1.charAt(i);n
		}

		System.out.println(s2);
	}
}