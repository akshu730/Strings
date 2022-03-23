package com.Qspiders.ArrayList;

public class DuplicateStrring {

	public static void main(String[] args) 
	{
		String s = "CsharpstarZ";
		char c[] = s.toCharArray();
		int freq[] = new int[s.length()];
		for(int i=0;i<c.length;i++)
		{
			freq[i] = 1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j] && c[i]!='0')
				{
					freq[i]++;
					c[j]='0';
				}
			}
		}
		String s1 = "";
		s1 = s1+c[0];
		for(int i=1;i<s.length();i++)
		{
			if(c[i]!='0')
				s1 = s1+c[i];
		}
		System.out.println(s1);

	}

}
