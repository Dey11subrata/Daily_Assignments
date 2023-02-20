//2. Write a Java Program to find the Factorialof given number. 
import java.util.Scanner;

public class Code2{
	public static void main(String[] args){
		System.out.print("Enter a number to find factorial: 	");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		
		// factorial without recursion using a for loop
		for (int i = 1; i<=num; i++){
			fact*=i;
		}
		
		System.out.println(fact);
	}
	
	
}