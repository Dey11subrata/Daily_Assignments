//3. Write a java program to Reverse a Stringwithout using in-build function. 

public class Code3{
	public static void main(String[] args){
		String str = "StringTest";
		String strRev="";
		System.out.println(str);
		for(int i=str.length()-1; i>=0; i--){
			strRev+=str.charAt(i);
		}
		System.out.println(strRev);
	}
}