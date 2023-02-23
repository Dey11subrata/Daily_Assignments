// 5. Write a java program to Count the Number of Vowelsin the given string. 

import java.util.*;
public class Code5{
	public static void main(String[] args){
		System.out.println("Enter a string to count number of variables:	");
		String str = new Scanner(System.in).nextLine();
		int vCount=0;
		String vow = "aeiou";
		ArrayList<Character> vList=new ArrayList<>();
		for(int i=0; i<vow.length(); i++){
			vList.add(vow.charAt(i));
		}
		
		for (int i=0; i<str.length(); i++){
			if(vList.contains(str.trim().toLowerCase().charAt(i)))
				vCount++;
			
			else
				continue;
		}
		
		System.out.println(vCount);
	}
}