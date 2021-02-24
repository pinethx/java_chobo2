package java_chobo2.ch13;

public class Thread01 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(getName() + " ");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
