package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Num_freq_HashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		HashMap<Integer, Integer> mpp = new HashMap<>();
		
		for(int i=0; i<num; i++) {
			mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
		}
		
		int q = sc.nextInt();
		
		while(q>0) {
			int n = sc.nextInt();
			System.out.println(mpp.getOrDefault(n, 0));
			q--;
		}
	}

}
