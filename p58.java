////javapractice
//import java.util.Arrays;
////Java program to find the frequency of each element in the array
//public class p58 {
//	public static void countFreq(int arr[],int n) {
//		
//		for(int i=0;i<n-1;i++) {
//			int count=1;
//			for(int j=i+1;j<n;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//					i++;
//				}
//			}
//			System.out.println("frequency of "+arr[i]+ "is  :"+count);
//			i++;
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr[]= {5,5,5,8,7, 8,1,1,1,1,1,1,1,8,8,8,8,1,1,1};
//		int n=arr.length;
//		Arrays.sort(arr);   
//		countFreq(arr,n);
//	}
//
//}
