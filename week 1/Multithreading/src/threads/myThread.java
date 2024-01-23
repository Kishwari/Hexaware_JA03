package threads;

public class myThread extends Thread{

	public static void main(String[] args) {

		myThread t1=new myThread();
		t1.setPriority(10);
		t1.setName("Child-1");
		//t1.setPriority(MAX_PRIORITY);or 10 , if want 7 (MAX_PRIORITY-3)
		//t1.setPriority(NORM_PRIORITY); for avg and min for minimum
		System.out.println(t1);
		myThread t2=new myThread();
		t2.setPriority(8);
		t2.setName("Child-2");
		System.out.println(t2);

		t1.start();
		t2.start();
		
		//System.out.println(t1.isAlive());
	}

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()); //current active thread's name
		}
	}
}
