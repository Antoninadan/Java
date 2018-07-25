package uaimail100;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		String urlAddress1 = "https://nv.ua/"; // 200
		String urlAddress2 = "https://www.ukr.net/"; // 200
		String urlAddress3 = "https://www.meteoprog.ua/ua/"; // 200
		String urlAddress4 = "taps://kkkjkjk.nn"; // not valid
		String urlAddress5 = "https://nv.ua/"; // 200
		String urlAddress6 = "https://www.gismeteo.ua/ua/weather-kyiv-4944/3-5-days/"; // problem
		String urlAddress7 = "https://httpstat.us/500"; // 500 Internal Server Error

		checkConnection(urlAddress1);
		checkConnection(urlAddress2);
		checkConnection(urlAddress3);
		checkConnection(urlAddress4);
		checkConnection(urlAddress5);
		checkConnection(urlAddress6);
		checkConnection(urlAddress7);
	}

	public static void checkConnection(String urlName) {

		try {
			URL url = new URL(urlName);
			HttpURLConnection connection;

			try {
				connection = (HttpURLConnection) url.openConnection();

				if (connection.getResponseCode() == 200) {
					System.out.println(urlName + "   is okey");
				} else {
					System.out.println(urlName + "  with some problem: " + connection.getResponseMessage());
				}

			} catch (IOException e1) {
				System.out.println(urlName + "  have problem   " + e1);
			}

		} catch (MalformedURLException e) {
			System.out.println(urlName + "   not valid");
		}

	}

}
