package practice;

class Demo extends Thread{
	   volatile boolean isRunning = true;
	   public void run() {
	      long count=0;
	      while (isRunning) {
	         count++;
	      }
	      System.out.println("Thread terminated: " + count);
	   }
	   public static void main(String[] args) throws InterruptedException {
	      Demo t = new Demo();
	      t.start();
	      Thread.sleep(2000);
	      t.isRunning = false;
	      t.join();
	      System.out.println("isRunning set to " + t.isRunning);
	   }
	}

