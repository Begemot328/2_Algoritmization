package by.module2.task414;

import java.io.IOException;
import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 4.14. ����������� �����, � ������ �������� n ����, ���������� ������ ����������, ���� ����� ��� ����,
����������� � ������� n, ����� ������ �����. ����� ��� ����� ���������� �� 1 �� k. ��� ������� ������
������������ ������������.
 * 
 */
public class Task414 {

	public static void main(String[] args) {
		int k;
		int[] array;
		
		k = 0;
		array = new int[100];				
		Scanner input = new Scanner(System.in);
		// ���� �����	
		try {
		k  = (int) CommonTools.readBetween(input, "k", Types.INT, CommonTools.ZERO, 
											CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ������������ ������� �����	
		try {
			array = getArmstrongNumbers(k);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 		����� ����������
		System.out.println("����� ����������:");
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 0) {
				break;
			}
				System.out.println((i + 1) + ". "  + array[i]);
		}
		System.out.println("That's all, folks!");
	}
	
	public static int[] getArmstrongNumbers(int n) throws IOException {
		int[] array;
		int counter;
		
		array = new int[n];
		counter = 0;
		if (n <= 0) {
			throw new IOException("Wrong arguments");
		}
		for (int i = 1; i <= n; i++) {
			if (Math.pow(CommonTools.getDigitsSum(i), Integer.toString(i).length()) == i) {
				array[counter] = i;
				counter++;
			}
		}
		return array;
	}
}	
