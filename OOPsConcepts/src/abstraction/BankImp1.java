package abstraction;

public  abstract class BankImp1 implements IBank { // for abstract we can't create object

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit success..");
	}

	public abstract void withdraw() ;
}
