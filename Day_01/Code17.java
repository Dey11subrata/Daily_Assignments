// 17. Write a java program to LCM of TWO given number. 

import java.util.Scanner;

public class Code17{
	public static void main(String[] args){
		System.out.println("Enter two numbers:");
		System.out.print("a:	");
		int a = new Scanner(System.in).nextInt();
		System.out.print("b:	");
		int b = new Scanner(System.in).nextInt();
		
		int hcf = 0;
		
		for (int i=1; i<=a && i<=b; i++){
			if(a%i==0 && b%i==0)
				hcf = i;
			else
				continue;
		}
		
		int lcm = a*b/hcf;
		System.out.println("LCM:	"+lcm);
	}
}