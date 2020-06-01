

package by.module2.task28;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 2.8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить 
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 * 
 */
public class Task28 {

	public static void main(String[] args) {
		float a[][] = new float[30][30];
		int n;
		int m;
		int k;
		int l;
		float temp;
		
		// Ввод размерностей массива				
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Введите n");
			if (input.hasNextInt()) {
				n  = input.nextInt();
				if(n > 0) {
					break;
				} else {
					System.out.println(input.next() + " не положительное число");
				}
			} else {
				System.out.println(input.next() + " не число");
			}
		}
		
		while (true) {
			System.out.println("Введите m");
			if (input.hasNextInt()) {
				m  = input.nextInt();
				if(m > 0) {
					break;
				} else {
					System.out.println(input.next() + " не положительное число");
				}
			} else {
				System.out.println(input.next() + " не число");
			}
		}
		
// 		Заполнение массива		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				while (true) {
					System.out.println("Введите A[" + i + "]" + "[" + j + "]");
					if (input.hasNextInt()) {
						a[i][j]  = input.nextInt();
						break;
					} else {
						System.out.println(input.next() + " не число");
					}
				}
			}	
		}
// Ввод номеров заменяемых столбцов массива
		while (true) {
			System.out.println("Введите k");
			if (input.hasNextInt()) {
				k  = input.nextInt();
				if(k > 0 && k < m) {
					break;
				} else {
					System.out.println(input.next() + " некорректное число");
				}
			} else {
				System.out.println(input.next() + " не число");
			}
		}
		
		while (true) {
			System.out.println("Введите l");
			if (input.hasNextInt()) {
				l  = input.nextInt();
				if(l > 0 && l < m && l != k) {
					break;
				} else {
					System.out.println(input.next() + " некорректное число");
				}
			} else {
				System.out.println(input.next() + " не число");
			}
		}
		input.close(); 
		
// 		Замена столбцов		
		for (int i = 0; i < n; i++) {
			temp = a[i][k];
			a[i][k] = a[i][l];
			a[i][l] = temp;
		}
		
//		Вывод массива		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}
	}
}
