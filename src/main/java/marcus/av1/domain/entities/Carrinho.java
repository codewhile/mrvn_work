package marcus.av1.domain.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carrinho {

	private Long id;
	private Date dataCompra;
	private Double valorTotal;
	private Double frete;	
	private Cliente cliente;
	private List<ItemCarrinho> itens = new ArrayList<ItemCarrinho>();
	
	public Carrinho() {
	}
	
	public Carrinho(Long id, Date dataCompra, Double valorTotal, Double frete) {
		this.id = id;
		this.dataCompra = dataCompra;
		this.valorTotal = valorTotal;
		this.frete = frete;
	}
	
	public void adicionaProduto(Produto produto) {
		itens.add(new ItemCarrinho(this, produto, produto.getQuantidade()));
	}
	
	public void adicionaProdutos(List<Produto> produtos) {
		
		for (Produto produto : produtos) {
			adicionaProduto(produto);
		}
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Double getFrete() {
		return frete;
	}
	public void setFrete(Double frete) {
		this.frete = frete;
	}

	public List<ItemCarrinho> getItens() {
		return itens;
	}

	public void setItens(List<ItemCarrinho> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
