//1. Write a java program to check Given String is Palindrome or NOT.

import java.util.Scanner;

public class Code1{
	public static void main(String[] args){
		System.out.println("Enter a string to check palindrome");
		String str = new Scanner(System.in).next();
		
		String strRev="";
		for (int i=(str.length()-1); i>=0; i--){
			strRev = strRev+str.charAt(i);
		}
		if(str.toLowerCase().equals(strRev.toLowerCase())){
			System.out.println(str+" is an palindrome");
		}	
		
		else
			System.out.println(str+" not a palindrome");
		
	}
}