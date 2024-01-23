package synchronize;

public class Admisions implements Runnable {

	int seats =1;
	public static void main(String[] args) {

		Runnable admission=new Admisions();
		Thread t1= new Thread(admission,"Satish");
		Thread t2= new Thread(admission,"Raju");
		t1.start();
		t2.start();

	}

	@Override
	public synchronized void run() {

		System.out.println("No. of seats before : "+seats);
		try {
			Thread.sleep(1000); //1000 ms= 1 sec
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//synchronized (this) {
			if(seats>0) {
			System.out.println("Seats allocated to  "+Thread.currentThread().getName());
			seats=seats-1;
		}
		//}
			else {
				System.out.println("Sorry try next year");
			}
		System.out.println("No. of seats left after "+seats);;
	}

}
