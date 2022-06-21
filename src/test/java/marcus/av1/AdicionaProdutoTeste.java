package marcus.av1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import marcus.av1.domain.entities.Carrinho;
import marcus.av1.domain.entities.Produto;

@SpringBootTest
public class AdicionaProdutoTeste {

	@Test
	public void deve_adicionar_um_único_produto() {

		Produto produto = new Produto(1, "Shampoo", 11, 19.99, "Dove");

		Carrinho carrinho = new Carrinho();

		carrinho.adicionaProduto(produto);

		Assertions.assertEquals(produto, carrinho.getItens().get(0).getProduto());

	}

	@Test
	public void deve_adicionar_mais_de_um_produto() {

		List<Produto> produtos = Arrays.asList(new Produto(1, "Shampoo", 11, 19.99, "Dove"),
				new Produto(2, "Detergente", 11, 19.99, "Dove"), new Produto(3, "Sabonete", 11, 19.99, "Dove"),
				new Produto(4, "Escova de dente", 11, 19.99, "Colgate"),
				new Produto(5, "Pasta de dente", 11, 19.99, "Sorriso"),
				new Produto(6, "Desinfetante", 11, 19.99, "Max"),
				new Produto(7, "Lustra móveis", 11, 19.99, "Madeiro"));

		Carrinho carrinho = new Carrinho();

		carrinho.adicionaProdutos(produtos);

		for (int i = 0; i < produtos.size(); i++) {
			Assertions.assertEquals(produtos.get(i), carrinho.getItens().get(i).getProduto());
		}

	}

}
