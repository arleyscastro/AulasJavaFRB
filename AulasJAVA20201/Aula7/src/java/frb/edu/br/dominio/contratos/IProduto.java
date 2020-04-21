
package frb.edu.br.dominio.contratos;

import frb.edu.br.dominio.entidades.ProdutoDto;
import java.util.List;


public interface IProduto {
    boolean incluir(ProdutoDto produto);
    boolean alterar(ProdutoDto produto);
    boolean deletar(int id);
    ProdutoDto getRegistroPorId(int id);
    List<ProdutoDto> getListaTodos();
}
