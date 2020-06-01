

package by.module2.task19;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 1.9. � ������� ����� ����� � ����������� ��������� n ����� �������� ����� ������������� �����. ���� ����� 
 * ����� ���������, �� ���������� ���������� �� ���.
 * 
 */
public class Task19 {

	public static void main(String[] args) {
		int a[] = new int[100];
		int n;
		int i;
		int min;
		int b[] = new int[100];
		
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("������� n");
			if (input.hasNextInt()) {
				n  = input.nextInt();
				break;
			} else {
				System.out.println(input.next() + " �� �����");
			}
		}
		for (int j = 0; j < n; j++) {
			while (true) {
				System.out.println("������� A[" + j + "]");
				if (input.hasNextInt()) {
					a[j]  = input.nextInt();
					break;
				} else {
					System.out.println(input.next() + " �� �����");
				}
			}	
		}
		input.close();
		min = findFreqMinArray(a, n);
		System.out.println("���� ����� ����������� ����� " + min);
	}
	
		
	public static int findFreqMinArray (int[] a, int n) {
		int times;
		int timesMax;
		int frequent;
		int nMax;
		
		frequent = a[0];
		timesMax = 0;
		nMax = 0;
		for (int j = 0; j < n; j++) {
			times = 0;
			for (int i = j + 1; i < n; i++) {
				if (a[j] == a[i]) {
					times++;
				}
				if (times > timesMax) {
					timesMax = times;
					nMax = i;
				} else if (times == timesMax) {
					if (a[i] < a[nMax]) {
						nMax = i;
					}
				}
			}
		}
		return a[nMax];
	}
}
