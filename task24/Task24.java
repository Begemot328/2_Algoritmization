

package by.module2.task24;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 2.4. ������������ ���������� ������� ������� n �� ��������� �������(n - ������):
 * 
 */
public class Task24 {

	public static void main(String[] args) {
		int a[][] = new int[30][30];
		int n;
		int m;
		
		
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("������� n");
			if (input.hasNextInt()) {
				n  = input.nextInt();
				m = n / 2;
				if ((m * 2) == n) {
					System.out.println("m " + m);
					break;
				} else {
					System.out.println(n + " �� ������");
				}
			} else {
				System.out.println(input.next() + " �� �����");
			}
		}
		input.close(); 
		
		for (int i = 0; i <= m; i += 2) {
			for (int j = 0; j < n; j++) {
				a[i][j] = j + 1;
				a[(i + 1)][j] = n - j;
				System.out.println(i + " " + j);
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}
	}
}
