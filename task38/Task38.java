package by.module2.task38;

import java.util.Random;
import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.task11.Task11;
/*	Task 38 - ���� ����� p\q. ��������� ���������, ������� �������� ��� ����� � ������ 
 *	����������� � ������������� �� � ������� �����������.
 * 
 * 
 */
public class Task38 {

	public static void main(String[] args) {
		int counter;
		int n;
		int k;
		int temp;
		int quotient1;
		int quotient2;
		int [] p;
		int [] q;
		int nOK;
		int divider;
		
		p = new int[20];
		q = new int[20];
		quotient1 = 0;
		quotient2 = 0;
		nOK = 0;
		counter = 0;
		temp = 999;
		k = 0;
		divider = 0;
		
		// ���� ������������ �������				
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("������� n");
			if (input.hasNextInt()) {
				n  = input.nextInt();
				if(n > 0) {
					break;
				} else {
					System.out.println(input.next() + " �� ������������� �����");
				}
			} else {
				System.out.println(input.next() + " �� �����");
			}
		}
		//	���������� ��������		
		for (int i = 0; i < n; i++) {
				while (true) {
				System.out.println("������� p[" + i + "]");
				if (input.hasNextInt()) {
					p[i]  = input.nextInt();
					System.out.println("������� q[" + i + "]");
					if (input.hasNextInt()) {
						q[i]  = input.nextInt();
						if (q[i] <= 0 ) {
							System.out.println("�� ������������� �����");
						} else {
						break;
						}
					} else {
						System.out.println(input.next() + " �� �����");
					}
				} else {
					System.out.println(input.next() + " �� �����");
				}
			}
		}
		input.close();
		
		// ����� ���
		nOK = q[0];
		for (int i = 1; i < n; i++) {
			quotient2 = q[i];
			quotient1 = nOK;
			divider = 1;
			for (int j = 2; j < Math.min(nOK, q[i]); j++) {
				while (quotient1%j == 0 && quotient2%j == 0) {
					quotient2 /= j;
					quotient1 /= j;
					divider *= j;  
				}
			}
			nOK = nOK * q[i] / divider;
		}

		System.out.println("����� ����������� " + nOK); 
		// ���������� ���������� � ������ �����������
		for (int i = 0; i < n; i++) {
			p[i] = p[i] * nOK / q[i];
		}
		System.out.println("����������� ������ ������");
		for (int i = 0; i < n; i++) {
			System.out.print("p/q[" + i + "] = " + p[i] + "/" + nOK + " ");					
		}
		System.out.println();
		// ���������� ����� ��� ������� ����������
		do {
			if (p[counter] <= p[counter + 1]) {
				counter++;
			} else {
				temp = p[counter];
				p[counter] = p[counter + 1];
				p[counter + 1] = temp;
				counter--;
			}
			if (counter < 0) {
				counter  = 0;
			}
		} while (counter < n - 1);
				
		// 	����� �������� ����� ����������
		System.out.println("��������������� ������ ������");
		for (int i = 0; i < n; i++) {
			System.out.print("p/q[" + i + "] = " + p[i] + "/" + nOK + " ");					
		}
	}
}

	