package by.module2.task411;

import java.io.IOException;
import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 4.11. �������� �����(������), ������������, � ����� �� ������ ���� ����� ������ ����. 
 * 
 */
public class Task411 {

	public static void main(String[] args) {
		int n;
		int m;
		
		n = 0;
		m = 0;
						
		Scanner input = new Scanner(System.in);
		// ���� �����	
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, 0, 
											CommonTools.MAX_INT, false, true);
		m  = (int) CommonTools.readBetween(input, "m", Types.INT, 0, 
				CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 		����� ����������
		if (isLonger(n, m)) {
			System.out.println("�����  " + n + " ������� ����� " + m);
		} else if (isLonger(m, n)) {
			System.out.println("�����  " + m + " ������� ����� " + n);
		} else {
			System.out.println("�����  " + m + " � " + n + " ����� �� �����");
		}
	}

	public static int getDigitsQuantity(int n) {
		String name = Integer.toString(n);
		return name.length();
	}
	
	public static boolean isLonger(int n, int m) {
		boolean isLonger;
		isLonger = getDigitsQuantity(n) > getDigitsQuantity(m);
		return isLonger;
	}
}	