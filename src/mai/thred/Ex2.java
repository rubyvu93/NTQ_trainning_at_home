package mai.thred;

import java.util.Random;

public class Ex2 implements Runnable {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ex2(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		int s = 0;
		Random rd = new Random();
		do {
			try {
				Thread.sleep(500);
				int sRD = rd.nextInt(10) + 1;
				s = s + sRD; 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (s < 100);
		if (s == 100) {
			System.out.println(name + " da ve dich voi " + s + " buoc chay" );
		}
		if (s > 100) {
			s = s - 100;
			System.out.println(name + " co quang duong chay la " + s + " buoc chay" );
		}
	}
}
