package marcus.appCrud01.application.appService;

import marcus.appCrud01.application.viewModel.AlunoResultViewModel;
import marcus.appCrud01.domain.entities.Aluno;
import marcus.appCrud01.domain.services.IAlunoService;

public class AlunoAppService {

	private Aluno aluno;
	
	private IAlunoService alunoService;
	
	public AlunoAppService(IAlunoService alunoService) {
		this.alunoService = alunoService;
	}
	
	public AlunoResultViewModel getAluno(Long id) {
		this.aluno = alunoService.getById(id);
		AlunoResultViewModel information = new AlunoResultViewModel();
		information.parse(aluno);
		return information;
	}
	
}
