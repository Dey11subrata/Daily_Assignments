//4. Write a java program to Count the Number of Wordsin a given String. 

public class Code4{
	public static void main(String[] args){
		String str = "hello      world    for       ";
		int count=0;
		if(str.length()>0 && !str.trim().isEmpty()){
			str=str.trim();
			count++;
			for(int i=0; i<str.length(); i++){
				//System.out.println(str.length());
				
					if(i!=str.length()-1 && str.charAt(i)==' ' && str.charAt(i+1)!=' ')
					count++;
				
				
				
			}
			
		System.out.println(count);
		}
		else{
			System.out.println("enter a valid string");
		}
	}
}