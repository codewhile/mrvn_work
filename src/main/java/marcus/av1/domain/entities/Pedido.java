package marcus.av1.domain.entities;

public class Pedido {

	private Long id;
	private Cliente cliente;
	private Double valorTotal;
	private Frete frete;
	private Entrega entrega;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Long id, Cliente cliente, Double valorTotal) {
		this.id = id;
		this.cliente = cliente;
		this.valorTotal = valorTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Frete getFrete() {
		return frete;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
	
}
