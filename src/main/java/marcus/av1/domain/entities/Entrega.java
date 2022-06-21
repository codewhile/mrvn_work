package marcus.av1.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class Entrega {

	private String codigoDeRastreio;
	private Endereco destino;
	private List<Etapa> etapas = new ArrayList<Etapa>();

	public Entrega() {

	}

	public Entrega(String codigoDeRastreio, Endereco destino, List<Etapa> etapas) {
		this.codigoDeRastreio = codigoDeRastreio;
		this.destino = destino;
		this.etapas = etapas;
	}

	public String getCodigoDeRastreio() {
		return codigoDeRastreio;
	}

	public void setCodigoDeRastreio(String codigoDeRastreio) {
		this.codigoDeRastreio = codigoDeRastreio;
	}

	public Endereco getDestino() {
		return destino;
	}

	public void setDestino(Endereco destino) {
		this.destino = destino;
	}

	public List<Etapa> getEtapas() {
		return etapas;
	}

	public void setEtapas(List<Etapa> etapas) {
		this.etapas = etapas;
	}

}
