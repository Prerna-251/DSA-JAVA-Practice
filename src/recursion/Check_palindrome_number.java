package recursion;

import java.util.Scanner;
public class Check_palindrome_number {
	int reverse(int num, int rev) {
		if(num == 0) {
			return rev;
		}
		return reverse(num / 10, rev * 10 +(num%10));
	}
	void check(int num) {
		int result = reverse(num, 0);
		
		if(num == result) {
			System.out.println("true");
        } else {
            System.out.println("false");
        }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Check_palindrome_number obj = new Check_palindrome_number();
		obj.check(num);
	}

}
