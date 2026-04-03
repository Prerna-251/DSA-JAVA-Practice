package recursion;

import java.util.Scanner;
public class print_1toN {
	void print(int num, int count) {
		if(count > num) {
			return;
		}
		System.out.println(count);
		print(num, count+1);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		print_1toN obj = new print_1toN();
		obj.print(num,1);
	}
}
