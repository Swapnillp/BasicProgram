//javapractice
// java program to remove spaces from a string
public class p70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="swapnil patil";
		char c[]=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(c[i]!=' ') {
				sb.append(c[i]);
			}
		}
		System.out.println(sb);

	}

}
