import java.util.*;

class StringPg9
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		if(s1.length()==s2.length())
		{
			Arrays.sort(c1);
			Arrays.sort(c2);

			boolean res = Arrays.equals(c1,c2);

			if(res)
				System.out.println("Anagram");
			else
				System.out.println("Not a anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}

	}
}