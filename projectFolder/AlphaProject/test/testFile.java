import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import AlphaPackage.AlphaSubset;

class testFile {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSubsetsEqual() {// both subsets should be equal
		AlphaSubset testAlpha = new AlphaSubset("cDBA");
		AlphaSubset testAlpha2 = new AlphaSubset("AcDB");
		ArrayList<Character> testList = new ArrayList<Character>();
		testList.add('A');
		System.out.println(testAlpha.getSubset());
		assertEquals(testAlpha.compare(testAlpha2), testAlpha2.compare(testAlpha));
		//assertNotNull(testAlpha.getSubset());
	}
	
	@Test
	public void subsetNotEqual() {//subsets are not equal
		AlphaSubset testAlpha = new AlphaSubset("ZzQrTv");
		AlphaSubset testAlpha2 = new AlphaSubset("Aa");
		assertEquals(testAlpha.compare(testAlpha2), false);
	}
	
	@Test
	public void subsetSameSizeNotEqual() {//subsets are same size but not equal
		AlphaSubset testAlpha = new AlphaSubset("Zz");
		AlphaSubset testAlpha2 = new AlphaSubset("Aa");
		assertEquals(testAlpha.compare(testAlpha2), false);
	}
	
	@Test
	public void testIfNull() { //tests an error case. It should equal null
		AlphaSubset testAlpha = new AlphaSubset("fE6688223492012");
		assertNull(testAlpha.getPhrase());
	}
	
	@Test
	public void testIfValid() {//tests to see if the AlphaSubset is valid. It should be valid
		AlphaSubset testAlpha = new AlphaSubset("This test should be valid!#$%\"&:;*()-'AZza.,");
		assertNotNull(testAlpha.getPhrase());
	}
	

	

}
