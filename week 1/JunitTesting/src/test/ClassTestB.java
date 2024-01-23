package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ClassTestB {
  
	@Test
	@Tag("development")
	public void testB(TestInfo  info) {
		System.out.println("class b test..");
	}
	
}
