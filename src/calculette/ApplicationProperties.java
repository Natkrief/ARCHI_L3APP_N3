package calculette;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationProperties {

		Properties prop = new Properties();
		InputStream input = null;
		private static ApplicationProperties applicationProperties = null;

		
		public static ApplicationProperties getInstance(String fileName) {
			if(applicationProperties == null)
				applicationProperties = new ApplicationProperties(fileName);
			return applicationProperties;
		}
		
		
		public ApplicationProperties(String fileName) {
			prop = new Properties();
			try {
				input = new FileInputStream(fileName);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				// load a properties file
				prop.load(input);

			} catch (final IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (final IOException e) {
						e.printStackTrace();
					}
				}
			}

		}
		
		public String lirePropriete(String cle) {
			return prop.getProperty(cle);
		}
		
		
	}