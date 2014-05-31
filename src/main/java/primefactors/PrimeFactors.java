package primefactors;

import java.util.ArrayList;
import java.util.List;

/**
 * Prime factors kata.
 * 
 * @see https://www.youtube.com/watch?v=B93QezwTQpI
 * @author akalaszi
 * 
 */
public class PrimeFactors {

	public static List<Integer> of(int n) {
		List<Integer> result = new ArrayList<Integer>();

		int divisor = 2;
		while (n > 1) {
			while (n % divisor == 0) {
				result.add(divisor);
				n /= divisor;
			}
			divisor++;
		}

		return result;
	}

}
