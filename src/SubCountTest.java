import static org.junit.Assert.*;


import org.junit.Test;


public class SubCountTest {

	@Test
	public void testBasicCase() {
		String testString = "Dhrumit is my name and not surname.";
		String subString = "name";
		int count = SubCount.occurenceCount(testString, subString);
		assertEquals(2, count);
	}
	@Test
	public void testStringWithNoSpaces(){
		
		String testString = "batmanisbatwithsuitbatcarandbatcave.";
		String subString = "bat";
		int count =SubCount.occurenceCount(testString, subString);
		assertEquals(4, count);
		
		
	}
	@Test
	
public void testStringWithCaseSensitive(){
		
		String testString = "Batmanisbatwithsuitbatcarandbatcave.";
		String subString = "bat";
		int count =SubCount.occurenceCount(testString, subString);
		assertEquals(3, count);
		
		
	}
	
	@Test
	
	public void testStringWithNull(){
			
			String testString = "";
			String subString = "Bat";
			int count =SubCount.occurenceCount(testString, subString);
			assertEquals(0, count);
			
		}
	
	
	@Test
	
	public void testsubStringWithNull(){
			
			String testString = "batisbatisabatbata";
			String subString = null;
			int count =SubCount.occurenceCount(testString, subString);
			assertEquals(0, count);
			
		}
	
	
@Test
	
	public void testsubStringGreater(){
			
			String testString = "batisbatisabatbata";
			String subString = "batisbatisabatbataaaaa";
			int count =SubCount.occurenceCount(testString, subString);
			assertEquals(0, count);
			
		}
	@Test
public void testsubCaseInsensitive(){
	
	String testString = "batisbatisabatbata";
	String subString = "BAT";
	int count =SubCount.occurenceCount(testString, subString);
	
	assertEqualsIgnoreCase(4,count);
	
}
	private void assertEqualsIgnoreCase(int i, int count) {
		// TODO Auto-generated method stub
		
	}
	
	

}
