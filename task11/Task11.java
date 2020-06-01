package by.module2.task11;

import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 1.1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 * 
 */

public class Task11 {

	public static void main(String[] args) {
		int A[] = new int[100];
		int i;
		int k;
		int sum;
		int n;
		
		sum = 0;
		k = 2;
		i = 0;
		n = 10;
		while (i < n) {
			A[i] = i;
			if (Task11.checkMultiple(A[i], k)) {
				sum = sum + A[i];
			}
			i++;
		}
		System.out.println("Сумма чисел, кратных " + k + " = " + sum);
	}
	
	public static boolean checkMultiple(int a, int k) {
		boolean checkResult;
		checkResult = ((a / k) * k) == a;
		return checkResult;
	}

}
