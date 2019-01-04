package synchronization;

public class Abc extends Thread{
	
	Home h;
	String name;
	static int i;
	ThreadLocal<String> tl=new ThreadLocal<String>();
	public Abc(Home h, String name) {
		this.h=h;
		this.name=name;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				this.h.print(this.name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
