//javapractice
//Left Rotate the Array by One
public class p61 {
	public static void leftrot(int arr[],int n) {
	
		int temp[]=new int[n];
		for(int i=1;i<arr.length;i++) {
			temp[i-1]=arr[i];
		}
		temp[temp.length-1]=arr[0];
		
		//print the new array temp
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		leftrot(arr,n);

	}

}
