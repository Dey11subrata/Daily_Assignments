//12. Write a Java Program to find sum of the digits of a given number.

import java.util.*;

public class Code12{
	public static void main(String[] args){
		System.out.println("Enter number");
		int num = new Scanner(System.in).nextInt();
		
		int sum = 0;
		
		while(num!=0){
			int dig = num%10;
			sum+=dig; 
			num/=10;
		}
		System.out.println(sum);
	}
}