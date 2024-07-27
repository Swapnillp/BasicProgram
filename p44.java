//javapractice
//maximum sum of subarrays
public class p44 {
	public static void maxSubarrys(int arr[]) {
		int max=Integer.MIN_VALUE;
		int currSum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				currSum=0;
				for(int k=i;k<=j;k++) {
					currSum+=arr[k];
				}
				//System.out.println(currSum);
				if(max<currSum) {
					max=currSum;
				}
			}
		}
		System.out.println("maximum sum of subarrays :"+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,-3};
		maxSubarrys(arr);

	}

}
