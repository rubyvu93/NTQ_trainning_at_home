package mai.thred;

public class HelloThreadFromRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("This is run method");
	}
}

