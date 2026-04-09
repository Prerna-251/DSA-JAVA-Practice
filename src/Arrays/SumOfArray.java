package Arrays;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Array is : ");
		
		for(int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		System.out.print("\nThe sum is : "+sum);

	}

}
