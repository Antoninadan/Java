package uaimail100;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String[] array = new String[] {"doc"}; 
		MyFileFilter myFF = new MyFileFilter(array) ;

		File folderIn = new File("..\\LessonOOP5Homework1\\FolderIn");
		File folderOut = new File("..\\LessonOOP5Homework1\\FolderOut");

		File[] fileListFolderIn = folderIn.listFiles(myFF);
		File[] fileListFolderOut = folderOut.listFiles();

		for (File f : fileListFolderIn) {

			File file = new File("..\\LessonOOP5Homework1\\FolderOut\\" + f.getName());
			try {
				file.createNewFile();
				FileWork.copeFile(f, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
