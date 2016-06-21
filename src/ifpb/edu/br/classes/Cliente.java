package ifpb.edu.br.classes;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
	    String op = keyboard.nextLine();
		Socket s;
		try {
			
			s = new Socket("localhost", 5503);
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			out.writeUTF(op);
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	


}
