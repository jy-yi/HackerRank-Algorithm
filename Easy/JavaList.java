package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Java List
 * @author jy-yi
 * 
 * Given a list, L, of N integers, perform Q queries on the list.
 * Once all queries are completed, print the modified list as a single line of space-separated integers.
 *
 */
public class JavaList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}

		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			String query = sc.next();
			switch (query) {
			case "Insert":
				list.add(sc.nextInt(), sc.nextInt());
				break;
			case "Delete":
				list.remove(sc.nextInt());
				break;
			}
		}
		
		sc.close();
		
		for (Integer integer : list) {
			System.out.print(integer +" ");
		}
	}
}
