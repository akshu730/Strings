import java.util.Scanner;

class StringPg11
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int sum = 0;

		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				sum+=Character.getNumericValue(s1.charAt(i));
		}
		System.out.println(sum);
	}
}