package datatypes;

public class DataTypesDemo {

	public static void main(String[] args) {
		byte byteType=(byte) 130; // -2pow7 -128 to 2 pow7 127(0 excluded) ---explicit type casting
		
		short shortType=2;
		char name='c';
		int amount=500;
		
		amount=byteType; // implicit type casting
		
		long longType=4657839;
		
		float area=50.028578f;
		double salary=6000487589.75857930995;
		area = (float) salary;
		
		boolean isValid=true;
		
		System.out.println("Byte value : "+byteType);
		System.out.println("Short value : "+shortType);
		System.out.println("Character value : "+name);
		System.out.println("Integer value : "+amount);
		System.out.println("Long value : "+longType);
		System.out.println("Float value : "+area);
		System.out.println("Double value : "+salary);
		System.out.println("Boolean value : "+isValid);
		
		//System.out.println("Integer value : "+INTEGER.size+"in bits");
	}

}
