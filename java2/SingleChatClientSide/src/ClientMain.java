import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("localhost", 9999);
		System.out.println("Server da chap nhan ket noi");
		
		try (
			// luong doc/ luong in
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			// luong ghi/ luong out
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				Scanner sc = new Scanner(System.in);
		) {
			while(true) {
				// client gui tin sang cho server
				System.out.println("Client say: ");
				String sendStr = sc.nextLine();
				bw.write(sendStr);
				bw.newLine();
				bw.flush();
				
				// client nhan tin tu server gui:
				String receiverFromServer = br.readLine();
				System.out.println("Server reply: "+ receiverFromServer);
			}
			
		}catch(Exception e) {
			
		}
	}

}
