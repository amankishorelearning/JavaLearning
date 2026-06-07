/**
 * 
 */

/**
 * @author Aman Kishore
 * Objective: Learning String literals
 * Learning: when using backslash in the directory path, use two slashes when dir path is taken as string.
 */
public class Lab43 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String dir1 = "D:\new\test\batch";
		System.out.println(dir1);
		String dir2 = "D:\\new\\test\\batch";
		System.out.println(dir2);
	}

}
