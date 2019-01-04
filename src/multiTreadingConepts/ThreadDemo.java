package multiTreadingConepts;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t1=new MyThread();		
		t1.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println("Main Thread "+Thread.currentThread().getName());
		}

	}

}
