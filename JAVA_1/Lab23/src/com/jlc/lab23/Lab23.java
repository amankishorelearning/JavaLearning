/**
 * 
 */
package com.jlc.lab23;

/**
 * @author Aman Kishore
 * Objective: Learning character Literals
 * Learning: What all is not valid with char.
 */
public class Lab23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//char ch1 = ''; Empty character literal is not allowed . Compiler expects at lest a carriage return unlike string == "";
		char ch2 = ' ';
		//char ch3 = 'AB'; Exactly one character
		//char ch4 = '\'; This is invalid escape sequence making the char incomplete.
		//char ch5 = '''; compiler reads this as two quotes, that is all what it need, why there is a next one, hence java makes it incomplete.
		
	}

}
