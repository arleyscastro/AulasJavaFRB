package frb.edu.br.controladores;

import frb.edu.br.dominio.contratos.IProduto;
import frb.edu.br.dominio.entidades.ProdutoDto;
import frb.edu.br.infra.repositorios.ProdutoRepositorio;
import java.util.List;


public class ProdutoController {
    private ProdutoDto produto;
    private List<ProdutoDto> produtos = null;
    
    private IProduto produtoRepositorio = new ProdutoRepositorio();


    public ProdutoController() {
    }

    public ProdutoDto getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDto produto) {
        this.produto = produto;
    }

    public List<ProdutoDto> getProdutos() {
        if(produtos == null){
            produtos = produtoRepositorio.getListaTodos();
        }
        return produtos;
    }
    
    public String prepararInclusao(){
        produto = new ProdutoDto();
        return "vaiParaIncluir";
    }
    
    public String finalizaInclusao(){
        
        produtoRepositorio.incluir(produto);
        produtos = null;
        return "voltaParaListagem";
    }
    
    public String finalizaEdicao(){
        produtoRepositorio.alterar(produto);
        produtos = null;
        return "voltaParaListagem";
    }
    
    public String finalizaDelecao(){
        produtoRepositorio.deletar( produto.getIdproduto() );
        produtos = null;
        return "refresh";
    }
    
    
}
