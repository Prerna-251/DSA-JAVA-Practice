package sorting;

import java.util.Scanner;

public class Bubble_sort {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int arr[] = new int[a];
		 
		 for(int i=0; i<a; i++) {
			 arr[i] = sc.nextInt();
		 }
		 int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            boolean swapped = false;

	            for (int j = 0; j < n - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                   
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }

	            if (!swapped) break;
	        }

	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	}

}
