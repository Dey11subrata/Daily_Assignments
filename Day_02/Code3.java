// 3. Find the second minimum number in the given array. 

public class Code3{
	public static void main(String[] args){
		int[] arr = {2,3,3,3,3};
		int min, sec; 
		min=sec=Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				sec=min;
				min=arr[i];
			}
			
			else if(arr[i]>min && arr[i]<sec){
				sec=arr[i];
			}
		}
		if(sec==Integer.MAX_VALUE){
			System.out.println("no min value");
		}
		
		else{
			System.out.println(sec);
		}
	}
}