package ifpb.edu.br.modelo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Servidor {

	private int porta;
	private List<Cliente> clientes;

	public Servidor(int porta) {

		this.porta = porta;
		this.clientes = new ArrayList<>();
	}

	public void executa() throws IOException {
		System.out.println("Iniciando Servidor...");
		try (ServerSocket servidor = new ServerSocket(this.porta)) {
			System.out.println("Porta " + this.porta + " aberta!");
			System.out.println("Servidor Iniciado!");
			while (true) {
				Socket socket = servidor.accept();
				Cliente cliente = new Cliente(socket);
				System.out.println("O Usuario "+cliente.getNickname()+" entrou na sala. | IP: "+cliente.getHost()+" Porta: "+cliente.getPorta());
				this.clientes.add(cliente);

			}
		}
	}

}
