package by.module2.task43;

import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 43. ��������� ������� ����������� �������������� �� �������� �, ��������� �����  ���������� ������� 
 * ������������.  
 */
public class Task43 {

	public static void main(String[] args) {
		double a;
		int n;
		double square;
		
		a = 0;
		n = 0;
		square = 0;
				
		// ���� ����� 				
		Scanner input = new Scanner(System.in);
		try {
			a  =  (double) (float) CommonTools.readBetween(input, "a", Types.FLOAT, CommonTools.ZERO, 
												CommonTools.MAX_INT, false, true);
			n  = (int) CommonTools.readBetween(input, "n", Types.INT, CommonTools.ZERO, 
												CommonTools.MAX_INT, false, true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		// ���������� �������
		
		square = calculateSquare(a, n);
		// 	����� �����������
		System.out.println("����������");
		System.out.println("������� " + n + "-��������� �� �������� " + a + " ����� " + square);
	}
	
	public static double calculateSquare(double a, int n) {
		// ����� ���������� ������� ����������� n-��������� �� �������� a
		double square;
		double radius;
		
		radius = a / 2 / Math.cos(Math.PI * (0.5 - 1. / n));
		square = n * calculateSquareTriangle(radius, radius, Math.PI * 2. / n);
		return square;
	}
	
	public static double calculateSquareTriangle(double a, double b, double angle) {
		double square;
		
		square = a * b * Math.sin(angle) / 2.;
		System.out.println("square " + square);
		return square;
	}
}

	