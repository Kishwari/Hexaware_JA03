package basics;

public class Student {
	int sid; //0
	String sname; // null
	public static void main(String[] args) {
		
		int amount=0; // local variable needs to be initialized or else compiler error
		
		Student s1=new Student(); //reference local variable (hashcode in JVM) 
		// Student() - calling default constructor made by compiler 
		
		//System.out.println(amount);
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1); // hashcode
	}

}
