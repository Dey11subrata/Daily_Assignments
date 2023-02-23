// 6. Check Given String is Rotation of Another String. 
import java.util.*;

public class Code6{
	public static void main(String[] args){
		System.out.println("Enter string 1:");
		String str1=new Scanner(System.in).next();
		System.out.println("Enter string 2:");
		String str2=new Scanner(System.in).next();
		//System.out.println(str1+","+str2);
		
		// check length same or not
		if(str1.length()==str2.length()){
			String concatedString = str1 + str1;
			if(concatedString.contains(str2)){
				System.out.println(str2+" is rotation of "+str1);
			}
			else
				System.out.println(str1+" is not a rotation of "+str1);
		}
		
		else{
			System.out.println(str1+" is not a rotation of "+str1+" length of strings are different");
		}
	}
}
//geeksforgeeks forgeeksgeeks mightandmagic andmagicmigth