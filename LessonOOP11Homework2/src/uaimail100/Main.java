// 	Написать сервер, который будет отправлять пользователю информацию о системе и номер запроса.

package uaimail100;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		
		String ansver = "";
		Runtime run = Runtime.getRuntime();
			
		ansver += "<html><body> total memory = " + run.totalMemory() + "<br>";
		ansver += "free memory = " + run.freeMemory()+ "<br>";
		
		
		int number = 0; 
		
		try (ServerSocket serSocket = new ServerSocket(1111)) {
			for (;;) {
				Socket clientSocket = serSocket.accept();
				number++;		
				Client client = new Client(clientSocket, ansver, number);
			}
		} catch (IOException e) {
			System.out.println("Error to server Socket Open!!!");
		}
		
	}

}
