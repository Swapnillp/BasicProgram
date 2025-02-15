//javapractice
import java.util.Arrays;
//Java program to find the frequency of each element in the array
public class p57 {
	public static void countFreq(int arr[], int n)
	{
	boolean visited[] = new boolean[n];
	Arrays.fill(visited, false);

	// Traverse through array elements and
	// count frequencies
	for (int i = 0; i < n; i++) {

	// Skip this element if already processed
	if (visited[i] == true)
	continue;

	// Count frequency
	int count = 1;
	for (int j = i + 1; j < n; j++) {
	if (arr[i] == arr[j]) {
	visited[j] = true;
	count++;
	}
	}
	System.out.println(arr[i] + " occurs " + count +" times ");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{10, 30, 10, 20, 10, 20, 30, 10};
		int n = arr.length;
		countFreq(arr, n);

	}

}
