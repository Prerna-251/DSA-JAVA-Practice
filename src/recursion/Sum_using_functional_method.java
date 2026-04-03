package recursion;

import java.util.Scanner;

public class Sum_using_functional_method {
	int sum(int num) {
		if(num == 0) {
			return 0;
		}
		return num+sum(num-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Sum_using_functional_method obj = new Sum_using_functional_method();
		System.out.print(obj.sum(num));
	}

}
