package mai.thred;

public class MainEx2 {

	public static void main(String[] args) throws InterruptedException {
		Ex2 e1 = new Ex2("Ngua 1");
		Ex2 e2 = new Ex2("Ngua 2");
		Ex2 e3 = new Ex2("Ngua 3");
		Ex2 e4 = new Ex2("Ngua 4");
		Ex2 e5 = new Ex2("Ngua 5");
		Ex2 e6 = new Ex2("Ngua 6");
		Ex2 e7 = new Ex2("Ngua 7");
		Ex2 e8 = new Ex2("Ngua 8");
		Ex2 e9 = new Ex2("Ngua 9");
		Ex2 e10 = new Ex2("Ngua 10");
		
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e2);
		Thread t3 = new Thread(e3);
		Thread t4 = new Thread(e4);
		Thread t5 = new Thread(e5);
		Thread t6 = new Thread(e6);
		Thread t7 = new Thread(e7);
		Thread t8 = new Thread(e8);
		Thread t9 = new Thread(e9);
		Thread t10 = new Thread(e10);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}
}
