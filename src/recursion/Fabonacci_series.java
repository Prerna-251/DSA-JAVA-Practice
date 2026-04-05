package recursion;

import java.util.Scanner;

public class Fabonacci_series {
	 int fabonacci(int num) {
		if(num <= 1) {
			return num;
		}
		return fabonacci(num-1) + fabonacci(num-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Fabonacci_series obj = new Fabonacci_series();
		for(int i=0; i<num; i++) {
			System.out.print(obj.fabonacci(i)+" ");
		}
	}
}
