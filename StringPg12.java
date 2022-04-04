import java.util.Scanner;

class StringPg12
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int Ucount =0;
		int Lcount = 0;
		int Scount = 0;
		int count = 0;
		int Dcount = 0;
		char[] c = s1.toCharArray();

		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='A' && c[i]<='Z')
				Ucount++;
			else if(c[i]>='a' && c[i]<='z')
				Lcount++;
			else if(c[i]==' ')
				Scount++;
			else if(c[i]>='0' && c[i]<='9')
				Dcount++;
			else
				count++;
		}
		System.out.println("No of Uppercase are "+Ucount);
		System.out.println("No of Lowercase are "+Lcount);
		System.out.println("No of space present "+Scount);
		System.out.println("No of Digits present "+Dcount);
		System.out.println("No of special characters present "+count);
	}
}