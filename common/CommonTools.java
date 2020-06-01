package by.module2.common;

import java.io.IOException;
import java.util.Scanner;

public class CommonTools {

	public final static float MAX_FLOAT = (float) 3.40282347E+38;
	public final static float MIN_FLOAT = (float) - 3.40282347E+38;
	public final static double MAX_DOUBLE = (double) 1.797693134486231570E+308;
	public final static double MIN_DOUBLE = (double) - 1.797693134486231570E+308;
	public final static int MAX_INT = 2147483647;
	public final static int MIN_INT = - 2147483648;
	public final static float ZERO = 0;
	
	public static Number readBetween(Scanner input, String name, Types type,
										double leftBorder, double rightBorder, 
										boolean includeLeft, boolean includeRight) 
												throws ArithmeticException {
		Number x;
		double xDouble;
		float xFloat;
		int xInt;
		x = 0;
		xFloat = 0;
		xDouble = 0;
		xInt = 0;
		
		if (rightBorder > leftBorder) {
			while (true) {
				System.out.println("Введите " + name);
				switch (type) {
					case INT:
						if (input.hasNextInt()) {
							xInt  = input.nextInt();
							if (xInt >= leftBorder && xInt <= rightBorder) {
								x = xInt;
								return x;
							} else if ((includeLeft && xInt == leftBorder) 
									|| (includeRight && xInt == rightBorder)) {
								x = xInt;
								return x;
							} else {
								System.out.println(xInt + " вне диапазона");
							}
						} else {
							System.out.println(input.next() + " не число");
						}
						break;
					case FLOAT:	
						if (input.hasNextFloat()) {
							xFloat  = input.nextFloat();
							if (xFloat >= leftBorder && xFloat <= rightBorder) {
								x = xFloat;
								return x;
							} else if ((includeLeft && xFloat == leftBorder) 
									|| (includeRight && xFloat == rightBorder)){
								x = xFloat;
								return x;
							} else {
								System.out.println(xFloat + " вне диапазона");
							}
						} else {
							System.out.println(input.next() + " не число");
						}
						break;
					case DOUBLE:	
						if (input.hasNextDouble()) {
							xDouble  = input.nextDouble();
							if (xDouble >= leftBorder && xDouble <= rightBorder) {
								x = xDouble;
								return x;
							} else if ((includeLeft && xDouble == leftBorder) 
									|| (includeRight && xDouble == rightBorder)){
								x = xDouble;
								return x;
							} else {
								System.out.println(xDouble + " вне диапазона");
							}
						} else {
							System.out.println(input.next() + " не число");
						}
						break;
					}
				}	
		} else {
			throw new ArithmeticException ("Wrong input");
		}
	} 	
	
	public static Number[][] makeArray(Scanner input, int n, int m, String name, 
									Types type, double leftBorder, double rightBorder,  
									boolean includeLeft, boolean includeRight) {
		
		Number[][] a = new Number[n][m]; 
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				try {
					a[i][j]  = readBetween(input, name +"[" + i + "]" + "[" + j + "]", type,
							leftBorder, rightBorder, includeLeft, includeRight);
				} catch (ArithmeticException e) {
					e.printStackTrace();
				}
			}	
		}
		return a;
	}
	
	public static Number[] makeArray(Scanner input, int n, String name, 
			Types type, double leftBorder, double rightBorder,  
			boolean includeLeft, boolean includeRight) {

		Number[] a = new Number[n]; 

		for (int i = 0; i < n; i++) {
			try {
				a[i]  = readBetween(input, name + "[" + i + "]", type,
										leftBorder, rightBorder, includeLeft, includeRight);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			
		}
		return a;
	}
	
	public static Number[][] sortArrayRows(Number[][] a, int n, int m) {
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = j + 1; k < m; k++) {
					if ((int) a[i][k] > (int) a[i][j]) {
						temp = (int) a[i][k];
						a[i][k] = a[i][j];
						a[i][j] = temp;
					}
				}
			}
		}
		return a;
	}
	
	public static Number[][] sortArrayColumns(Number[][] a, int n, int m) {
		int temp = 0;

		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				for (int k = i + 1; k < n; k++) {
					if ((int) a[k][j] > (int) a[i][j]) {
						temp = (int) a[k][j];
						a[k][j] = a[i][j];
						a[i][j] = temp;
					}
				}
			}
		}
		return a;
	}
	
	public static int[] getDigits(int n) throws IOException {
		String name = Integer.toString(n);
		String digitName;
		int[] digits = new int[name.length()];
		
		if (n < 0) {
			throw new IOException("Wrong arguments");
		}
		for (int i = 0; i < name.length(); i++) {
			digitName = name.charAt(i) + "";
			digits[i] = Integer.parseInt(digitName);
		}
		return digits;
	}
	
	public static int getDigitsSum(int n) {
		int sum = 0;
		
		String name = Integer.toString(n);
		for (int i = 0; i < name.length(); i++)
			sum += Integer.parseInt(name.charAt(i) + "");
		return sum;
	}
}