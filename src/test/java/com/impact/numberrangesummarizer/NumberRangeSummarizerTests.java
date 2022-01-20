package com.impact.numberrangesummarizer;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import numberrangesummarizer.NumberRangeSummarizerBase;
import numberrangesummarizer.NumberRangeSummarizerLoop;
import numberrangesummarizer.NumberRangeSummarizerRecursion;

/*@author Rudolph Myburg

I created two different methods to produce the desired outcome 
 - In the first method i used recursion to produce the output(I think recursion is really cool)
 - In the second method i used iteration to procure the output  


Assumptions made:	
- Input string is not necessarily sorted when it is provided 
- That duplicate numbers should be removed in the input string 
- That a empty string could be provided 
- That a string might contain letters
*/

public class NumberRangeSummarizerTests {

	@Test
	public void PorvidedTest() {
		// Testing with values provided in the example
		String expected = "1, 3, 6-8, 12-15, 21-24, 31";
		String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";

		TestValues(input, expected);

	}

	@Test
	public void UnsortedValueTest() {
		// Testing values with unsorted values
		String input = "11,3,6,40,8,12,13,14,15,21,22,23,24,31,1,7";
		String expected = "1, 3, 6-8, 11-15, 21-24, 31, 40";

		TestValues(input, expected);
	}

	@Test
	public void DuplicatedValueTest() {
		// Testing with duplicate values
		String input = "1,3,6,6,7,7,8,8,8,8,12,13,14,15,21,1,22,23,24,a,31";
		String expected = "1, 3, 6-8, 12-15, 21-24, 31";

		TestValues(input, expected);
	}

	@Test
	public void EmptyValueTest() {
		// Testing with an empty string
		String input = " ";
		String expected = "";

		TestValues(input, expected);
	}

	@Test
	public void NonDigitValueTest() {
		// Testing with letters in the input string
		String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,a,31";
		String expected = "1, 3, 6-8, 12-15, 21-24, 31";

		TestValues(input, expected);

	}

	@Test
	public void ComparisonValueTest() {

		// Comparing the output of the two methods to one another
		String inputString = "1,3,6,7,8,12,13,14,15,21,22,23,24,a,31,31,4,55,3,232,1";
		NumberRangeSummarizerBase numberRangeSummarizer = new NumberRangeSummarizerRecursion();
		String outputRecursion = numberRangeSummarizer.summarizeCollection(numberRangeSummarizer.collect(inputString));

		numberRangeSummarizer = new NumberRangeSummarizerLoop();
		String outputLoop = numberRangeSummarizer.summarizeCollection(numberRangeSummarizer.collect(inputString));

		assertEquals(outputRecursion, outputLoop);

	}

	private void TestValues(String input, String expected) {
		// a private method to clean up the code
		NumberRangeSummarizerBase numberRangeSummarizer = new NumberRangeSummarizerRecursion();
		String outputRecursion = numberRangeSummarizer.summarizeCollection(numberRangeSummarizer.collect(input));

		numberRangeSummarizer = new NumberRangeSummarizerLoop();
		String outputLoop = numberRangeSummarizer.summarizeCollection(numberRangeSummarizer.collect(input));

		assertEquals(expected, outputLoop);
		assertEquals(expected, outputRecursion);
	}

}
