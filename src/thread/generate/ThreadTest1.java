package thread.generate;

public class ThreadTest1 extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print("thread 설명"+(i+1));
			try {
				sleep(500);
			}
			catch(InterruptedException e){
				
			}
		}
	}

	public static void main(String[] args) {
		ThreadTest1 t1 =new ThreadTest1();		// new born상태
		t1.start();								// runnable 상태
		
	}
	
}
