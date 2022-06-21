package marcus.appCrud01;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import marcus.appCrud01.application.appService.AlunoAppService;

@RestController("/aluno")
public class AlunoController {

	@GetMapping
	public List<String> get() {
		return Arrays.asList("value 1", "value 2");
	}

	@GetMapping("/{id}")
	public String Get(@PathVariable("id") Long id) {
		AlunoAppService alunoAppService = new AlunoAppService(null);
		return alunoAppService.getAluno(id).toString();
	}

}
