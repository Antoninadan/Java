/*
 �������� ��������� ������� �������� � ������� �� �����
����� ����������, ���� �� ������ ����������� � ���������� 
 */

package uaimail100;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double radius = 0;
		double circuit = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Input radius, meters");
		radius = sc.nextDouble();
		circuit = 2 * radius * Math.PI;
		System.out.println("Circuit = " + circuit + " meters");

	}

}
