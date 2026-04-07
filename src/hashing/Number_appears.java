package hashing;

import java.util.Scanner;

public class Number_appears {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		int hash[] = new int[13];   //default value = 0
		
		//Frequency count
		for(int i=0; i<a; i++) {
			hash[arr[i]] += 1; 
		}
		
		int q = sc.nextInt();
		while(q>0) {
			int num = sc.nextInt();
			System.out.println(hash[num]);
			q--;
		}
	}

}
