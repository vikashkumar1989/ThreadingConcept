package thredingConcept;

public class Thread2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t2=new Thread2();
		t2.start();
		t2.setName("Pintu");
		for(int i=0;i<10;i++) {
			System.out.println("Running Main Thread :"+i);
			}


	}

}
