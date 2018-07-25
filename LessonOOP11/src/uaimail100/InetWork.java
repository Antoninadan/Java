package uaimail100;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class InetWork {
	
	public static String getStribgFromURL(String urlAddress, String coding) throws IOException {
		String result = "";
		URL url = new URL(urlAddress);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		try (InputStream is = connection.getInputStream()) {
			BufferedReader br = new BufferedReader(new InputStreamReader(is, coding));
			String temp = "";
			for (; (temp = br.readLine()) != null;) {
				result += temp + System.lineSeparator();
			}
		} catch (IOException e) {
			throw e;
		}
		return result;
	}

	public static void copFileFromURL(String urlAddress, File cacheForder) throws IOException {
		URL url = new URL(urlAddress);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		int fileNameIndex = urlAddress.lastIndexOf("/");
		String fileName = urlAddress.substring(fileNameIndex + 1);
		
		File saveFile = new File(cacheForder, fileName);
		
		try (InputStream is = connection.getInputStream(); OutputStream os = new FileOutputStream(saveFile)) {
			
			byte [] buffer = new byte[1024*1024];
			
			int byteRead = 0;
			
			for (; (byteRead = is.read(buffer))>0;) {
				os.write(buffer, 0, byteRead); 
			}
		} catch (IOException e) {
			throw e;
		}
	}
	
	public static Map<String, List<String>> getHeaderFieldsFromURL(String urlAddress) throws IOException {
		
		URL url = new URL(urlAddress);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		return connection.getHeaderFields();
	}
	
	
}
