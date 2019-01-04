package programmingLogic;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100,3,45,6,3,33,6,54,88,1};
		int max = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]> max) {
				max=arr[i];
				
			}
		}
		System.out.println(max);

	}

}
