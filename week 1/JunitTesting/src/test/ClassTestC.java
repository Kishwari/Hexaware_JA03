package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ClassTestC {
  
	@Test
	@Tag("development")
	public void testC(TestInfo  info) {
		System.out.println("class c test..");
	}
	
}
