package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//@author Rudolph Myburg

public class NumberRangeSummarizerLoop extends NumberRangeSummarizerBase {

	@Override
	public String summarizeCollection(Collection<Integer> input) {
		if (input.size() == 0) {
			return "";
		}
		for (int i = 0; i < input.size() - 1; i++) {
			if (((ArrayList<Integer>) input).get(i) + 1 == ((ArrayList<Integer>) input).get(i + 1)) {
				if (!isGroup) {
					output += ((List<Integer>) (input)).get(i) + "-";
					isGroup = true;
				}

			} else {
				output += ((List<Integer>) (input)).get(i) + ", ";
				isGroup = false;
			}
		}
		String tempOut = output + ((List<Integer>) (input)).get(input.size() - 1);
		output = "";
		isGroup = false;
		return tempOut;
	}

}
