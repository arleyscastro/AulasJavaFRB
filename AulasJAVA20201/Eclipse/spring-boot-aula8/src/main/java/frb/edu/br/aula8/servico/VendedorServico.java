package frb.edu.br.aula8.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frb.edu.br.aula8.model.Vendedor;
import frb.edu.br.aula8.repositorio.IVendedorRepositorio;

@Service
public class VendedorServico {

	@Autowired
	IVendedorRepositorio repositorio;
	
	
	public Vendedor inserir(Vendedor vendedor) {
		return repositorio.save(vendedor);
	}
	
	public Vendedor alterar(Vendedor vendedor) {
		Vendedor vend = repositorio.findById((long)vendedor.getIdvendedor() ).orElseThrow(null);
		
		vend.setNome( vendedor.getNome() );
		vend.setComissao(vendedor.getComissao());
		
		return repositorio.save(vend);
	}
	
	public List<Vendedor> buscaTodos(){
		return repositorio.findAll();
	}
	
	public Vendedor buscaPorId(long id) {
		return repositorio.findById(id).orElseThrow(null);
	}
	
	public void apagar(long id) {
		repositorio.deleteById(id);
	}
	
}
