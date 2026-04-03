package recursion;

import java.util.Scanner;

public class Print_1toN_Backtracking {
	void print(int num) {
		if(num == 0) {
			return;
		}
		print(num-1);
		System.out.println(num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Print_1toN_Backtracking obj = new Print_1toN_Backtracking();
		obj.print(num);
	}

}
