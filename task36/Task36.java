package by.module2.task36;

import java.util.Random;

import by.module2.common.CommonTools;

/*  @author Yury Zmushko
 * 	Task 3.6. ���������� �����. ��� ������ n �������������� �����. ��������� ����������� ��� �� �����������. 
 * �������� ��� ��������� �������: ������������ ��� �������� �������� ai � ai+1 . ���� ai ai+1 , �� ������������
 * �� ���� ������� ������. ���� ai  ai+1 , �� ������������ ������������ � ���������� �� ���� ������� �����.
 * ��������� �������� ���� ����������.
 * 
 */
public class Task36 {

	public static void main(String[] args) {
		int counter;
		double temp;
		int n;
		double [] array;
		
		array = new double[20];
		n = 10;
		counter = 0;
		temp = 999;
		
		//	 ���������� �������
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = random.nextDouble();
		}
		// ����� ������� �� ����������		
		System.out.println("�������� ������");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array[i] + "	");					
		}
		System.out.println();
		
		// 	����������
		do {
			if (array[counter] <= array[counter + 1]) {
				counter++;
			} else {
				temp = array[counter];
				array[counter] = array[counter + 1];
				array[counter + 1] = temp;
				counter--;
			}
			if (counter < 0) {
				counter  = 0;
			}
		} while (counter < n - 1);

		// 	����� ������� ����� ����������
		System.out.println("��������������� ������");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array[i] + "	");					
		}
	}
}
