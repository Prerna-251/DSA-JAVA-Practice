package recursion;

import java.util.Scanner;
public class Reverse_array {
	void reverse(int arr[], int l, int r) {
		if(l >= r) {
			return;
		}
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		
		reverse(arr, l+1, r-1);
	}
	void printArray(int arr[]) {
		System.out.print("\nArray after reverse : ");
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Array before reverse : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
//		int arr[] = {8,6,7,5,9,3};
		Reverse_array obj = new Reverse_array();
		obj.reverse(arr, 0, arr.length-1);
		
		obj.printArray(arr);
	}
}
