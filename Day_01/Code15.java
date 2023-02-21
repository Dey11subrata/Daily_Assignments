// 15. Write a java program to Reverse a given number. 

import java.util.Scanner;

public class Code15{
	public static void main(String[] args){
		System.out.println("Enter a number");
		int num = new Scanner(System.in).nextInt();
		
		int numRev = 0;
		
		while(num!=0){
			int dig = num%10;
			numRev=numRev*10 + dig ;
			num/=10;
		}
		
		System.out.println(numRev);
	}
}