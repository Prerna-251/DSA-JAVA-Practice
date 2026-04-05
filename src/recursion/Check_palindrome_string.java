package recursion;

import java.util.Scanner;
public class Check_palindrome_string {
	boolean isPalindrome(String str, int i) {
//		if(l >= r) {
//			return true;
//		}
//		
//		if(str.charAt(l) != str.charAt(r)) {
//			return false;
//		}
//		return isPalindrome(str, l+1, r-1);
		
		if(i >= str.length() / 2) {
			return true;
		}
		if(str.charAt(i) != str.charAt(str.length()-i-1)) {
			return false;
		}
		return isPalindrome(str, i+1);	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		Check_palindrome_string obj = new Check_palindrome_string();
		
		boolean result = obj.isPalindrome(str, 0);
		System.out.print(result);
	}
}
