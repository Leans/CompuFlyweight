import java.util.HashMap;

public class CreadorCompus {
	
	private static HashMap<String, CompuLigero> compuMap = new HashMap<String, CompuLigero>();
	
	public static CompuLigero getCompuLigero(String p_cpu) {
		
		String clave = p_cpu;
		System.out.println(clave);
		
		if(!compuMap.containsKey(clave)) {
			compuMap.put(clave, new CompuLigero(p_cpu));
		}
		
		return compuMap.get(clave);
	}

}
