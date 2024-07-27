//javapractice
//Sort First half in Ascending and Second half in descending order in Java
//by using bubble sort
public class p55 {
	public static void sort(int arr[]) {
		int n=arr.length-1;
		for(int i=0;i<n;i++) {
			//for first half asc
			for(int j=0;j<n/2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			//second half desc
			for(int j=n/2;j<n;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,78,9,3,8};
		sort(arr);

	}

}
