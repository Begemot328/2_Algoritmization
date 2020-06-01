package by.module2.task32;

/*  @author Yury Zmushko
 * 	Task 3.2. ƒаны две последовательности. ќбразовать из них новую последовательность 
 * чисел так, чтобы она тоже была неубывающей. ѕримечание. ƒополнительный массив не использовать.
 * 
 */
public class Task32 {

	public static void main(String[] args) {
		int j;
		int k;
		int n;
		int m;
		int [] array1, array2;
		
		array1 = new int[20];
		array2 = new int[50];
		n = 10;
		m = 5;
		k = n - 1;
		j = m - 1;
// заполнение массивов
		for (int i = 0; i < n; i++) {
			array1[i] = 10 + i;
		}
		for (int i = 0; i < m; i++) {
			array2[i] = i * 2;
		}
// перенос части массива
		for (int i = n + m - 1; i >= 0; i--) {
			if (k < 0) {
				array1[i] = array2[j];
				j--;
				continue;
			} else if (j < 0) {
				array1[i] = array1[k];
				k--;
				continue;
			}
			if(array1[k] > array2[j]) {
				array1[i] = array1[k];
				k--;
			} else {
				array1[i] = array2[j];
				j--;
			}			
		}

// вывод массива 1 
		for (int i = 0; i < m + n; i++) {
			System.out.print("A[" + i + "]" + array1[i] + "	");					
		}
	}

}
