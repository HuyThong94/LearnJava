import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	//SingleChatServerSide -> ServerMain
	//SingleChatClientSide -> ClientMain
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("Server dang cho ket noi tai cong 9999");
		// nhan yeu cau tu client:
		Socket server = serverSocket.accept();
		System.out.println("Client da chap nhan ket noi");
		// tao ra stream de nhan message tu socket con lai
		try (
			// luong doc/ luong in
			BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			// luong ghi/ luong out
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));
				Scanner sc = new Scanner(System.in);
		){
			while(true) {
				// server nhan tin nhan tu client gui
				String receiverStr = br.readLine();
				System.out.println("client say: "+ receiverStr);
				
				// server reply lai cho client
				System.out.println("Server say: ");
				String replyStr = sc.nextLine();
				bw.write(replyStr);
				bw.newLine();
				bw.flush();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
