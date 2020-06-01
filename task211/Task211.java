

package by.module2.task211;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.IIOException;

import by.module2.task29.*;


/*  @author Yury Zmushko
 * 	Task 2.11. ������� 10x20 ��������� ���������� ������� �� 0 �� 15. ������� �� ����� ���� ������� � ������ �����, � 
 * ������� ����� 5 ����������� ��� � ����� ���.
 * 
 */
public class Task211 {

	public static void main(String[] args) {
		int a[][] = new int[30][30];
		int n;
		int m;
		int fiveCounter;
		int bound;
		
		fiveCounter = 0;
		m = 10;
		n = 20;
		bound = 15;
		Random random = new Random();
		
		random.nextInt(15);
		
		
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				a[i][j] = random.nextInt(bound + 1);
			}
		}
		

// 		������� �������
		for (int i = 0; i < n; i++) {
			fiveCounter = 0;
			for (int j = 0; j < m; j++) {
				if(a[i][j] == 5) {
					fiveCounter++;
				}
			}
			if(fiveCounter >=3 ) {
				System.out.println("� ������ " + i +" ����� 5 ����������� " + fiveCounter + " ���");
			}
		}
		
//		����� �������		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}
	}	
}
