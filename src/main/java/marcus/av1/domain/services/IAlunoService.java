package marcus.av1.domain.services;

import java.util.List;

import marcus.appCrud01.domain.entities.Aluno;

public interface IAlunoService {

	   List<Aluno> getAll();
       Aluno getById(Long id);
       void add(Aluno aluno);
       void update(Aluno aluno);
       void remove(Aluno aluno);
	
}
