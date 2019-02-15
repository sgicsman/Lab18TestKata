import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {
	
	public static String add(String number) {
		
		String[] input;
		Double sum = 0.0;
		String sumOfNumbers = "";
		List<String> notAllowed = new ArrayList<String>();
		input = number.split("\\s*,\\s*");
		
		for (String element:input) {
			
			if ( element.startsWith("-") ) {	
				notAllowed.add(element);
				
			} else {
			Double j = Double.parseDouble("0" + element);
			sum += j;
			
			}
		}
		
		if (! notAllowed.isEmpty() ) {

		sumOfNumbers = "Negative not allowed: " + Arrays.toString( notAllowed.toArray() );
		
		} else {
			sumOfNumbers = Double.toString(sum);		
		}
		
		return sumOfNumbers;
	}

}
