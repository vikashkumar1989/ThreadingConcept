package synchronization;

public class Home {
	
	public synchronized void print(String name) throws InterruptedException {
		System.out.println("Good Morning");
		Thread.sleep(500);
		System.out.println(name);
		
	}

}
