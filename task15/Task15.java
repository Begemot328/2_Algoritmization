

package by.module2.task15;

import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 1.5. ���� ����� ����� �1 ,�2 ,..., �n . ������� �� ������ ������ �� �����, ��� ������� �i > i.
 * 
 */
public class Task15 {

	public static void main(String[] args) {
		int A[] = new int[100];
		int i;
		int n;
		
		n = 5;
		i = 0;

		Scanner input = new Scanner(System.in);
		
		while (i < n) {
			while (true) {
				System.out.println("������� A[" + i + "]");
				if (input.hasNextInt()) {
					A[i]  = input.nextInt();
					break;
				} else {
						System.out.println(input.next() + " �� �����");
				}
			}		
			i++;
		}
		input.close();
		System.out.println("���������� ������ ");
		i = 0;
		while (i < n) {
			if (A[i] > i) {
			System.out.println("A[" + i + "]=" + A[i]);
			}
			i++;
		}
	}
}
