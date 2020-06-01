

package by.module2.task14;

import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 1.14. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 * 
 */
public class Task14 {

	public static void main(String[] args) {
		float a[] = new float[100];
		int i;
		int maxIndex;
		int minIndex;
		int n;
		float substitution;
		
		n = 5;
		minIndex = 0;
		maxIndex = 0;
		i = 0;
		substitution = 0;

		Scanner input = new Scanner(System.in);
		
		while (i < n) {
			while (true) {
				System.out.println("Введите A[" + i + "]");
				if (input.hasNextInt()) {
					a[i]  = input.nextFloat();
					break;
				} else {
						System.out.println(input.next() + " не число");
				}
			}		
			System.out.println("A[" + i + "]=" + a[i]);
			if (a[i] > a[maxIndex]) {
				maxIndex = i;
			} else if (a[i] < a[minIndex]){
				minIndex = i;
			} 
			i++;
		}
		input.close();
		substitution = a[maxIndex];
		a[maxIndex] = a[minIndex];
		a[minIndex] = substitution;
		System.out.println("Измененный массив ");
		i = 0;
		while (i < n) {
			System.out.println("A[" + i + "]=" + a[i]);
			i++;
		}
		
		
	}
}
