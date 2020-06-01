

package by.module2.task213;

import java.util.Scanner;

import javax.imageio.IIOException;

import by.module2.common.CommonTools;
import by.module2.common.Types;
import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 2.13. ������������� ������ ������� �� ����������� � �������� �������� ��������.
 * 
 */
public class Task213 {

	public static void main(String[] args) {
		Number a[][] = new Number[30][30];
		Number b[][] = new Number[30][30];
		int n;
		int m;
		
		m = 0;
		n = 0;
		Scanner input = new Scanner(System.in);
		
// ���� ������������ �������				
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, CommonTools.ZERO, 
											CommonTools.MAX_INT, false, true);
		m  = (int) CommonTools.readBetween(input, "m", Types.INT, CommonTools.ZERO, 
											CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
// 		���������� �������		
		a = CommonTools.makeArray(input, n, m, "A", Types.INT, CommonTools.MIN_INT, CommonTools.MAX_INT, true, true);
		input.close();
		
//		����� �������
		System.out.println("�������� ������");	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}		
		
// 		����������
		b = CommonTools.sortArrayColumns(a, n, m);
		
//		����� �������		
		System.out.println("�������� ������");	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}
	}	
	
	
}