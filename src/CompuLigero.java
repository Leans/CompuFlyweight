
public class CompuLigero {
	
	private String cpu;
	private static int contador;
	
	public CompuLigero(String p_cpu) {
		super();
		this.setCpu(p_cpu);
		contador++;
		System.out.println("Contador: " + contador);
	}
	
	public String getCpu() {
		return this.cpu;
	}
	
	public void setCpu(String p_cpu) {
		this.cpu = p_cpu;
	}

}
