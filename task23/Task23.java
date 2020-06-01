

package by.module2.task23;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 2.3. ���� �������. ������� k-� ������ � p-� ������� �������.
 * 
 */
public class Task23 {

	public static void main(String[] args) {
		int a[][] = new int[30][30];
		int n;
		int m;
		int k;
		int p;
		
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("������� n");
			if (input.hasNextInt()) {
				n  = input.nextInt();
				break;
			} else {
				System.out.println(input.next() + " �� �����");
			}
		}
		while (true) {
			System.out.println("������� m");
			if (input.hasNextInt()) {
				m  = input.nextInt();
				break;
			} else {
				System.out.println(input.next() + " �� �����");
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				while (true) {
					System.out.println("������� A[" + i + "]" + "[" + j + "]");
					if (input.hasNextInt()) {
						a[i][j]  = input.nextInt();
						break;
					} else {
						System.out.println(input.next() + " �� �����");
					}
				}
			}	
		}
		
		while (true) {
			System.out.println("������� k");
			if (input.hasNextInt()) {
				k  = input.nextInt();
				break;
			} else {
				System.out.println(input.next() + " �� �����");
			}
		}
		
		if (k <= n) {
			k--;	
			for (int i = 0; i < n; i++) {
				System.out.println("A[" + i + "]" + "[" + k + "]= " + a[i][k]);
			}
		} else {
			System.out.println("��� �������");
		}
		
		while (true) {
			System.out.println("������� p");
			if (input.hasNextInt()) {
				p  = input.nextInt();
				break;
			} else {
				System.out.println(input.next() + " �� �����");
			}
		}
		
		if (p <= m) {
			p--;	
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + p + "]" + "[" + j + "]= " + a[p][j] + "      ");
			}
		} else {
			System.out.println("��� �������");
		}
		input.close();
	}
}
