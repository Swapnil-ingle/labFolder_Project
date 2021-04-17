package com.github.swapnil.LabFolderProject.common;

/**
 * 
 * A util class to calculate the Levenshtien Distance between two Strings
 * 
 * @author Swap
 *
 */
public class LevenshtienDistanceUtil {
	/**
	 * Simple helper method which compares two String and evaluates if the
	 * Levenshtien Distance is under the passed upperBound
	 * 
	 * @param curr
	 * @param target
	 * @param upperBound
	 * @return
	 */
	public static boolean isLevenshtienDistanceWithinBound(String curr, String target, int upperBound) {
		return calculateLevenshtienDistance(curr, target) <= upperBound;
	}

	/**
	 * 
	 * Levenshtien Distance is the number of minimum operations required to convert
	 * Str1 to Str2
	 * 
	 * @param curr
	 * @param target
	 * @return
	 */
	public static int calculateLevenshtienDistance(String curr, String target) {
		if (curr.length() == 0) {
			return target.length();
		}

		if (target.length() == 0) {
			return curr.length();
		}

		if (lastCharOf(curr).equals(lastCharOf(target))) {
			return calculateLevenshtienDistance(deleteLastChar(curr), deleteLastChar(target));
		}

		return 1 + (Math.min(
				calculateLevenshtienDistance(deleteLastChar(insertLastChar(curr, target)), deleteLastChar(target)),
				Math.min(
						calculateLevenshtienDistance(deleteLastChar(replaceLastCharOf(curr, lastCharOf(target))), deleteLastChar(target)),
						calculateLevenshtienDistance(deleteLastChar(curr), target))));
	}

	private static String insertLastChar(String from, String to) {
		return from.concat(lastCharOf(to));
	}

	private static String deleteLastChar(String input) {
		return input.substring(0, input.length() - 1);
	}

	private static String replaceLastCharOf(String input, String with) {
		return input.substring(0, input.length() - 1).concat(with);
	}

	private static String lastCharOf(String input) {
		return input.length() == 0 ? "" : input.substring(input.length() - 1);
	}
}
