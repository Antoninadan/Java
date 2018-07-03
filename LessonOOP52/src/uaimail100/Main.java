package uaimail100;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File fileIn = new File("f:\\DataMatrix\\Coding\\WHO drug\\faq-b3-c3.pdf");
		File fileOut = new File("some.pdf");
		try{FilaWork.copeFile(fileIn, fileOut);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
