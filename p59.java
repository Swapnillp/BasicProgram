//javapractice
import java.util.*;
//Removing Duplicates elements from an array in Java.
public class p59 {
	//by using Hashset
	public static void removeDup(int arr[]) {
		HashSet<Integer> hash_set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hash_set.add(arr[i]);
		}
		System.out.print(hash_set);
	}
	
	//by  Without Using Extra Space.
	public static int removeDup1(int arr[],int n) {
//		if (n==0 || n==1)
//	         return n;
//		int j = 0;
//		for (int i=0; i<arr.length-1; i++)
//		if (arr[i] != arr[i+1])
//		arr[j++] = arr[i];
//		arr[j++] = arr[arr.length-1];
//
//		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,1,5,2};
		int n=arr.length;
		removeDup(arr);
		n=removeDup1(arr,n);
		for (int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
			}

	}

}
