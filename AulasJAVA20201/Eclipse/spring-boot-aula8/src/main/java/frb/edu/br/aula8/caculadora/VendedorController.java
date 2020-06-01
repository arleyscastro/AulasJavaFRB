package frb.edu.br.aula8.caculadora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import frb.edu.br.aula8.model.Vendedor;
import frb.edu.br.aula8.servico.VendedorServico;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {

	@Autowired
	private VendedorServico servico;
	
	
	@GetMapping("todos")
	public List<Vendedor> buscaTodos(){
		return servico.buscaTodos();
	}
	
	@GetMapping("/buscaporid/{id}")
	public Vendedor buscaPorId(@PathVariable("id") long id) {
		return servico.buscaPorId(id);
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletar(@PathVariable("id") long id) {
		servico.apagar(id);
	}
	
}
