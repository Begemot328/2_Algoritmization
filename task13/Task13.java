

package by.module2.task13;

import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 1.3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 * 
 */
public class Task13 {

	public static void main(String[] args) {
		float A[] = new float[100];
		int i;
		int positiveQuantity;
		int negativeQuantity;
		int zeroQuantity;
		int n;
		
		n = 10;
		positiveQuantity = 0;
		negativeQuantity = 0;
		zeroQuantity = 0;
		i = 0;
		

		Scanner input = new Scanner(System.in);
		
		while (i < n) {
			while (true) {
				System.out.println("Введите A[" + i + "]");
				if (input.hasNextInt()) {
					A[i]  = input.nextFloat();
					break;
				} else {
					System.out.println(input.next() + " не число");
				}
			}				
			if (A[i] > 0) {
				positiveQuantity++;
			} else if (A[i] < 0){
				negativeQuantity++;
			} else {
				zeroQuantity++;
			}
			System.out.println("A[" + i + "]=" + A[i]);
			i++;
		}
		input.close();
		System.out.println("Количество положительных " + positiveQuantity);
		System.out.println("Количество отрицательных " + negativeQuantity);
		System.out.println("Количество нулей " + zeroQuantity);
	}
}
