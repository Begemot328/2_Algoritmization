

package by.module2.task27;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 2.7. ������������ ���������� ������� ������� N �� �������:
 *  � ���������� ���������� ������������� ��������� � ���.
 * 
 */
public class Task27 {

	public static void main(String[] args) {
		double a[][] = new double[30][30];
		int n;
		double iDouble;
		double jDouble;
		int positiveQuantity;
		
		iDouble = 0;
		jDouble = 0;
		positiveQuantity = 0;
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
			for (int j = 1; j < n; j++) {
				iDouble = i;
				jDouble = j;
				a[i][j] = Math.sin((iDouble * iDouble - jDouble * jDouble) / n);
				//System.out.println(a[i][j] + " " +  (iDouble * iDouble - jDouble * jDouble) + );
				if (a[i][j] > 0) {
					positiveQuantity++;
				}
			}
		}
//		����� �������		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}
		System.out.println("����� ������������� " + positiveQuantity);
	}
}
