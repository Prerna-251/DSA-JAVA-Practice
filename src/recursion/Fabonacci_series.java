package recursion;

import java.util.Scanner;

public class Fabonacci_series {
	void fabonacci(int num) {
		int n0 = 0, n1 = 1;
		if(num <= 0) {
			return;
		}
		if( num == 1) {
			System.out.print(n0);
			return;
		}
		System.out.print(n0+" "+n1);
		for(int i=2; i<num; i++) {
			int n2 = n0 + n1;
			System.out.print(" "+n2);
			n0 = n1; 
			n1 = n2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Fabonacci_series obj = new Fabonacci_series();
		obj.fabonacci(num);
	}

}
