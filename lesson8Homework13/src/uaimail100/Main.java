package uaimail100;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// ���������� �����, ������� ������� �� ����� ������ ���� ���������, �������
		// ������ � ��������, ������� ����� ���������� ����� ������

		String folderName =  "f:\\java\\";

		File folder = new File(folderName);
		File[] files = folder.listFiles();

		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				System.out.println(files[i]);
			}
		}

	}

}
