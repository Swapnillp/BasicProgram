//javapractice
//pairs in array
public class p42 {
	public static void pairsArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.print("("+arr[i]+","+arr[j]+")");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		pairsArray(arr);

	}

}
