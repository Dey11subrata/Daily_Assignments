// 11. Write a Java Program to print all the Factors of the Given number.
import java.util.*;
public class Code11{
	public static void main(String[] args){
		System.out.print("Enter a number: 	");
		int num = new Scanner(System.in).nextInt();
		
		for(int i=1; i<=num; i++){
			if(num%i==0)
				System.out.print(i+", ");
			else
				continue;
		}
	}
}