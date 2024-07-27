//javapractice
//Count the sum of number in a string
public class p71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="h2fj3jj5";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum+=Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(sum);

	}

}
