

package by.module2.task21;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 2.1. ���� �������. ������� �� ����� ��� �������� �������, � ������� ������ ������� ������ ����������.
 * 
 */
public class Task21 {

	public static void main(String[] args) {
		int a[][] = new int[30][30];
		int n;
		int m;
		int k;
		
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

		input.close();
		k = 0;
		for (int i = 0; i < n; i++) {
			if (k > 0) {
				k = 0;	
			} else {
				k++;
				if (a[i][0] > a[i][m - 1] ) {
					for (int j = 0; j < m; j++) {
						System.out.println("A[" + i + "]" + "[" + j + "]= " 
											+ a[i][j]);
					}
				}
			} 
		}
	}
}
