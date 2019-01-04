package programmingLogic;

public class StringReverse {

	public static void main(String[] args) {
		// Method 1
/*		StringBuffer sb=new StringBuffer("Software Testing Material");
		System.out.println(sb.reverse());*/
		
		// Method 2
	/*	String input="Software Testing Material";		
		StringBuilder input1=new StringBuilder();
		input1.append(input);
		input1=input1.reverse();
		System.out.println(input1);
		for(int i=0;i<input1.length();i++) {
			System.out.print(input1.charAt(i));
		}*/
		
		// Method 3
		
		String sb="Software Testing Material";
		String sb2[]=sb.split(" ");
		
		for(String str:sb2) {
			int i;
			int n=str.length();
			for(i=n-1;i>=0;i--) {
				System.out.print(str.charAt(i));
			}
			System.out.print(" ");
			
		}

	}

}
