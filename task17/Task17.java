

package by.module2.task17;

import java.util.Scanner;

import by.module2.task11.Task11;

/*  @author Yury Zmushko
 * 	Task 1.7. Р”Р°РЅС‹ РґРµР№СЃС‚РІРёС‚РµР»СЊРЅС‹Рµ С‡РёСЃР»Р° a1,a2,?,an . РќР°Р№С‚Рё max( a1 + a2n,a2 + a2nв€’1,?,an + an+1) .
 * 
 */
public class Task17 {

	public static void main(String[] args) {
		float A[] = new float[100];
		int n;
		float max;
		int m;
		
		max = 0;
		
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Р’РІРµРґРёС‚Рµ n");
			if (input.hasNextInt()) {
				n  = input.nextInt();
				break;
			} else {
				System.out.println(input.next() + " РЅРµ С‡РёСЃР»Рѕ");
			}
		}
		for (int i = 0; i < n; i++) {
			while (true) {
				System.out.println("Р’РІРµРґРёС‚Рµ A[" + i + "]");
				if (input.hasNextInt()) {
					A[i]  = input.nextFloat();
					break;
				} else {
					System.out.println(input.next() + " РЅРµ С‡РёСЃР»Рѕ");
				}
			}	
		}
		input.close();
		m = n / 2;
		for (int j = 0; j < m; j++) {
				max = Math.max(A[j] + A[m - j], max);
		}
		if (m * 2 != n) {
			max = Math.max(max, A[m] * 2);	
		}
		System.out.println("РњР°РєСЃРёРјСѓРј " + max);
	}
}
