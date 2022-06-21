package marcus.av1.domain.entities;

public class Frete {

	private String ditribuidora;
	private Double valor;

	public Frete() {
		// TODO Auto-generated constructor stub
	}

	
	public Frete(String ditribuidora, Double valor) {
		this.ditribuidora = ditribuidora;
		this.valor = valor;
	}

	public String getDitribuidora() {
		return ditribuidora;
	}
	public void setDitribuidora(String ditribuidora) {
		this.ditribuidora = ditribuidora;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
