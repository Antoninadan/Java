package uaimail100;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// try {
		// InetAddress adress = InetAddress.getByName("www.google.com");
		// System.out.println(adress);
		// } catch (UnknownHostException e) {
		// System.out.println(e.toString());
		// }

		// String urlAddress = "https://prog.kiev.ua/forum/index.php/board,2.0.html";
		// String htmlText = "";
		//
		//
		// try {
		// htmlText = InetWork.getStribgFromURL(urlAddress, "UTF-8");
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		//
		// System.out.println(htmlText);

//		String urlAddress2 = "https://soundcloud.com/radiosvoboda/ukrana-ochima-nmtsv-100-rokv-tomu-nezrozumla-maloperedbachuvana"; // "https://i1.rozetka.ua/goods/2285227/copy_hp_250_g6_1xp19es_59e89cc7093b5_images_2285227280.jpg";
//		File localCache = new File("Temp");
//		localCache.mkdir();
//
//		try {
//			InetWork.copFileFromURL(urlAddress2, localCache);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		
		String urlAddress3 = "https://i1.rozetka.ua/goods/2285227/copy_hp_250_g6_1xp19es_59e89cc7093b5_images_2285227280.jpg";
		//Map<String, List<String>> map;
		try {
			Map<String, List<String>> map = InetWork.getHeaderFieldsFromURL(urlAddress3);
			map.forEach((key, value) -> System.out.println(key + "  " +  value));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
	}

}
