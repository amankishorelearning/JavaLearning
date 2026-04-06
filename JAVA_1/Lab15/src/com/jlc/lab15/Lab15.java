/**
 * 
 */
package com.jlc.lab15;

/**
 * @author Aman Kishore
 * Objective: understanding that final keyword can't be modified.
 * Learning: once final keyword qualified variable is initialized, it can't be updated again.
 */
public class Lab15 {
	public static void main(String[] args) {
		final int a;
		a = 99;
		System.out.println(a);
		//a = 88;
		System.out.println(a);
	}

}
