import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import AlphaPackage.AlphaSubset;

class testFile {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSubsetsEqual() {// both subsets should be equal
		AlphaSubset testAlpha = new AlphaSubset("CDcdCDc");
		AlphaSubset testAlpha2 = new AlphaSubset("dDC*$$()DC!");
		assertEquals(testAlpha.compare(testAlpha2), testAlpha2.compare(testAlpha));
		//assertNotNull(testAlpha.getSubset());
	}
	
	@Test
	public void testIfNull() { //should equal null
		AlphaSubset testAlpha = new AlphaSubset("fE6688223492012");
		assertNull(testAlpha.getPhrase());
	}
	

	

}
