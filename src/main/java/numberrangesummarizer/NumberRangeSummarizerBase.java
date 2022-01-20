package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

//@author Rudolph Myburg

public abstract class NumberRangeSummarizerBase implements NumberRangeSummarizer {
	String output = "";
	Boolean isGroup = false;

	@Override
	public Collection<Integer> collect(String input) {
		// I used a TreeSet to sort the values and to prevent duplicate values
		Set<Integer> output = new TreeSet<Integer>();
		String[] inputArray = input.split(",");
		// Prevent errors if an empty string is provided
		if (inputArray.length > 1) {

			for (String ch : inputArray) {
				// only adds numbers
				if (ch.matches("\\d+")) {
					output.add(Integer.parseInt(ch));
				}

			}

		}
		return new ArrayList<Integer>(output);
	}

}
