// 16. Write a Java Program to find GCD of two given numbers. 

import java.util.Scanner;

public class Code16{
	public static void main(String[] args){
		System.out.println("Enter two numbers:");
		System.out.print("a:	");
		int a = new Scanner(System.in).nextInt();
		System.out.print("b:	");
		int b = new Scanner(System.in).nextInt();
		
		int gcd=1;
		
		for(int i=1; i<=a && i<=b; i++){
			if(a%i==0 && b%i==0)
			gcd = i;
		
			else 
				continue;
		}
			System.out.println("gcd:	"+gcd);
	}
}