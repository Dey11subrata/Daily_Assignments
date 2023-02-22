//1. Calculate the average of given array. 

public class Code1{
	public static void main(String[] args){
		int[] arr = {10, 9, 18, 12, 11};
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];
		}
		System.out.println("avg = "+((float)sum/arr.length));
	}
}