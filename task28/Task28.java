

package by.module2.task28;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 2.8. � �������� ������� �������� ������� ��� ������� ����� �������, �. �. ��� �������� ������ ������� ��������� 
 * �� ��������������� �� ������� �������, � ��� �������� ������� ����������� � ������. ������ �������� ������
 * ������������ � ����������.
 * 
 */
public class Task28 {

	public static void main(String[] args) {
		float a[][] = new float[30][30];
		int n;
		int m;
		int k;
		int l;
		float temp;
		
		// ���� ������������ �������				
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("������� n");
			if (input.hasNextInt()) {
				n  = input.nextInt();
				if(n > 0) {
					break;
				} else {
					System.out.println(input.next() + " �� ������������� �����");
				}
			} else {
				System.out.println(input.next() + " �� �����");
			}
		}
		
		while (true) {
			System.out.println("������� m");
			if (input.hasNextInt()) {
				m  = input.nextInt();
				if(m > 0) {
					break;
				} else {
					System.out.println(input.next() + " �� ������������� �����");
				}
			} else {
				System.out.println(input.next() + " �� �����");
			}
		}
		
// 		���������� �������		
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
// ���� ������� ���������� �������� �������
		while (true) {
			System.out.println("������� k");
			if (input.hasNextInt()) {
				k  = input.nextInt();
				if(k > 0 && k < m) {
					break;
				} else {
					System.out.println(input.next() + " ������������ �����");
				}
			} else {
				System.out.println(input.next() + " �� �����");
			}
		}
		
		while (true) {
			System.out.println("������� l");
			if (input.hasNextInt()) {
				l  = input.nextInt();
				if(l > 0 && l < m && l != k) {
					break;
				} else {
					System.out.println(input.next() + " ������������ �����");
				}
			} else {
				System.out.println(input.next() + " �� �����");
			}
		}
		input.close(); 
		
// 		������ ��������		
		for (int i = 0; i < n; i++) {
			temp = a[i][k];
			a[i][k] = a[i][l];
			a[i][l] = temp;
		}
		
//		����� �������		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}
	}
}
