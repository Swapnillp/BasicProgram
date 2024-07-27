//javapractice
//kadanes algorithm max sum of subarrays
public class p46 {
	public static void kadanes(int arr[]) {
		int maxSum=Integer.MIN_VALUE;
		int currSum=0;
		for(int i=0;i<arr.length;i++) {
			currSum=currSum+arr[i];
			if(currSum<0) {
				currSum=0;
			}
			maxSum=Math.max(maxSum, currSum);
		}
		System.out.println(maxSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,-2,6,-1,3};
		kadanes(arr);

	}

}
