// 2. Find the second largest number in the given array.

public class Code2{
	public static void main(String[] args){
		int[] arr = {12, 120, 122, 132, 124};
		int max = Integer.MIN_VALUE;
		int sec = Integer.MIN_VALUE;
		for (int i=0; i<arr.length; i++){
			if(arr[i]>max ){
				sec=max;
				max=arr[i];
			}
			else if(arr[i]<max && arr[i]>sec ){
				sec=arr[i];
			}
			
			
		}
		
		 if(sec==Integer.MIN_VALUE){
				System.out.println("No min value");
			}
			else
		System.out.println(sec);
	}
}