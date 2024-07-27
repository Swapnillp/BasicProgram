//javapractice
//Calculate the sum of elements in an array 
public class p53 {
	public static int sumOfarray(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4,5};
        System.out.println(sumOfarray(arr));
	}

}
