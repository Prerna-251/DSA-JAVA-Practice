package hashing;

import java.util.*;

public class Character_appears {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int hash[] = new int[255];

		for(int i=0; i<str.length(); i++) {
			hash[str.charAt(i)]++;
		}
		int q = sc.nextInt();
		
		while(q>0) {
			char ch = sc.next().charAt(0);
			System.out.print(hash[ch]+"");
		}
	}

}
