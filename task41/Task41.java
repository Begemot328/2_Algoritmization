package by.module2.task41;

import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 41 - �������� �����(������) ��� ���������� ����������� ������ �������� � ����������� ������ �������� ����
����������� �����
 * 
 * 
 */
public class Task41 {

	public static void main(String[] args) {
		int nOK;
		int nOD;
		int a;
		int b;
		
		nOK = 0;
		nOD = 0;
		a = 0;
		b = 0;
		
		// ���� ����� 				
		Scanner input = new Scanner(System.in);
		try {
			a  = (int) CommonTools.readBetween(input, "a", Types.INT, CommonTools.ZERO, 
												CommonTools.MAX_INT, false, true);
			b  = (int) CommonTools.readBetween(input, "b", Types.INT, CommonTools.ZERO, 
												CommonTools.MAX_INT, false, true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		input.close();
		
		// ����� ��� � ���
		nOK = getNOK(a, b);
		nOD = getNOD(a, b);
		
		// 	����� �����������
		System.out.println("����������");
		if (nOK == 0) {
			System.out.println("��� �� �������");
		} else {
			System.out.println("��� = " + nOK);
		}
		System.out.println("����������");
		if (nOD == 0) {
			System.out.println("��� �� �������");
		} else {
			System.out.println("��� = " + nOD);
		}
	}
	
	public static int getNOK(int a, int b) {
		int nOK;
		int quotient1;
		int quotient2;
		int divider;
	
		nOK = 0;
		quotient1 = a;
		quotient2 = b;
		divider = 1;
		for (int j = 2; j <= Math.min(a, b); j++) {
			while (quotient1%j == 0 && quotient2%j == 0) {
				quotient1 /=j;
				quotient2 /=j;
				divider *= j;  
				System.out.println(j + " divider = " + divider + " quotient = " + quotient1);
			}
		}
		nOK = a * b / divider;
		return nOK;
	}
	
	public static int getNOD(int a, int b) {
		int nOD;
		int quotient;
		int divider;

		nOD = 0;
		quotient = b;
		divider = 1;
		for (int j = 2; j <= Math.min(a, b); j++) {
			if (a%j == 0 && quotient%j == 0) {
				nOD = j;
			}
		}
		return nOD;
	}
}

	