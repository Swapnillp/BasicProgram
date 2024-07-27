//javapractice
//binary search
public class p40 {
	public static int binarySearch(int arr[],int key) {
		int start=0,end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			//comparision
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[mid]<key) {   //right 
				start=mid+1;
			}else {              //left
				end=mid-1;
			}
		}
		return-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int key=30;
		System.out.println("index of key is:"+binarySearch(arr,key));
		

	}

}
