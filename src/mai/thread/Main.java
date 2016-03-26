package mai.thread;

public class Main {
	public static void main(String args[]) {
		System.out.println("Start");
		HelloThreadFromRunnable hl = new HelloThreadFromRunnable();
		Thread t = new Thread(hl);
		t.start();
	}
}
