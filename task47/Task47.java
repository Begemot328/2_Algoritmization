package by.module2.task47;

import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 47 �������� �����(������) ��� ���������� ����� ����������� ���� �������� ����� �� 1 �� 9.
 * 
 * 
 */
public class Task47 {

	public static void main(String[] args) {
		int n;
		int sum;
	
		
		n = 0;
		sum = 0;
		Scanner input = new Scanner(System.in);
		// ���� �����	
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, 1, 
											CommonTools.MAX_INT, false, true);

		} catch (Exception e) {
			e.printStackTrace();
		}
		// ���������� �����
		for (int i = 1; i <= n; i++) {
			if (checkIfOdd(i)) {
			sum += getFactorial(i);
			}
		}
		
		// 		����� ����������
		System.out.println("����� ����������� �� 1 �� " + n + " ����� " + sum);	
	}

	private static int getFactorial(int n) {
		int factorial = 1;
	
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static boolean checkIfOdd(int x) {
		boolean result = false;
		
		result = x % 2 != 0;
		return result;
	}
}

	