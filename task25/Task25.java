

package by.module2.task25;

import java.util.Scanner;

import by.module2.task11.Task11;
/*  @author Yury Zmushko
 * 	Task 2.5. ������������ ���������� ������� ������� n �� ��������� �������(n - ������):
 * 
 */
public class Task25 {

	public static void main(String[] args) {
		int a[][] = new int[30][30];
		int n;
		
// ���� ����������� �������		
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
		
		input.close(); 
// ���������� �������	
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				a[i][j] = i + 1;
			}
		}
//		����� �������
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}
	}
}
