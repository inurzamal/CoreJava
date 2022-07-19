package multithreading;

//Thread1
class Task1 extends Thread{
	
	public void run() {
		
		for(int i=0; i<10;i++) {
			System.out.println(i);
		}		
	}	
}

//Thread2
class Task2 extends Thread{
	
	public void run() {
		
		for(int i=50; i<60;i++) {
			System.out.println(i);
			//try{Thread.sleep(500);} catch(Exception e) {}
		}		
	}	
}

public class App {

	public static void main(String[] args) {

		Task1 t1 =new Task1();
		t1.start();
		
		Task2 t2 =new Task2();
		t2.start();
	}
}
