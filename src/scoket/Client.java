package scoket;

import java.io.*;
import java.net.*;

public class Client {
	Socket socket;
	BufferedReader in;
	PrintWriter out;
	BufferedReader line;
	boolean running = true;

	public Client() {
		try {
			socket = new Socket("127.0.0.1", 65430);
			in = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			line = new BufferedReader(new InputStreamReader(System.in));
			new ServerListener().start();
			
			while (running) {	
				sendMessage(line.readLine());
			}

			line.close();
			out.close();
			in.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void sendMessage(String strInput) {
		out.println(strInput);
		System.out.println("CLIENT PUT INFO: " + strInput);
		if ("exit".equals(strInput)) {
			running = false;
		}
	}

	public static void main(String[] args) {
		new Client();
	}

	class ServerListener extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (running) {
				try {
					if (in != null && in.ready()) {
						String read = in.readLine();
						if (!"".equals(read)) {
							System.out.println("CLIENT GET INFO: " + read);
						}
					}
					sleep(100L);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("CLIENT EXCPETION: " + e.getMessage());
					running = false;
					break;
				}
			}
			super.run();
		}
	}
}