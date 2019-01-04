package programmingLogic;
import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int flag=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println(a+" is not Prime number");
		}
			
		else {
			System.out.println(a+" is Prime number");
			
		}
			

	}

}
