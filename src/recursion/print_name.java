package recursion;

import java.util.Scanner;
public class print_name {
	void print(String name, int count, int num) {
		if(count == num) {
			return;
		}
		System.out.println(name);
		print(name, count+1, num);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = sc.nextInt();
		print_name name = new print_name();
		name.print(str,0,num);
	}
}
