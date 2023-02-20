//10. Write a Java Program to print the digits of a Given Number. 

import java.util.*;

public class Code10{
	public static void main(String[] args){
		System.out.print("Enter a number: 	");
		int num = new Scanner(System.in).nextInt();
		ArrayList<Integer> aList = new ArrayList<>();
		
		while(num!=0){
			int dig = num%10;
			aList.add(dig);
			//System.out.println(dig);
			num /=10;
			
		}
		Collections.reverse(aList);
		aList.forEach(a->System.out.println(a));
	}
}