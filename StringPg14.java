import java.util.Scanner;

class StringPg14
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);	
		String s1 = sc.nextLine();
		String s2 = "";

		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				int c = (int)s1.charAt(i)-32;
				s2+=(char)c;
			}
			else
			{
				s2+=s1.charAt(i);
			}
		}
		System.out.println(s2);
	}
}