package by.module2.task44;

import java.util.Scanner;

import by.module2.common.CommonTools;
import by.module2.common.Types;

/*	Task 44 �� ��������� ������ ������ ������������ n �����. �������� �����(������), ������������, ����� ������
 * �� ��� ����� ����� ������� ����������. ��������. ���������� ����� ������� � ������. 
 * 
 * 
 */
public class Task44 {

	public static void main(String[] args) {
		int n;
		double maxDistance;
		int[] result;
		Number[][] coords;
		
		n = 0;
		result = new int[2];
		coords = new Number[2][100];
		maxDistance = 0;
		
		Scanner input = new Scanner(System.in);
		// ���� ������������ ������� �����			
		try {
		n  = (int) CommonTools.readBetween(input, "n", Types.INT, CommonTools.MIN_INT, 
											CommonTools.MAX_INT, false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 		���������� ������� �����		
		coords = CommonTools.makeArray(input, n, 2, "���������� �����", Types.INT, 
				CommonTools.ZERO, CommonTools.MAX_INT, false, true);
		input.close();
		// 		���������� ������������� ����������	
		result = findMaxDistance(n, coords);
		maxDistance = findDistance(coords[result[0]], coords[result[1]]);
		// 		����� ����������
		System.out.println("���������� ���������� - ����� ������� " + result[0] 
							+ " � " + result[1] + " � ���������� " + maxDistance);	
	}
	
	public static double findDistance(Number[] pointA, Number[] pointB) {
		double distance;
		
		distance = 0;
		distance = Math.sqrt(Math.pow((int) pointA[0] - (int) pointB[0],2) 
				+ Math.pow((int) pointA[1] - (int) pointB[1],2));
		return distance;
	}
	
	public static int[] findMaxDistance(int n, Number[][] coords) {
		int[] result;
		double maxResult;
		
		maxResult = 0;
		result = new int[2];
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (findDistance(coords[i], coords[j]) > maxResult) {
					result[0] = i;
					result[1] = j;
					maxResult = findDistance(coords[i], coords[j]);
				}
			}
		}		
		return result;
	}
}

	