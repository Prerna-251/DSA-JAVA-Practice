package recursion;

import java.util.Scanner;

public class Power_of_number {
    
	static double power(int x, int n) {
	    if (n == 0) return 1;

	    if (n < 0) {
	        return 1.0 / power(x, -n);
	    }

	    return x * power(x, n - 1);
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter power (n): ");
        int n = sc.nextInt();

        double result = power(x, n);
        System.out.println("Result: " + result);

        sc.close();
    }
}