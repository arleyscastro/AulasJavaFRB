package frb.edu.br.controladores;


import frb.edu.br.dominio.contratos.IVendedor;
import frb.edu.br.dominio.entidades.VendedorDto;
import frb.edu.br.infra.repositorios.VendedorRepositorio;
import java.util.List;

public class VendedorController {

    private VendedorDto vendedor;
    private List<VendedorDto> vendedores = null;
    
    private IVendedor vendedorrepositorio = new VendedorRepositorio();

    public VendedorController() {
    }

    public VendedorDto getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorDto vendedor) {
        this.vendedor = vendedor;
    }

    public List<VendedorDto> getVendedores() {
        if(vendedores == null){
            vendedores = vendedorrepositorio.getListaTodos();
        }
        return vendedores;
    }

    public String prepararInclusao(){
        vendedor = new VendedorDto();
        return "vaiParaIncluir";
    }
    
    public String finalizaInclusao(){
        
        vendedorrepositorio.incluir(vendedor);
        vendedores = null;
        return "voltaParaListagem";
    }
    
    public String finalizaEdicao(){
        vendedorrepositorio.alterar(vendedor);
        vendedores = null;
        return "voltaParaListagem";
    }
    
    public String finalizaDelecao(){
        vendedorrepositorio.deletar( vendedor.getIdvendedor() );
        vendedores = null;
        return "refresh";
    }
}

