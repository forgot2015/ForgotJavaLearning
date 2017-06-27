package scoket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TestServer {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(65430);
			System.out.println("NOW SOCKET SERVER HAS STARTED!");
			int count = 1;
			while (true) {
				Socket s = server.accept();
				System.out.println("SERVER" + count + " START: LISTENING");
				new SimpleProcessor(s, count).start();
				count++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			if (server != null) {
				try {
					server.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}

	}

	static class SimpleProcessor extends Thread {
		private int id;
		private Socket socket;
		private PrintWriter out;
		private BufferedReader in;
		private volatile boolean running = true;

		public SimpleProcessor(Socket s, int id) throws IOException {
			this.socket = s;
			this.id = id;
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream());
		}

		public void run() {
			while (running) {
				try {
					if (in.ready()) {
						String tmp = in.readLine();
						System.out.println("SERVER" + id + " GET INFO: " + tmp);
						send("SERVER" + id + " PUT INFO: " + tmp);
						checkExit(tmp);
					} else {
						checkExist();
					}
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			closeThread();
		}

		private void send(String m) throws IOException {
			if (!"".equals(m)) {
				System.out.println(m);
			}
			out.println(m);
			out.flush();
		}

		private void checkExit(String input) {
			if ("exit".equals(input)) {
				running = false;
			}
		}

		private void checkExist() {
			try {
				// socket.sendUrgentData(0xFF);
				String test = "\n";
				socket.getOutputStream().write(test.getBytes());
				Thread.sleep(300);
				//send("");
			} catch (Exception ex) {
				System.out.println("SERVER" + id + " CLIENT HAS EXISTED!");
				running = false;
			}
		}

		private void closeThread() {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
				if (socket != null) {
					System.out.println("SERVER" + id + " CLOSED AT "
							+ new Date());
					socket.close();
				}
			} catch (IOException e) {
				System.out.println("SERVER EXCEPTION: " + e.getMessage());
			}
		}
	}
}
