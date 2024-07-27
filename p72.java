//javapractice
import java.util.Scanner;
//Check Frequency of Characters
public class p72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		int[] freq = new int[str.length()]; 
	    int i, j; 
	    char string[] = str.toCharArray(); 
	    for(i=0;i<str.length();i++) {
	    	freq[i]=1;
	    	for(j=i+1;j<str.length();j++) {
	    		if(string[i]==string[j]) {
	    			freq[i]++;
	    			 //Set string[j] to 0 to avoid printing visited character 
	                string[j] = '0'; 
	    		}
	    	}
	    }
	    for(i = 0; i <freq.length; i++) { 
	        if(string[i] != ' ' && string[i] != '0') 
	           System.out.println(string[i] + "-" + freq[i]); 
	        } 
	}

}
