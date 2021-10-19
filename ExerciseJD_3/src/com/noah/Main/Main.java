package com.noah.Main;

import java.util.Scanner;

/**
 * 
 * <h1>Contains methods for manipulating and checking input.</h1>
 * @author Noah Smith
 *
 */

public class Main {
	/**
	 * Usage:
	 * 
	 * <pre>
	 * {@code reverse(456) returns 654}
	 * </pre>
	 * 
	 * @param number (int; number to be reversed)
	 * @return Integer.parseInt(res) (int; reversed number converted to int)
	 */
	public static int reverse(int number) {
		String res = "";
		String revStr = number + "";
		
		for (int i = revStr.length() - 1; i >= 0; i--) {
			res += revStr.charAt(i) + "";
		}
		return Integer.parseInt(res);
	}
	/**
	 * Usage:
	 * 
	 * <pre>
	 * {@code isPalindrome(343) returns true
	 * isPalindrome(456) returns false
	 * }
	 * </pre>
	 * @param number (int; number to be checked)
	 * @return res (int; true or false statement)
	 */
	public static boolean isPalindrome(int number) {
		boolean res = false;
		if(number == reverse(number)) {
			res = true;
		} else {
			res = false;
		}
		return res;
	}
}
