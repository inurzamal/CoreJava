package multithreading;

class MyJob implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class MyTask implements Runnable {

	@Override
	public void run() {
		for (int i = 100; i < 110; i++) {
			System.out.println(i);
		}
	}
}

public class MyApp {

	public static void main(String[] args) {

		Thread t1 = new Thread(new MyJob());
		t1.start();

		Thread t2 = new Thread(new MyTask());
		t2.start();
	}
}
