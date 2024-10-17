package day4;

import java.util.Arrays;

public class Anagram 
{

	public static void main(String[] args) 
	{
	String str1="stop";
	String str2="post";
	if(str1.length()==str2.length())
	{
		char[] str1arr=str1.toCharArray();
		char[] str2arr=str2.toCharArray();
		Arrays.sort(str1arr);
		Arrays.sort(str2arr);
		System.out.println(str1arr);//opst
		System.out.println(str2arr);//opst
		boolean anag=Arrays.equals(str1arr, str2arr);
		if(anag==true)
		{
			System.out.println("Given strings are anagram");
		}
		else
		{
			System.out.println("Given strings are not an anagram");
		}	

	}
	else
		System.out.println("length Mismatch-String is not an anagram");
	}

}
