
public class CompuFactory {
	
	public static Compu crearCompu(String p_marca, String p_cpu) {
		
		CompuLigero unaCompuLigero = CreadorCompus.getCompuLigero(p_cpu);
		Compu unaCompu = new CompuConcreto(p_marca, unaCompuLigero);
		return unaCompu;		
	}

}
