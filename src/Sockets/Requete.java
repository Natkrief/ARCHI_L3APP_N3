package Sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Requete {

	private static final Logger LOGGER = Logger.getLogger(Requete.class.getName());

	private static int PORT = 12008;

	public static Enveloppe envoie(Enveloppe env) throws IOException, ClassNotFoundException {
		InetAddress host = InetAddress.getLocalHost();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		Socket socket = new Socket(host.getHostName(), PORT);

		oos = new ObjectOutputStream(socket.getOutputStream());
		LOGGER.log(Level.INFO, "Connection serveur établie !");

		LOGGER.log(Level.INFO, "Envoie de la requete vers le Serveur");
		oos.writeObject(env);
		
		ois = new ObjectInputStream(socket.getInputStream());
		Enveloppe enveloppe = (Enveloppe) ois.readObject();
		LOGGER.log(Level.INFO, "Message reçu : " + enveloppe);
		
		socket.close();
		
		return enveloppe;

	}

}
