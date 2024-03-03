package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client3 {

	 Socket socket;// 소켓
	
	 DataInputStream dataInputStream;       // 입력용보조스트림
	 DataOutputStream dataOutputStream;     // 출려용보조스트림
	 
	 
	
	public Client3() {	    
		
		
		// 
		
		try {
			socket = new Socket("localhost", 6700);

			dataInputStream = new DataInputStream( socket.getInputStream());
			dataOutputStream = new DataOutputStream ( socket.getOutputStream());	
			dataSend();
			dataRecv();
			

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	private void dataRecv() {
		 
		 Thread t = new Thread(new Runnable() {
		        @Override
		        public void run() {
		            try {
		                while (true) {
		                    String msg = dataInputStream.readUTF();
		                    System.out.println(msg);
 
		                    if (msg.equals("나가기")) {
		                        System.out.println("Received exit message. Closing the client.");		                   
		                        socket.close();
		                        
		                    }
		                }
		            } catch (IOException e) {
		               // e.printStackTrace();
		            	System.out.println("나감 client");
		            	System.exit(0);
		            }
		        }
		    });

		    t.start();
	}






	private void dataSend() {
		
		Scanner sc = new Scanner( System.in);
		
	
		Thread t = new Thread( new Thread( new Runnable() {

			@Override
			public void run() {

				try {
					while( true  ) {
					String sendMsg  = sc.nextLine();
					dataOutputStream.writeUTF(sendMsg);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}}));
		
		
		t.start();
		 
	}




	public static void main(String[] args) {		 
		new Client3();

	}

}