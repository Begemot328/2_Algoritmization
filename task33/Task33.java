package by.module2.task33;

import java.util.Random;

import by.module2.common.CommonTools;

/*  @author Yury Zmushko
 * 	Task 3.3. ���������� �������. ���� ������������������ �����. ��������� ����������� �������� ���,
 * ����� ��� ���� ����������� �� ��������. ��� ����� � �������, ������� � �������, ���������� ����������
 * ������� � �������� �� ������ �����, � ������ - �� ����� �����������. �����, ������� �� �������, ��� ���������
 * �����������. �������� �������� ���������� �������.
 * 
 */
public class Task33 {

	public static void main(String[] args) {
		int max;
		int temp;
		int n;
		int nMax;
		int [] array;
		
		array = new int[20];
		n = 10;
		nMax = 0;
		max = CommonTools.MIN_INT;

// ���������� �������
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = random.nextInt(100);
		}
// ����� ������� �� ����������		
		System.out.println("�������� ������");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array[i] + "	");					
		}
// ����������
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}

// ����� ������� ����� ����������
		System.out.println();
		System.out.println("��������������� ������");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array[i] + "	");					
		}
	}

}
