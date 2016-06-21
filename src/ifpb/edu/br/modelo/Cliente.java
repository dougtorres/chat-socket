package ifpb.edu.br.modelo;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente{
	
	private Socket socket;
	private String host;
	private int porta;
	private String nickname;
	
	public Cliente(Socket socket) throws IOException{
	
		this.host = socket.getInetAddress().getHostAddress();
		this.porta = socket.getPort();
		DataInputStream data = new DataInputStream(socket.getInputStream());
		this.nickname = data.readUTF();
	}

	
	
	public Socket getSocket() {
		return socket;
	}


	public void setSocket(Socket socket) {
		this.socket = socket;
	}



	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}


	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}



}
