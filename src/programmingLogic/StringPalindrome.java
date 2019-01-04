package programmingLogic;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCBA";
		StringBuffer sb1=new StringBuffer(str);
		sb1.reverse();
		String str2=sb1.toString();
		
		if(str2.equals(str)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
