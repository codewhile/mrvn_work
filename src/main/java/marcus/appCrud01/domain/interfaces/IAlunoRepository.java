package marcus.appCrud01.domain.interfaces;

import java.util.List;

import marcus.appCrud01.domain.entities.Aluno;

public interface IAlunoRepository {

	public List<Aluno> getAll();
	Aluno getById(int id);
	void create(Aluno aluno);
	void update(Aluno aluno);
	void remove(Aluno aluno);
	
}
