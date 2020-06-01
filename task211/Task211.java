

package by.module2.task211;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.IIOException;

import by.module2.task29.*;


/*  @author Yury Zmushko
 * 	Task 2.11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в 
 * которых число 5 встречается три и более раз.
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
		

// 		Подсчет пятерок
		for (int i = 0; i < n; i++) {
			fiveCounter = 0;
			for (int j = 0; j < m; j++) {
				if(a[i][j] == 5) {
					fiveCounter++;
				}
			}
			if(fiveCounter >=3 ) {
				System.out.println("В строке " + i +" число 5 встречается " + fiveCounter + " раз");
			}
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
