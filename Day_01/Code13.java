// 13. Write a Java Program to find the smallest of 3 numbers(a,b,c) without using < or > symbol

import java.util.Scanner;

public class Code13{
	public static void main(String[] args){
		System.out.println("Enter three numbers");
		Scanner input = new Scanner(System.in);
		System.out.print("a:	");
		int a = input.nextInt();
		System.out.print("b:	");
		int b = input.nextInt();
		System.out.print("c:	");
		int c = input.nextInt();
		
		int res = a<c ? a<b ? a:b : c<b ? c : b ;
		
		System.out.println(res+" is smallest");
	}
}