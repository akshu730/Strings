package Program;

import java.util.Scanner;

public class Prgm2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(checkString(s1, s2));
	}
	
	public static boolean checkString(String s1,String s2)
	{
		boolean flag = false;
		for(int i=0;i<s1.length();i++)
		{
			int count = 0;
			if(s1.charAt(i)==s2.charAt(0))
			{
				count++;
				for(int j=1;j<s2.length();j++)
				{
					if(s1.charAt(i+j)==s2.charAt(j) && (i+j)<s1.length())
					{
						count++;
					}
				}
				if(count==s2.length())
				{
					flag = true;
					break;
				}
			}
		}
		
		return flag;
	}
}
