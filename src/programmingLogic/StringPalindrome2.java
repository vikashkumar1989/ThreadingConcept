package programmingLogic;

public class StringPalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="VIKASHHSAKIV";
		char[] c=str.toCharArray();
		StringBuffer str2=new StringBuffer();

		
		for(int i=c.length-1;i>=0;i--) {
			str2.append(c[i]);
			
		}
		System.out.println(str2);
		String str3=str2.toString();

		if(str.equals(str3)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}

}
