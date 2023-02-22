//2. How to Swap two Stringswithout using third (temporary) variable? 

public class Code2{
	public static void main(String[] args){
		String str1 = "StringOne";
		String str2 = "StringTwo";
		
		System.out.println("str1:	"+str1);
		System.out.println("str2:	"+str2);
		
		str1 = str1+str2;
		System.out.println(str1);
		
		str2=str1.substring(0,str1.length()-str2.length());
		str1 = str1.substring(str2.length(), str1.length());
		
		System.out.println("str1:	"+str1);
		System.out.println("str2:	"+str2);
	}
	//substring()- no capital
}