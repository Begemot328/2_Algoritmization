

package by.module2.task216;

import java.util.Scanner;

import javax.imageio.IIOException;

import by.module2.common.CommonTools;
import by.module2.common.Types;
import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 2.16. Магическим квадратом порядка n называется квадратная матрица размера 
 * nxn, составленная из чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу, 
 * каждой строке и каждой из двух больших диагоналей равны между собой. Построить 
 * такой квадрат. Пример магического квадрата порядка 3:
 * 
 */
public class Task216 {


	final static int squareSize = 4;
	
	public static void main(String[] args) {
		int a[][] = new int[30][30];
		
		int n;
		int m;
		int sum;
		int sumPrimary;
		int sumSecondary;
		int sumProjected;

		
		m = 0;
		n = 0;
		sumPrimary = 0;
		sumSecondary = 0;
		sum = 0;
		sumProjected = 0;
		Scanner input = new Scanner(System.in);
		
// Ввод размерности массива				
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, CommonTools.ZERO, 
											CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sumProjected = (1 + n * n) * n * n / (2 * n);
		System.out.println("sumProjected " + sumProjected);
		
// Составление магического квадрата		
		a = makeMagicSquare(n);
		
// Проверка магического квадрата	
		for (int i = 0; i < n; i++) {
			sumPrimary += a[i][i];
			sumSecondary += a[n - i - 1][i];
			sum = 0;
			for (int j = 0; j < n; j++) {
				sum += a[i][j];
			}
			if (sum != sumProjected) {
				System.out.println("Ошибка, квадрат не совсем магический" + sum + " " + i);
				break;
			}
		}
		if (sumSecondary != sumProjected || sumPrimary != sumProjected) {
			System.out.println("Ошибка, квадрат не совсем магический");
		}
		

		System.out.println("sumSecondary " + sumSecondary);
		System.out.println("sumPrimary " + sumPrimary);
		System.out.println("sumPrimary " + sumPrimary);

//		Вывод массива		
		System.out.println("Конечный массив");	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("A[" + i + "]" + "[" + j + "]= " + a[i][j] + "	");
			}
			System.out.println();
		}
	}
	
	public static int[][] makeMagicSquare(int n) {
		int a[][] = new int[n][n];
		
		if (n%2 != 0) {
			a = makeMagicSquareOdd(n);
		} else if ((n%4 == 0)) {
			a = makeMagicSquareDividedBy4(n);
		} else {
			a = makeMagicSquareDividedBy2(n);
		}	
		return a;
	}
	
	public static int[][] makeMagicSquareOdd(int n) {
		int a[][] = new int[n][n];
		int m;
		int i;
		int j;
		int iOk;
		int jOk;
		iOk = 0;
		jOk = 0;
		
		System.out.println("makeMagicSquareOdd");
		m = (n - 1) / 2 + 1;
		i = 0;
		j = m - 1;
		a[i][j] = 1;

		System.out.println("a[" + i + "][" + j + "] =" +  a[i][j]);
		for (int k = 2; k <= n * n; k++) {
			i -= 1;
			j += 1;
			
			while (true) {
				if (i < 0) {
					i += n;
				}
				if (j >= n) {
					j -= n;
				}
				if (i >= n) {
					i -= n;
				}
				if (a[i][j] != 0) {
					i = iOk + 1;
					j = jOk;
				} else {
					a[i][j] = k;
					iOk = i;
					jOk = j;
					System.out.println("a[" + i + "][" + j + "] =" +  k);
					break;
				}		
			}
		}
		return a;
		
	}
	
	public static int[][] makeMagicSquareDividedBy4(int n) {
		int a[][] = new int[n][n];
		int k;
		int squares;
		int squaresHalf;
		int temp;
		

		System.out.println("makeMagicSquareDividedBy4");
		
		k = 1;
		temp = 0;
//		m = n / 2;
		squares = n / 4;
		if (squares % 2 != 0) {
			squaresHalf = squares / 2 + 1;
		} else {
			squaresHalf = squares / 2;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = k;
				k++;
			}
		}
			
		for (int l = 0; l < squareSize; l++) {
			for (int i = 0; i < squaresHalf * squareSize; i += 4) {
				if (i + l >= n / 2) {
					break;
				}
				for (int j = 0; j < squares * squareSize; j += 4) {	
					temp = a[i + l][j + l];
					a[i + l][j + l] = a[n - i - l - 1][n - j - l - 1];
					a[n - i - l - 1][n - j - l- 1] = temp;
					temp = a[i + l][squareSize + j - l - 1];
					a[i + l][squareSize + j - l - 1] = a[n - i - l - 1][n - j - squareSize + l];
					a[n - i - l - 1][n - j - squareSize + l] = temp;
				}		
			}
		}
		return a;
	}
	
	public static int[][] makeMagicSquareDividedBy2(int n) {
		int a[][] = new int[n][n];
		int b[][] = new int[n / 2][n / 2];
		int half;
		int temp;
		temp = 0;
		
		half = n / 2;
		System.out.println("makeMagicSquareDividedBy2");
				
		b = makeMagicSquareOdd(half);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < half && j < half) {
					a[i][j] = b [i][j];
				} else if (i < half && j >= half) {
					a[i][j] = b [i][j - half] + half * half * 2;
				} else if (i >= half && j >= half) {
					a[i][j] = b [i - half][j - half] + half * half;
				} else if (i >= half && j < half) {
					a[i][j] = b [i - half][j] + half * half * 3;
				}
			}
		}
		
		for (int i = 0; i < half; i++) {
			int j = 1;
			if (i == 0 || i == half - 1) {
				j = 0;
			}
			temp = a[i][j];
			a[i][j] = a[half + i][j];
			a[half + i][j] = temp;
		}
		return a;
	}
}
