package thredingConcept;

public class Thread1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t=new Thread1();
		Thread t1=new Thread(t);
		t1.setName("Vikash Thread");
		t1.start();
		for(int i=0;i<10;i++) {
		System.out.println("Running Main Thread :"+i);
		}

	}

}
