
public class CompuConcreto implements Compu {

	private String marca;
	private CompuLigero compuLigero;
	
	public CompuConcreto(String p_marca, CompuLigero p_compuLigero) {
		super();
		this.setMarca(p_marca);
	}
	
	private void setMarca(String p_marca) {
		this.marca = p_marca;
	}

	public String getCpu() {
		return compuLigero.getCpu();
	}

	@Override
	public String getMarca() {
		return marca;
	}
	
}
