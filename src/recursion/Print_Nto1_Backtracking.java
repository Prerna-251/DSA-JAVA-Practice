package recursion;

import java.util.Scanner;

public class Print_Nto1_Backtracking {
	void print(int num, int count) {
		if(count > num) {
			return;
		}
		print(num, count+1);
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Print_Nto1_Backtracking obj = new Print_Nto1_Backtracking();
		obj.print(num, 1);
	}

}
