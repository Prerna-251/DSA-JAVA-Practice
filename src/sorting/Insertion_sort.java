package sorting;

import java.util.Scanner;

public class Insertion_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		int n = arr.length;
		for(int i=0; i<=n-1; i++) {
			int j = i;
			while(j > 0 && arr[j-1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				
				j--;
			}
		}
		
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}

}
