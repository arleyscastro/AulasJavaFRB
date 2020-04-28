
package frb.edu.br.dominio.entidades;

import java.util.Date;


public class ProdutoDto {
    private int idproduto;
    private String nome;
    private float preco;
    private Date validade;
    private String descricao;

    public ProdutoDto() {
    }

    public ProdutoDto(int idproduto, String nome, float preco, Date validade, String descricao) {
        this.idproduto = idproduto;
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
        this.descricao = descricao;
    }

    public ProdutoDto(int idproduto) {
        this.idproduto = idproduto;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
 
}
