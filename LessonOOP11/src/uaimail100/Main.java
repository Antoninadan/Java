package uaimail100;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		 // address by name, home address
//		 try {
//		 InetAddress adressGoogle = InetAddress.getByName("www.google.com");
//		 System.out.println(adressGoogle);
//		 InetAddress adressHome = InetAddress.getLocalHost();
//		 System.out.println(adressHome);
//		 } catch (UnknownHostException e) {
//		 System.out.println(e.toString());
//		 }

		 // get html text
		 String urlAddress = "https://prog.kiev.ua/forum/index.php/board,2.0.html";
		 String htmlText = "";
		
		 try {
		 htmlText = InetWork.getStribgFromURL(urlAddress, "UTF-8");
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 System.out.println(htmlText);

//		//save in directory file from url 
//		String urlAddress2 = "https://soundcloud.com/radiosvoboda/ukrana-ochima-nmtsv-100-rokv-tomu-nezrozumla-maloperedbachuvana";
//		File localCache = new File("Temp");
//		localCache.mkdir();
//
//		try {
//			InetWork.copFileFromURL(urlAddress2, localCache);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		// get header from connection
//		String urlAddress3 = "https://i1.rozetka.ua/goods/2285227/copy_hp_250_g6_1xp19es_59e89cc7093b5_images_2285227280.jpg";
//		try {
//			Map<String, List<String>> map = InetWork.getHeaderFieldsFromURL(urlAddress3);
//			map.forEach((key, value) -> System.out.println(key + "  " + value));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		// SOCKET
//		try (Socket socket = new Socket("ya.ru", 80)) {
//			PrintWriter pw = new PrintWriter(socket.getOutputStream());
//			
//			// write in stream
//			pw.println("GET / HTTP/1.1");
//			pw.println("Host:ya.ru");
//			pw.println("");
//			pw.flush();
//			
//			// open stream
//			InputStream s = socket.getInputStream();
//			int r;
//			for (; (r = s.read()) != -1;) {
//				System.out.print((char) r);
//			}
//		} catch (Exception e) {
//			System.out.println(e.toString());
//		}

		
//		// ServerSOCKET
//		try (ServerSocket s = new ServerSocket(20000)) {
//			Socket incoming = s.accept();
//			try (Scanner sc = new Scanner(incoming.getInputStream())) {
//				PrintWriter out = new PrintWriter(incoming.getOutputStream(), true);
//				boolean exit = true;
//				for (; exit;) {
//					String line = sc.nextLine();
//					out.println("Ответ сервера " + line);
//					if (line.compareTo("exit") == 0)
//						exit = false;
//				}
//			} finally {
//				incoming.close();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("END");

		
//		// ServerSOCKETs in Threads
//		String ansver = "";
//		Group gr = new Group("PN121");
//		gr.addStudent(new Student("Ivanov", "Ivan", 3));
//		gr.addStudent(new Student("Petrov", "Petr", 4));
//		gr.addStudent(new Student("Sidorov", "Sidr", 5));
//		gr.addStudent(new Student("Garbuzov", "Grbuz", 1));
//		
//		ansver += "<html><head><title>Student</title> <meta charset='utf-8'></head><body><p>Список студентов группы: " + gr.getName() + "</p><br>";
//		ansver += "<table border='2' cellpadding='5' ><tr><th>Фамилия</th><th>Имя</th><th>Курс</th></tr>";
//		
//		Student[] starr = gr.getGroup();
//		
//		for (int i = 0; i < starr.length; i++) {
//			ansver += "<tr>";
//			ansver += "<td>" + starr[i].getName() + "</td>";
//			ansver += "<td>" + starr[i].getLastname() + "</td>";
//			ansver += "<td>" + starr[i].getCourse() + "</td>";
//			ansver += "</tr>";
//		}
//		ansver += "</table></body></html>";
//		
//		try (ServerSocket soc = new ServerSocket(8080)) {
//			for (;;) {
//				Socket clisoc = soc.accept();
//				Client client = new Client(clisoc, ansver);
//			}
//		} catch (IOException e) {
//			System.out.println("Error to server Socket Open!!!");
//		}
		
		
	}

}
