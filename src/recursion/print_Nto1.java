package recursion;

import java.util.Scanner;
public class print_Nto1 {
	void print(int num) {
		if(num == 0) {
			return;
		}
		System.out.println(num);
		print(num-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		print_Nto1 obj = new print_Nto1();
		obj.print(num);
	}

}
