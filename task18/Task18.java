

package by.module2.task18;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 1.8. Дана последовательность целых чисел a1,a2,?,an . Образовать новую последовательность, выбросив из 
 * исходной те члены, которые равны min(a1,a2,?,an) .
 * 
 */
public class Task18 {

	public static void main(String[] args) {
		int a[] = new int[100];
		int n;
		int i;
		int min;
		int b[] = new int[100];
		
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Введите n");
			if (input.hasNextInt()) {
				n  = input.nextInt();
				break;
			} else {
				System.out.println(input.next() + " не число");
			}
		}
		for (int j = 0; j < n; j++) {
			while (true) {
				System.out.println("Введите A[" + j + "]");
				if (input.hasNextInt()) {
					a[j]  = input.nextInt();
					break;
				} else {
					System.out.println(input.next() + " не число");
				}
			}	
		}
		input.close();
		System.out.println(minArray(a, n));
		min = minArray(a, n);
		i = 0;
		for (int j = 0; j < n; j++) {
			if (a[j] > min) {
				b[i] = a[j];
				i++;
			}
		}
		n = i;
		a = b;
		for (int j = 0; j < n; j++) {
			System.out.println("A[" + j + "]" + a[j]);
		}
	}
	
		
	public static int minArray (int[] a, int n) {
		int min;
		
		min = 2147483647;
		for (int j = 0; j < n; j++) {
			min = Math.min(min, a[j]);
		}
		return min;
	}
}
