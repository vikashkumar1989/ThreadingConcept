package multiTreadingConepts;

public class MyThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadUsingRunnable obj=new MyThreadUsingRunnable();
		Thread t1=new Thread(obj);
		t1.setName("First");
		t1.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println("Main Thread "+Thread.currentThread().getName());
		}
		
		

	}

}
