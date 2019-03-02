// Create folder, file, delete

package uaimail100;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// work with files
		
		File workFolder = new File("."); // link to dir
		File[] files = workFolder.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}

		System.out.println();
		
		File f1 = new File("a.txt"); //absolute address or not
		
		try {
			f1.createNewFile();
		} catch (IOException e) {
			//System.out.println("3453");
			e.printStackTrace();
		}
		
		File folder = new File("AAA"); // create folder
		
		folder.mkdirs();
		
		File f2 = new File(folder, "b.txt"); 
		
		try {
			f2.createNewFile();
		} catch (IOException e) {
			//System.out.println("3453");
			e.printStackTrace();
		}
		
		f2.delete(); 	
		f1.delete();
		folder.delete();

		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
		
		
		
	}

}
