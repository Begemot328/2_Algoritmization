package by.module2.task46;

import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 46 �������� �����(������), �����������, �������� �� ������ ��� ����� ������� ��������.
 * 
 * 
 */
public class Task46 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		String result;
		boolean isSimple;
		
		a = 0;
		b = 0;
		c = 0;
		result = "";
		
		Scanner input = new Scanner(System.in);
		// ���� �����	
		try {
		a  = (int) CommonTools.readBetween(input, "a", Types.INT, 1, 
											CommonTools.MAX_INT, false, true);

		b  = (int) CommonTools.readBetween(input, "b", Types.INT, 1, 
											CommonTools.MAX_INT, false, true);

		c  = (int) CommonTools.readBetween(input, "c", Types.INT, 1, 
											CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// �������� ����� �� �������� ��������
		isSimple = checkSimpleMultiple(a, b, c);
		if (!isSimple) {
			result = "��";
		}
		// 		����� ����������
		System.out.println("����� a, b, � " + result + " �������� ������� ��������");	
	}

	public static boolean checkSimpleMultiple(int ... args) {
		boolean result = true;
		
		for (int i = 0; i < args.length; i++) {
			for (int j = i + 1; j < args.length; j++) {
				for (int k = 2; k < Math.min(args[i], args[j]); k++) {
					if (args[i]%k == 0 && args[j]%k == 0) {
						result = false;
					}
				}
			
			}
		}
		return result;
	}
}

	