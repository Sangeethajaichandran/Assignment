package day9;

import java.util.Arrays;

public class Anagram2
{

	public static void main(String[] args) 
	{
	String str1="stops";
	String str2="posts";
	
	char[] char1=str1.toCharArray();
	char[] char2=str2.toCharArray();
	
	System.out.println(char1);
	System.out.println(char2);
	
	if(str1.length()==str2.length()) {
		Arrays.sort(char1);
		Arrays.sort(char2);
		System.out.println(char1);
		System.out.println(char2);
		
		
	if(Arrays.equals(char1, char2))
	{
		System.out.println("Given strings are Anagram");
	}else
	    System.out.println("Given strings are not an Anagram");
	}
	else
		System.out.println("Length Mismatch ,therefore the given strings are not an anagram");
	}}
