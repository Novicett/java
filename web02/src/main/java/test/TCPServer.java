package test;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception{
		//승인용 서버 소켓이 필요
		ServerSocket server = new ServerSocket(9100); //ip+port 
		System.out.println("승인용 서버 소켓 스타트..");
		System.out.println("클라이언트의 요청을 기다리는 중...");
		//승인이 떨어지면 통신용 소켓이 만들어짐

		while(true) {
			Socket socket = server.accept(); 
			System.out.println("클라이언트와 통신가능한 통신용 소켓 만들어짐.");
		}
	}
}
