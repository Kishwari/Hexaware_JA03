package inheritance;

public class Parent extends Object {

	public Parent() {
		super();//immediate parent class constructor that iis Object 
		 System.out.println("Parent constructor is created");
	}
		
		int pid=100;
		
		public Object  m1() {
			 System.out.println("m1() is called from parent class");
			 return null;

		}
	
		
}
