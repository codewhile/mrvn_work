package marcus.appCrud01;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import marcus.appCrud01.application.appService.AlunoAppService;
import marcus.appCrud01.application.viewModel.AlunoResultViewModel;
import marcus.appCrud01.domain.entities.Aluno;
import marcus.appCrud01.domain.services.IAlunoService;
import marcus.av1.domain.entities.Carrinho;
import marcus.av1.domain.entities.Produto;

@SpringBootTest
class MrvnApplicationTests {

	@Test
	public void deve_converter_aluno_em_alunoViewModel_apropriadamente() {

		// Arrange
		Long id = 1L;
		Aluno aluno = new Aluno(id, "jose da silva", "123456");
		IAlunoService mockService = Mockito.mock(IAlunoService.class);
		Mockito.when(mockService.getById(id)).thenReturn(aluno);

		// Act
		AlunoAppService alunoAppService = new AlunoAppService(mockService);
		AlunoResultViewModel alunoEsperado = alunoAppService.getAluno(id);

		// Assert
		Assertions.assertEquals(aluno.getMatricula(), alunoEsperado.getMatricula());
	}
	
	


}
