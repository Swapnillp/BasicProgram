//javapractice
//character pattern
/*
 A
 BC
 DEF
 GHIJ
 JKLMN
 */
public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char ch='A';
        for(int i=1;i<=5;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(ch);
        		ch++;
        	}
        	System.out.println();
        }
        
	}

}
