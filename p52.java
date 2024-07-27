//javapractice
//Find Second Smallest Element in an Array
public class p52 {
	public static int smallest(int arr[]) {
	int min=Integer.MAX_VALUE;
	int sec_smallest=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	int first_smallest=min;
    
	for (int i=0; i < arr.length; i++){
        if(arr[i] != first_smallest && arr[i] < sec_smallest)
          sec_smallest = arr[i];
    }
	return sec_smallest;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,4,6,8,-9};
		System.out.println(smallest(arr));
	}

}
