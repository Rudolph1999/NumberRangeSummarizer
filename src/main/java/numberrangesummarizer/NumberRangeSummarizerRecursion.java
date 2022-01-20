package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// @author Rudolph Myburg

public class NumberRangeSummarizerRecursion extends NumberRangeSummarizerBase {

	@Override
	public String summarizeCollection(Collection<Integer> input) {
		if (input.size() == 0) {
			return "";
		}

		if (input.size() == 1) {
			String tempOut = output + ((List<Integer>) (input)).get(0);
			output = "";
			isGroup = false;
			return tempOut;
		}
		if (((ArrayList<Integer>) input).get(0) + 1 == ((ArrayList<Integer>) input).get(1)) {
			if (!isGroup) {
				output += ((List<Integer>) (input)).get(0) + "-";
				isGroup = true;
			}

		} else {
			output += ((List<Integer>) (input)).get(0) + ", ";
			isGroup = false;
		}
		((List<Integer>) (input)).remove(0);
		return summarizeCollection(input);

	}

}