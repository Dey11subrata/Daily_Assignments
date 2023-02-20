//3. Find the Factorialof a number using Recursion. 
import java.util.Scanner;

public class Code3{
	public static void main(String[] args){
		System.out.print("Enter a number to find factorial:		");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.print(recFact(n));
	}
	
	public static int recFact(int num){
		if(num<=0)
			return 1;

			return (recFact(num-1)*num);
	}
}