//8. Write a Java Program to find whether given number is Leap year or NOT? 
import java.util.Scanner;
public class Code8{
	public static void main(String[] args){
		System.out.println("Enter a year");
		int y = new Scanner(System.in).nextInt();
		
		System.out.println(
			y%4==0 ? (y%100==0 ? (y%400==0 ? "Century Leap Year" : "Not leap year") 
			: "Leap Year" )
			:"Not a Leap year"
		);
	}
}