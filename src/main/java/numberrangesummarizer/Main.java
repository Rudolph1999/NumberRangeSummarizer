package numberrangesummarizer;

/* @author Rudolph Myburg
 * 
 * I created two different methods to produce the desired outcome 
 * In the first method i used recursion to produce the output(I think recursion is really cool)
 * In the second method i used iteration to procure the output  */

public class Main {

	public static void main(String[] args) {

		String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
		System.out.print(" Rudolph Myburg  number range summarizer\n");
		System.out.print("==========================================\n");
		System.out.print("         Method using Recurtion\n\n");
		System.out.print("Input: " + input + "\n");
		NumberRangeSummarizerBase numberRangeSummarizer = new NumberRangeSummarizerRecursion();
		System.out.print(
				"Output " + numberRangeSummarizer.summarizeCollection(numberRangeSummarizer.collect(input)) + "\n");
		System.out.print("==========================================\n");
		System.out.print("==========================================\n");
		System.out.print("         Method using iteration\n\n");
		System.out.print("Input: " + input + "\n");
		numberRangeSummarizer = new NumberRangeSummarizerLoop();
		System.out.print("Output " + numberRangeSummarizer.summarizeCollection(numberRangeSummarizer.collect(input)));

	}

}
