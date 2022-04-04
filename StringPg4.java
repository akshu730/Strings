import java.util.Scanner;

class StringPg4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int vcount = 0;
		int ccount = 0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' ||s1.charAt(i)=='i' ||s1.charAt(i)=='o' ||
				s1.charAt(i)=='u' ||s1.charAt(i)=='A' ||s1.charAt(i)=='E' ||s1.charAt(i)=='I' ||
				s1.charAt(i)=='O' ||s1.charAt(i)=='U')
				vcount++;
			else if(s1.charAt(i)!=' ')
				ccount++;
		}

		System.out.println("No of vowels in given String is "+vcount);
		System.out.println("No of consonants in given String is "+ccount);
	}
}