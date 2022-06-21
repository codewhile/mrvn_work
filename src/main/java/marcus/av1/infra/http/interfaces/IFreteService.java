package marcus.av1.infra.http.interfaces;

import marcus.av1.domain.entities.Endereco;
import marcus.av1.domain.entities.Frete;

public interface IFreteService {

	Frete getFrete(Endereco destino);
	
}
