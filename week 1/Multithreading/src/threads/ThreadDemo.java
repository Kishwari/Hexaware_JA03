package threads;

public class ThreadDemo extends Thread { // IS A RELATIONSHIP

	public static void main(String[] args) { // main thread created by JVM

		int x; // Local variables = thread level variables
		System.out.println("welcome");
		
		ThreadDemo t1=new ThreadDemo();
		System.out.println(t1);
		t1.start();
		for (int i=0;i<5;i++) {
			System.out.println("MainThread");
		}
	}

	@Override
	public void run() {
		
		//System.out.println("run () is called");
		for (int i=0;i<5;i++) {
			System.out.println("ChildThread");
		}
	}
}
