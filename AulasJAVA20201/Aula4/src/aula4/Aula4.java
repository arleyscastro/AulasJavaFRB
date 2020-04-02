package aula4;

import frb.edu.br.jdbc.AcessoDao;

public class Aula4 {


    public static void main(String[] args) {
        AcessoDao dao = new AcessoDao();
        
        dao.iniciaConexao();
        dao.consultaProdutos("cal");
        dao.encerraConexao();
    }
    
}
