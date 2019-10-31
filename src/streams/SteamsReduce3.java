package streams;

import java.util.Arrays;
import java.util.List;

/** 
 * Stream.reduce(): a stream reduces to single resultant value
 * T reduce(T Identity, BinaryOperator<T> accumulator);
 *
 */

public class SteamsReduce3 {

	public static void main(String[] args) {
		
		List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);
		
		int sum = array.parallelStream().reduce(0,
				(element1, element2) -> element1 + element2);
		
		System.out.println("The sum of all element is" + sum);

	}

}
