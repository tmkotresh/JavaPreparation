package NetWorkInterfaces;

import java.io.IOException;
import java.net.*;
import java.util.Enumeration;

public class TestNetworkInterfaceClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Socket socket = new Socket();
		//socket.
		
		NetworkInterface nif;
		try {
			nif = NetworkInterface.getByName("lo");
			Enumeration<InetAddress> nifAddresses = nif.getInetAddresses();
			Socket socket = new Socket();
			socket.bind(new InetSocketAddress(nifAddresses.nextElement(), 0));
			//socket.connect(new InetSocketAddress(address, port));
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
