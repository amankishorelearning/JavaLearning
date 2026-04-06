/**
 * 
 */
package com.jlc.lab12;

/**
 * @author Aman Kishore
 * Objective: understanding that the final keyword qualified variable is not editable / mutable
 * Learning: a keyword which is final keyword qualified can't be updated again.
 */
public class Lab12 {
	public static void main(String[] args) {
		final int a = 99;
		System.out.println(a);
		//a = 88;
		System.out.println(a);
	}

}
