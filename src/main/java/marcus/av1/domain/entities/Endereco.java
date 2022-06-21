package marcus.av1.domain.entities;

public class Endereco {

	private String numero;
	private String logradouro;
	private String bairro;
	private String referencia;
	private String cep;
	
	public Endereco() {
		
	}
	
	
	public Endereco(String numero, String logradouro, String bairro, String referencia, String cep) {
		this.numero = numero;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.referencia = referencia;
		this.cep = cep;
	}


	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}