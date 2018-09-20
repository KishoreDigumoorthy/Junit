package AdditionString;

import static org.junit.Assert.*;

import org.junit.Test;

public class Additiontest {

	@Test
	public void test() {
		Junit1 ju=new Junit1();
		int output=ju.Addition(4);
		assertEquals(8,output);
	}

}
