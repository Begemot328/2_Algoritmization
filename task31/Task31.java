package by.module2.task31;


/*  @author Yury Zmushko
 * 	Task 3.1. ������ ��� ���������� ������� � ��������� ����������� ��������� � ����������� ����� k. ���������� �� � 
 * ���� ������, ������� ������ ������ ����� k-� � (k+1) - � ���������� �������, ��� ���� �� ��������� �������������� ������.
 * 
 */
public class Task31 {

	public static void main(String[] args) {
		int k;
		int n;
		int m;
		int [] array1, array2;
		
		array1 = new int[20];
		array2 = new int[50];
		n = 5;
		m = 10;
		k = 3;
// ���������� ��������
		for (int i = 0; i < n; i++) {
			array1[i] = i;
		}
		for (int i = 0; i < m; i++) {
			array2[i] = i * 2;
		}
// ������� ����� �������
		for (int i = n - 1 ; i > k; i--) {
			array1[i + m] = array1[i];				
			}
// ������� ������� �������
		for (int i = 0; i < m; i++) {
			array1[i + k + 1] = array2[i];				
			}
// ����� ������� 1 
		for (int i = 0; i < m + n; i++) {
			System.out.print("A[" + i + "]" + array1[i] + "	");					
		}
	}

}
