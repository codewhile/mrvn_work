package marcus.av1.infra.http.service;

import marcus.av1.domain.entities.Endereco;
import marcus.av1.domain.entities.Frete;
import marcus.av1.infra.http.interfaces.IFreteService;

public class FreteCorreioService 
	implements IFreteService {

	@Override
	public Frete getFrete(Endereco destino) {
		return new Frete("Correio", null);
	}
	
}
