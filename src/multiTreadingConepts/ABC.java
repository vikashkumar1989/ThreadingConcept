package multiTreadingConepts;

public class ABC extends Thread{
	
	Home h;
	String name;
	public static int i;
	ThreadLocal<String> threadlocal=new ThreadLocal<String>();

		
	public ABC(Home h,String name) {
		this.h=h;
		this.name=name;
	}
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			this.h.print(name);
			
		}
		
		
	
	}
	
	

}
