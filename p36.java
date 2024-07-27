 //javapractice
//array
//updation of number
public class p36 {
	public static void updationArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30};
		updationArray(arr);
		//display array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
