package lck09_J_NCEDT;

import java.io.IOException;

public class TestThread {

	public synchronized void doSomething(long time)
			throws InterruptedException {
			// ...
			  Thread.sleep(time);
	}
	
	public void testCase(final long time ){
		Thread test = new Thread(new Runnable() {
			public void run() {
				try {
					doSomething(time);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			});
			   test.start();
	}
	
	public void main(String[] args) throws IOException { 
		
		testCase(1000); // starts thread 1 
		testCase(2000); // starts thread 2
	}
}
