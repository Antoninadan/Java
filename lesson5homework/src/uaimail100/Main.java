package uaimail100;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

/*		// ������� ���������� ������� � 'b' /////////////////////////////////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ ��� �������� ��������� ������� b:");
		String str = sc.nextLine();

		char[] charMas = str.toCharArray();
		int summa = 0;

		for (char element : charMas) {
			if (element == 'b') {
				summa++;
			}
		}
		System.out.println("���-�� �������� b = " + summa);
*/
		
/*      // ��� ������ {0,5,2,4,7,1,3,19} � �������� ��������� ��� �������� �������� ���� ///////////////////////////
		int[] mas = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int summa = 0;

		for (int element : mas) {
			if (element % 2 != 0) {
				summa += element;
			}
		}
		System.out.println("���-�� �������� = " + summa);
*/

/*      // ������� ������ � ���������� /////////////////////////////////////////////////////////////////////
		int[] mas;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ �������:");
		int size = sc.nextInt();
		mas = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("������� " + i + "-� ������� �������:");
			mas[i] = sc.nextInt();
		}

		System.out.println("��� ��� ������: " + Arrays.toString(mas));
*/
		
/*		// ������� ������ ��������� ����� (�������� 15 ���������) /////////////////////////////////////////////////
		int size = 15;
		int[] mas = new int[size];
		Random rn = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rn.nextInt(15); 
		}
		System.out.println("������ ������: " + Arrays.toString(mas));
		
		int[] mas2 = Arrays.copyOf(mas, size*2); // copy first elements
		
		for (int i = size; i < size*2; i++) {
			mas2[i] = 2* mas[i-size];
		}
		System.out.println("������ ������: " + Arrays.toString(mas2));
*/
	
/*		// Level - 2 ����������� ������ /////////////////////////////////////////////////////////////////////
		
		int[] mas = { 0, 5, 2, 4, 7, 1, 3, 19 }; // 8 �����
		// int[] mas = { 0, 5, 2, 4, 7, 1, 3, 19, 20 }; // 9 �����

		int limit = mas.length / 2;
		int size = mas.length;
		int a;

		for (int i = 0; i < limit; i++) {
			a = mas[size - 1 - i];
			mas[size - 1 - i] = mas[i];
			mas[i] = a;
		}
		System.out.println(Arrays.toString(mas));
*/
			
/*		// Level - 2 ����������� �������  /////////////////////////////////////////////////////////////////////
		int[][] mas = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 },
				{ 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };

		System.out.println("��� �������� �� 90 ������� '1', �� 180 - '2', �� 270 - '3'");
		Scanner sc = new Scanner(System.in);

		int curv = sc.nextInt();
		int size = mas.length;

		// ����������� ������ �������
		System.out.println("�������� ������: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(mas[i][j] + " ");
			}

			System.out.println();
		}
		System.out.println();

		int a;
		int b;
		int r = 0;
		int count = (size - 1);

		int cycle = size - 2;

		for (int j = 1; j <= size / 2; j++) {

			for (int i = 1; i <= count * curv; i++) {

				// ������ ������ ������
				a = mas[r][r];
				mas[r][r] = mas[1 + r][r];

				for (int k = 1; k <= cycle; k++) {
					b = mas[r][k + r];
					mas[r][k + r] = a;
					a = b;
				}
				// ������ ���
				b = mas[r][size - r - 1];
				mas[r][size - r - 1] = a;
				a = b;

				for (int k = 1; k <= cycle; k++) {
					b = mas[k + r][size - r - 1];
					mas[k + r][size - r - 1] = a;
					a = b;
				}
				// ���
				b = mas[size - r - 1][size - r - 1];
				mas[size - r - 1][size - r - 1] = a;
				a = b;

				for (int k = cycle; k >= 1; k--) {
					b = mas[size - r - 1][k + r];
					mas[size - r - 1][k + r] = a;
					a = b;
				}

				// �� ���� ����� �� ������ ����
				b = mas[size - r - 1][r];
				mas[size - r - 1][r] = a;
				a = b;

				for (int k = cycle; k >= 1; k--) {
					b = mas[k + r][r];
					mas[k + r][r] = a;
					a = b;
				}
			}

			r++;
			cycle -= 2;
			count -= 2;
		}

		// ����������� ������ �������
		System.out.println("������������ ������: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(mas[i][j] + " ");
			}

			System.out.println();
		}
*/

				
	}

}
