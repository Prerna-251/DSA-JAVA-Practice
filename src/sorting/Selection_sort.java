package sorting;

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int arr[] = new int[a];
		 for(int i=0; i<a; i++) {
			 arr[i] = sc .nextInt();
		 }
		 int n = arr.length;

	        for (int i = 0; i < n - 2; i++) {
	            int minIndex = i;

	            for (int j = i; j <= n-1; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            // swap
	            int temp = arr[i];
	            arr[i] = arr[minIndex];
	            arr[minIndex] = temp;
	        }  
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	}

}
