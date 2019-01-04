package synchronization;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home h=new Home();
		Abc o1=new Abc(h, "Vikash");
		o1.i=10;
		o1.tl.set("Lohani");
		o1.start();
		Abc o2=new Abc(h, "Kumar");
		o2.start();
		System.out.println(o2.i);
		System.out.println(o2.tl.get());

	}

}
