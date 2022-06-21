package marcus.av1.domain.interfaces;

import java.util.List;

import marcus.appCrud01.domain.entities.Aluno;
import marcus.av1.domain.entities.Cliente;

public interface IClienteRepository {

	public List<Cliente> getAll();
	Aluno getById(int id);
	void create(Cliente aluno);
	void update(Cliente aluno);
	void remove(Cliente aluno);
	
}
