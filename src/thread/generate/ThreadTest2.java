package thread.generate;

import ;

public class ThreadTest2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("Thread"+(i+1));
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		ThreadTest2 t1 = new ThreadTest2();
		Thread t1 = new Thread(t2);
		t.start();
	}

}
