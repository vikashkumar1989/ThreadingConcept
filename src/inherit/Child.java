package inherit;

public class Child extends Parent {

/*	@Override
	public void method1() throws InterruptedException {
		System.out.println("Method 1 from child");
		Thread.sleep(100);
	}*/
	public static void main(String[] args) throws InterruptedException {
		Parent obj=new Child();
		obj.method1();
	}

}
