

package by.module2.task13;

import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 1.3. ��� ������ �������������� �����, ����������� �������� N. ����������, ������� � ��� �������������,
������������� � ������� ���������.
 * 
 */
public class Task13 {

	public static void main(String[] args) {
		float A[] = new float[100];
		int i;
		int positiveQuantity;
		int negativeQuantity;
		int zeroQuantity;
		int n;
		
		n = 10;
		positiveQuantity = 0;
		negativeQuantity = 0;
		zeroQuantity = 0;
		i = 0;
		

		Scanner input = new Scanner(System.in);
		
		while (i < n) {
			while (true) {
				System.out.println("������� A[" + i + "]");
				if (input.hasNextInt()) {
					A[i]  = input.nextFloat();
					break;
				} else {
					System.out.println(input.next() + " �� �����");
				}
			}				
			if (A[i] > 0) {
				positiveQuantity++;
			} else if (A[i] < 0){
				negativeQuantity++;
			} else {
				zeroQuantity++;
			}
			System.out.println("A[" + i + "]=" + A[i]);
			i++;
		}
		input.close();
		System.out.println("���������� ������������� " + positiveQuantity);
		System.out.println("���������� ������������� " + negativeQuantity);
		System.out.println("���������� ����� " + zeroQuantity);
	}
}
