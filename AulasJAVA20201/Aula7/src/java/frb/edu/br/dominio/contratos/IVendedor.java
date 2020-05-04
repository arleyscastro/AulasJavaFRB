
package frb.edu.br.dominio.contratos;

import frb.edu.br.dominio.entidades.VendedorDto;
import java.util.List;


public interface IVendedor {
    boolean incluir(VendedorDto vendedor);
    boolean alterar(VendedorDto vendedor);
    boolean deletar(int id);
    VendedorDto getRegistroPorId(int id);
    List<VendedorDto> getListaTodos();
}
