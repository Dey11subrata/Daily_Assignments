// 19. Check whether the Given Numberis a Palindrome or NOT. 
import java.util.Scanner;

public class Code19{
	public static void main(String[] args){
		System.out.println("Enter a number:		");
		int num = new Scanner(System.in).nextInt();
		int numI=num;
		
		int numRev = 0;
		
		while(num!=0){
			int dig = num%10;
			numRev= numRev*10+dig;
			num/=10;
		}
		System.out.println(numI);
		System.out.println(numRev);
		
		System.out.println(numI==numRev?"Palingdrome":"Not a Palingdrome");
	}
}