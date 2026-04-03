package recursion;

import java.util.Scanner;

public class Sum_using_parameterized_method {
	void print(int num, int sum) {
		if(num < 1) {
			System.out.println(sum);
			return;
		}
		print(num-1, sum+num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		Sum_using_parameterized_method obj = new Sum_using_parameterized_method();
		obj.print(num, sum);
	}

}
