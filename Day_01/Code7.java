//7. How to check the given number is Positive or Negativein Java? 
import java.util.Scanner;
public class Code7{
	public static void main(String[] args){
		System.out.print("Enter a number:		");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println((x>0?"Posetive":(x==0)?"zero": "Negative"));
	}
}