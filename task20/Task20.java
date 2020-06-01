

package by.module2.task20;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 1.10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 * 
 */
public class Task20 {

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
		a = compressArray(a, n);
		for (int j = 0; j < n; j++) {
			System.out.println("A[" + j + "]" + a[j]);
		}
	}
	
		
	public static int[] compressArray (int[] a, int n) {
		int i;
		int[] newArray = new int[n];
		
		i = 0;
		for (int j = 0; j < n; j++) {
			if (i > 0) {
			i = 0;	
			newArray[j] = 0; 
			} else {
			newArray[j] = a[j];
			i++;
			}
		}
		return newArray;
	}
}
