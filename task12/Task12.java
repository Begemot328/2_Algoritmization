package by.module2.task12;

/*  @author Yury Zmushko
 * 	Task 1.2. ���� ������������������ �������������� ����� �1 ,�2 ,..., ��. �������� ��� �� �����, ������� ������� Z, ����
������. ���������� ���������� �����.
 * 
 */
public class Task12 {

	public static void main(String[] args) {
		float A[] = new float[10];
		int i;
		int z;
		int substituteQuantity;
		int n;
		
		n = 10;
		substituteQuantity = 0;
		z = 6;
		i = 0;
		while (i < n) {
			A[i] = i;
			if (A[i] > z) {
				A[i] = z;
				substituteQuantity++;
			}
			System.out.println("A[" + i + "]=" + A[i]);
			i++;
		}
		System.out.println("���������� ����� " + substituteQuantity);
	}
}