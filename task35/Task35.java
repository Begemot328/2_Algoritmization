package by.module2.task35;

import java.util.Random;

import by.module2.common.CommonTools;

/*  @author Yury Zmushko
 * 	Task 3.5. ���������� ���������. ���� ������������������ �����. ��������� ����������� ����� � �������
 * �����������. �������� ��� ��������� �������. ����� a1,a2,ai - ������������� ������������������, �. �.
 * a1 a2 an . ������� ��������� ����� ai+1 � ����������� � ������������������ ���, ����� �����
 * ������������������ ���� ���� ������������. ������� ������������ �� ��� ���, ���� ��� �������� �� i +1 �� n
 * �� ����� ���������. ����������. ����� ��������� ���������� �������� � ��������������� ����� �����������
 * � ������� ��������� ������. �������� ����� �������� � ���� ��������� �������.
 * 
 */
public class Task35 {

	public static void main(String[] args) {
		int max;
		int temp;
		int n;
		int nMiddle;
		int [] array;
		
		array = new int[20];
		n = 10;
		nMiddle = 0;
		max = CommonTools.MIN_INT;

		//	 ���������� �������
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = random.nextInt(10) * (int) Math.pow(-1, random.nextInt(2));
		}
		// ����� ������� �� ����������		
		System.out.println("�������� ������");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array[i] + "	");					
		}
		System.out.println();
		// 	����������
		for (int i = 1; i < n; i++) {
			if (array[i] < array[i - 1]) {
				nMiddle = searchPlase(array, i);
				temp = array[i];
				for (int j = i; j > nMiddle; j--) {
					array[j] = array[j - 1];
				}
				array[nMiddle] = temp;
			}
		}

		// 	����� ������� ����� ����������
		System.out.println("��������������� ������");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]" + array[i] + "	");					
		}
	}

	private static int searchPlase(int[] array, int n) {
		int a;
		// � ������� ������� ����� ��� �������� n �����, ����� �� ���� ������������ ������ ��� �� �����������		
		a = 0;
		for (int i = 1; i < n; i++) {
			if ((array[n] >= array[i - 1]) && (array[n] <= array[i])){
				a = i;
			}
		}
		return a;
	}
}
