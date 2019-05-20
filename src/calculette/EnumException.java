package calculette;

public enum EnumException {
	
	UTILISATION_ZERO(1,"La division par 0 est interdite"),
	CHAR_INVALIDE(2,"Charactère invalide !"),
	VALEUR_INVALIDE(3,"Valeur invalide !");

	private final int code;
	private final String message;
	
	EnumException(int code,String message){
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public static String getName(int code) {
		for(EnumException e : EnumException.values()) {
			if(code== e.code)
				return e.name();
		}
		return null;
	}
	
}
