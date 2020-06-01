

package by.module2.task26;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 2.6. ������������ ���������� ������� ������� n �� ��������� �������(n - ������):
 * 
 */
public class Task26 {

	public static void main(String[] args) {
		int a[][] = new int[30][30];
		int n;
		int m;
		final int ONE = 1;
		
		// ���� ����������� �������				
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("������� n");
			if (input.hasNextInt()) {
				n  = input.nextInt();
				m = n / 2;
				if ((m * 2) == n) {
					break;
				} else {
					System.out.println(n + " �� ������");
				}
			} else {
				System.out.println(input.next() + " �� �����");
			}
		}
		input.close(); 
// 		���������� �������		
		for (int i = 0; i <= m; i++) {
			for (int j = i; j < n - i; j++) {
				a[i][j] = ONE;
				a[(n - i - 1)][j] = ONE;
			}
		}
//		����� �������		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "	");
			}
			System.out.println();
		}
	}
}
