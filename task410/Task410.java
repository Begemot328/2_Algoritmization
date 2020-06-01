package by.module2.task410;

import java.io.IOException;
import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 4.10. ���� ����������� ����� N. �������� �����(������) ��� ������������ �������, ���������� ��������
�������� ����� ����� N.
 * 
 */
public class Task410 {

	public static void main(String[] args) {
		int n;
		int [] elements;
		
		n = 0;
		elements = new int[100];
						
		Scanner input = new Scanner(System.in);
		// ���� �����	
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, 0, 
											CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ��������� �������
			try {
				elements = CommonTools.getDigits(n);
			} catch (IOException e) {
				e.printStackTrace();
			}
		// 		����� ����������
		System.out.println("�����  " + n + " ������� �� ����:");
		for (int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + " ");
		}
	}
}	