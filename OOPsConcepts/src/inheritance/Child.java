package inheritance;

public class Child extends Parent{
	int cid=99;
	public Child() {
		super();//immediate parent 
		 System.out.println("Child constructor is created");
	}
	public Child(int cid) {
		cid=cid;
		 System.out.println("Parameter  constructor for child class");
	}
		
		public void m2() {
			 System.out.println("m2() is called from child class");
		}	
		@Override
		public Child m1() { // overriding m1 from parent class
			System.out.println("m1() is called from child class");
			return null;
		}
		@Override
		public String toString() {//overriding
			return "Child object here";
		}
		public static void main(String args[]) {
			Child c=new Child();
			//System.out.println(c);
			System.out.println(c.toString());
			/*System.out.println(c.cid);
			c.m2();
			c.m1();*/
			Child c2=new Child(101);
			Parent p=new Child();
			System.out.println(p);
			/* Object o=new Object();
			 * Object o=new Parent();
			 * Object o=new Child();			 * */
			 
			
		}
}
