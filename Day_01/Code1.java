//1. Check the given number is EVEN or ODD. 

import java.util.Scanner;

public class Code1{
	
	public static void main(String[] args)
	{	
		System.out.println("Enter a number:	");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = (num%2==0)?"Even": "Odd";
		System.out.print(res);
	}
}