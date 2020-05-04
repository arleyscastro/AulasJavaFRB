
package frb.edu.br.dominio.contratos;

import frb.edu.br.dominio.entidades.VendasDto;
import java.util.List;

public interface IVendas {
    boolean incluir(VendasDto venda);
    boolean alterar(VendasDto venda);
    boolean deletar(int id);
    VendasDto getRegistroPorId(int id);
    List<VendasDto> getListaTodos();
}
