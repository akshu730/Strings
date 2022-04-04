import java.util.Scanner;

class StringPg10
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int length = s.length();
		int[] freq = new int[length];
		char[] string = s.toCharArray();
		char min_char = s.charAt(0);
		char max_char = s.charAt(0);
		int min,max;
		
		for(int i=0;i<length;i++)
		{
			freq[i] = 1;
			for(int j=i+1;j<length;j++)
			{
				if(string[i]==string[j] && string[i]!=' ' && string[i]!='0')
				{
					freq[i]++;
					string[j] = '0';
				}

			}
		}

		min = max = freq[0];

		for(int i=0;i<freq.length;i++)
		{
			if(min>freq[i])
			{
				min = freq[i];
				min_char = string[i];
			}

			if(max<freq[i])
			{
				max = freq[i];
				max_char = string[i];
			}
		}

		System.out.println("Minimum character in the String is "+min_char+" for "+min+" times");
		System.out.println("Maximum character in the String is "+max_char+" for "+max+" times");
	}
}