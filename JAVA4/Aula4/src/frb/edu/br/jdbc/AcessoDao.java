package frb.edu.br.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcessoDao {

    private String login = "";
    private String senha = "";
    private String driver = "org.sqlite.JDBC";
    private String url = "jdbc:sqlite:D:\\SQLite\\Bancos\\aula.db";
    private Connection cnx;

    public AcessoDao() {
    }

    public void iniciaConexao() {
        try {
            Class.forName(driver);
            cnx = DriverManager.getConnection(url, login, senha);
            System.out.println("Conexao feita OK !!!!!");
        } catch (Exception e) {
            System.out.println("Erro ao conectar, não sei o que foi");
        }
    }

    public void encerraConexao() {
        try {
            if (cnx != null) {
                cnx.close();
            }
            System.out.println("Banco desconectado ok");
        } catch (Exception e) {
            System.out.println("erro ao desconectar...!!!!");
        }
    }
    
    public void consultaProdutos(String nome){
        String sql = "SELECT idproduto, Nome, " +
                "preco, validade, descricao FROM " +
                "TbProduto WHERE Nome like ?";
        try {
            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("COD# " + rs.getInt("idproduto"));
                System.out.println("NOME: " + rs.getString("Nome"));
                System.out.println("Preço: " + rs.getFloat("preco"));
                System.out.println("Validade: " + rs.getDate("validade"));
                System.out.println("Descrição: " + rs.getString("DescRicao"));
                System.out.println("-----------------------------------------------");
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
        }
    }

}
