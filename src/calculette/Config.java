package calculette;

import java.util.HashMap;
import java.util.Map;

public class Config {
	static Map<Character,Operation> map = new HashMap<Character,Operation>();
	
	public static void initialisation() {
		map.put('+', new Addition());
		map.put('/', new Division());
	}
	
	public static Operation getOpe(Character cle) {
		return map.get(cle);
	}
	
}
