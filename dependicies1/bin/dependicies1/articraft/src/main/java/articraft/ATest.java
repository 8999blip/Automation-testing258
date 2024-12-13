package articraft;

import org.testng.Assert;

import org.testng.annotations.Test;

@SuppressWarnings("hiding")
public class ATest {
	
	@Test
	public void testAddMethod() {
		@SuppressWarnings("unused")
		A aa = new A();
		Object actResult = ((Object)add (44, 10));
		Assert.assertEquals(actResult, 56);
	
	}

	private Object add(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
