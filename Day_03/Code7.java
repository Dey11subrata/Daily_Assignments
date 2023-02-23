// 7. Write a Java Program to check two strings are Anagramto each other or NOT. 
import java.util.*;
class Code7{
	public static void main(String[] args){
		System.out.println("Enter string 1: 	");
		String str1 = new Scanner(System.in).next();
		System.out.println("Enter string 2: 	");
		String str2 = new Scanner(System.in).next();
		
		if(str1.length()==str2.length()){
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)==true){
				System.out.println("Anagram");
			}
			
			
			else{
				System.out.println("not Anagram");
			}
		}
		
		else
			System.out.println("not anagram");
	}
}