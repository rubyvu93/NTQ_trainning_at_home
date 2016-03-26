package mai.thred;

public class HelloThreadFromThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run"+ i);
		}
	}
}
