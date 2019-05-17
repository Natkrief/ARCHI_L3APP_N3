package caluculette;

import java.util.HashMap;
import java.util.Map;

public class Config {
	static Map<Character,Operation> map = new HashMap<Character,Operation>();
	
	public void initialisation() {
		this.map.put('+', new Addition());
		this.map.put('/', new Division());
	}
	
	public static Operation getOpe(Character cle) {
		return map.get(cle);
	}
	
}
