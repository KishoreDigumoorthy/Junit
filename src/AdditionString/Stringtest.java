package AdditionString;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stringtest {

	@Test
	public void test() {
		Junit1 ju=new Junit1();
		int output=ju.charcount("pAra");
		assertEquals(2,output);
	}

}
