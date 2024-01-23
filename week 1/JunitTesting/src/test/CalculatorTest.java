package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {

	static Calculator cal=null;
	@BeforeAll
	public static void beforeAll() {
		cal=new Calculator();
		System.out.println("Before all");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("after all");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("before each ..");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("after each ..");
	}
	
	@Test
	@DisplayName("add test")
	void testAdd() {
		//Calculator cal=new Calculator();
		int actual=cal.add(4, 5);
		assertEquals(9,actual);
		System.out.println("add");
	}

	@Test
	void testSub() {
		//Calculator cal=new Calculator();
		int actual=cal.sub(5, 5);
		assertEquals(0,actual);
		System.out.println("subtract");
	}

	@Test
	@Disabled
	void testMul() {
		//Calculator cal=new Calculator();
		int actual=cal.mul(5, 5);
		assertEquals(25,actual);
		System.out.println("multiply");
	}
}
