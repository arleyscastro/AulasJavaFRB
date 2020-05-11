package frb.edu.br.controladores;

import frb.edu.br.dominio.contratos.IVendas;
import frb.edu.br.dominio.entidades.VendasDto;
import frb.edu.br.infra.repositorios.VendasRepositorio;
import java.util.List;


public class VendasController {
    private IVendas vendasDao = new VendasRepositorio();

    private VendasDto venda;
    private List<VendasDto> vendas = null;

    public VendasController() {
    }

    public VendasDto getVenda() {
        return venda;
    }

    public void setVenda(VendasDto venda) {
        this.venda = venda;
    }

    public List<VendasDto> getVendas() {
        if(vendas == null){
            vendas = vendasDao.getListaTodos();
        }
        return vendas;
    }
    public String preparaInclusao(){
        venda = new VendasDto();
        return "vaiParaIncluir";
    }
    
    public String finalizaInclusao(){
        vendasDao.incluir(venda);
        return "voltaParaListagem";
    }
    
    
}
