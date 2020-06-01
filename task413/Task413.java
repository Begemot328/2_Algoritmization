package by.module2.task413;

import java.io.IOException;
import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 4.13. ��� ������� ����� ���������� �����������, ���� ��� ���������� ���� �� ����� �� 2 (��������, 41 � 43).
 * ����� � ���������� ��� ���� ���������� �� ������� [n,2n], ��� n - �������� ����������� ����� ������ 2. ���
 * ������� ������ ������������ ������������.
 * 
 */
public class Task413 {

	public static void main(String[] args) {
		int n;
		int[] array;
		
		n = 0;
		array = new int[100];				
		Scanner input = new Scanner(System.in);
		// ���� �����	
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, 2, 
											CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ������������ ������� �����	
		try {
			array = getSimpleNumbers(n, 2 * n);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 		����� ����������
		System.out.println("������� �����:");
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] == 0) {
				break;
			}
			if ((array[i + 1] - array[i]) == 2) {
				System.out.println("������� �����-�������� - " + array[i] + " � " + array[i + 1]);
			}
		}
		System.out.println("That's all, folks!");
	}

	public static int getDigitsSum(int n) {
		int sum = 0;
		
		String name = Integer.toString(n);
		for (int i = 0; i < name.length(); i++)
			sum += Integer.parseInt(name.charAt(i) + "");
		return sum;
	}
	
	public static int[] getSimpleNumbers(int n1, int n2) throws IOException {
		int[] array;
		int counter;
		int n;
		
		array = new int[n2 - n1];
		counter = 0;
		n = n2 - n1;
		if (n1 <= 1 || n2 <= 1 || n1 >= n2) {
			throw new IOException("Wrong arguments");
		}
		for (int i = n1; i <= n2; i++) {
			if (checkSimple(i)) {
				array[counter] = i;
				counter++;
			}
		}
		return array;
	}
	
	public static boolean checkSimple(int n) {
		boolean result = true;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				result = false;
			}
		}
		return result;
	}
}	