package frb.edu.br.dominio.entidades;

public class VendasDto {
    private int idvendas;
    private ProdutoDto produto;
    private VendedorDto vendedor;
    private double vlvenda;
    private int quantidade;

    public VendasDto() {
        produto = new ProdutoDto();
        vendedor = new VendedorDto();
    }

    public VendasDto(int idvendas, ProdutoDto produto, VendedorDto vendedor, double vlvenda, int quantidade) {
        this.idvendas = idvendas;
        this.produto = produto;
        this.vendedor = vendedor;
        this.vlvenda = vlvenda;
        this.quantidade = quantidade;
    }

    public VendasDto(int idvendas) {
        this.idvendas = idvendas;
        produto = new ProdutoDto();
        vendedor = new VendedorDto();
    }

    public int getIdvendas() {
        return idvendas;
    }

    public void setIdvendas(int idvendas) {
        this.idvendas = idvendas;
    }

    public ProdutoDto getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDto produto) {
        this.produto = produto;
    }

    public VendedorDto getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorDto vendedor) {
        this.vendedor = vendedor;
    }

    public double getVlvenda() {
        return vlvenda;
    }

    public void setVlvenda(double vlvenda) {
        this.vlvenda = vlvenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
}
