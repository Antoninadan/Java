package uaimail100;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		File file = new File("file.txt");
		try (InputStream is = new FileInputStream(file)) {
			int n = is.available();
			System.out.println(n); // 11 byte
			
			System.out.println(is.markSupported()); // mark() dont work
			
//			int b = is.read();
//			System.out.println(b); // ascii H
//			b = is.read();
//			System.out.println(b); // ascii e
			
			byte [] buffer = new byte[7];
			int read  = is.read(buffer);
			System.out.println(Arrays.toString(buffer)); //[72, 101, 108, 108, 111, 32, 119]
			System.out.println(read); // count what we read
			
			read  = is.read(buffer);
			System.out.println(Arrays.toString(buffer));
			System.out.println(read); // need to check 
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace(); // for bugs
		}
	}

}
