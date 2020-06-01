package by.module2.task42;

import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 42 - �������� �����(������) ��� ���������� ����������� ������ �������� ������� ����������� �����.
 * 
 * 
 */
public class Task42 {

	public static void main(String[] args) {
		int nOD;
		int a;
		int b;
		int c;
		int d;
		int n;
		
		nOD = 0;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		n = 4;
		
		// ���� ����� 				
		Scanner input = new Scanner(System.in);
		try {
			a  = (int) CommonTools.readBetween(input, "a", Types.INT, CommonTools.ZERO, 
												CommonTools.MAX_INT, false, true);
			b  = (int) CommonTools.readBetween(input, "b", Types.INT, CommonTools.ZERO, 
												CommonTools.MAX_INT, false, true);

			c  = (int) CommonTools.readBetween(input, "c", Types.INT, CommonTools.ZERO, 
												CommonTools.MAX_INT, false, true);
			d  = (int) CommonTools.readBetween(input, "d", Types.INT, CommonTools.ZERO, 
					CommonTools.MAX_INT, false, true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		input.close();
		
		// ����� ��� � ���
		nOD = getNOD(n, a, b, c, d);
		
		// 	����� �����������
		System.out.println("����������");
		if (nOD == 0) {
			System.out.println("��� �� �������");
		} else {
			System.out.println("��� = " + nOD);
		}
	}
	
	public static int getNOD(int n, int ... args) {
		int nOD;
		boolean condition;
		int min;
		
		min =CommonTools.MAX_INT;
		nOD = 0;
		for (int j = 0; j < n; j++) {
			min = Math.min(args[0], min);
		}
		
		for (int j = 2; j <= min; j++) {
			condition = true;
			for (int i = 0; i < n; i++) {
				condition = args[i]%j == 0 && condition;
			}
			if (condition) {
				nOD = j;
			}
		}
		return nOD;
	}
}

	