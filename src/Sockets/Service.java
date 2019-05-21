package Sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import calculette.Calculette;
import calculette.MonException;

public class Service {
	private static final Logger LOGGER = Logger.getLogger(Requete.class.getName());
	private static int PORT = 12008;
	private static ServerSocket serveur;
	
	public static void demarrage() throws IOException, ClassNotFoundException, MonException {
		serveur = new ServerSocket(PORT);
		LOGGER.log(Level.INFO,"Serveur en marche");
		
		while(true) {
			Socket socket = serveur.accept();
			LOGGER.log(Level.INFO,"Connexion établie");
			
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			
			Enveloppe enveloppe = (Enveloppe) ois.readObject();
			LOGGER.log(Level.INFO,"Le message a été reçu" + enveloppe);
			
			Enveloppe env = Calculette.calculeOpe(enveloppe);
			oos.writeObject(env);
			LOGGER.log(Level.INFO,"Le message a été envoyé par le serveur" + env);
		}
	}
}
