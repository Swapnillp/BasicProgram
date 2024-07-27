//javapractice
//string is palindrome or not in java programming language.
public class p69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="amama";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		//check
		if(rev.equals(str)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}

	}

}
