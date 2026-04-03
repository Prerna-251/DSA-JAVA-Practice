package recursion;

import java.util.Scanner;

public class fact_using_recursion {
	int fact(int num) {
		if(num == 0) {
			return 1;
		}
		return num*fact(num-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		fact_using_recursion obj = new fact_using_recursion();
		System.out.print(obj.fact(num));
	}

}
