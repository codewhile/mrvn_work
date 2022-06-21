package marcus.av1.domain.entities;

public class ItemCarrinho {

	private Long id = 0L;
	private Carrinho carrinho;
	private Produto produto;
	private Integer quantidade;
	
	
	// INFORMAÇÃO CALCULÁVEL
	private Double preco;
	
	// INFORMÇÃO DUPLICADA
	private String nomeProduto;

	public ItemCarrinho() {
		
	}
	
	public ItemCarrinho(Carrinho carrinho, Produto produto, Integer quantidade) {
		this.carrinho = carrinho;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	
	
	
}
