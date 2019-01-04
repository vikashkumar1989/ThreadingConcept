package multiTreadingConepts;

public class TestingTreadSyncIssue {

	public static void main(String[] args) {
		Home h=new Home();
		ABC t1=new ABC(h,"Vikash");
		t1.start();
		t1.i=10;
		System.out.println("Value of i from thread 1 :"+t1.i);
		t1.threadlocal.set("Vikash");
		System.out.println("Printing from 1st Thread :"+t1.threadlocal.get());
		
		ABC t2=new ABC(h,"Kumar");
		t2.start();
		System.out.println("Value of i from thread 2 :"+t2.i);
		System.out.println("Printing from 1st Thread :"+t2.threadlocal.get());

	}

}
