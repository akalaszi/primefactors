package primefactors;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class PrimeFactorsTest {
	@Test
	public void primeFacorsTest() {
		Assert.assertEquals(Arrays.asList(), PrimeFactors.of(1));
		Assert.assertEquals(Arrays.asList(2), PrimeFactors.of(2));
		Assert.assertEquals(Arrays.asList(3), PrimeFactors.of(3));
		Assert.assertEquals(Arrays.asList(2, 2), PrimeFactors.of(4));
		Assert.assertEquals(Arrays.asList(5), PrimeFactors.of(5));
		Assert.assertEquals(Arrays.asList(2, 3), PrimeFactors.of(6));
		Assert.assertEquals(Arrays.asList(7), PrimeFactors.of(7));
		Assert.assertEquals(Arrays.asList(2, 2, 2), PrimeFactors.of(8));
		Assert.assertEquals(Arrays.asList(3, 3), PrimeFactors.of(9));
		Assert.assertEquals(Arrays.asList(2, 2, 3, 3, 7),
				PrimeFactors.of(2 * 2 * 3 * 3 * 7));
	}
}
