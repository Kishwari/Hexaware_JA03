package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import dao.DeptDaoImp;
import dao.IDeptDao;
import entity.Department;


// import static java.lang.System.out;
//now in program we can directly use .println(); to print
class DeptDaoImpTest {

	static IDeptDao dao;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dao=new DeptDaoImp();
	}

	@Test
	@Disabled
	void testInsert() {
		Department dept=new Department();
		dept.setDno(110);
		dept.setDname("Chandini");
		dept.setLocation("Chennai");
		
		int actual=dao.insert(dept);
		// assertEquals(1,actual);
		 assertNotEquals(1,actual); //negative testing 
 	}

	@Test
	void testUpdate() {
	}

	@Test
	void testSelectAll() {

	List<Department> list=dao.selectAll();
	Department dept=list.get(0);
	assertTrue(dept.getDno()>0);
	assertNotNull(list);
	}

}
