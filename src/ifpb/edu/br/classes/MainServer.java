package ifpb.edu.br.classes;

import java.io.IOException;

import ifpb.edu.br.modelo.Servidor;

public class MainServer {

	public static void main(String[] args) {
		
		
		try {
			Servidor server = new Servidor(5503);
			server.executa();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
