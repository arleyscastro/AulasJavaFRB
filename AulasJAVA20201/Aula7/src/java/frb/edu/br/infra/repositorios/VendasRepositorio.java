package frb.edu.br.infra.repositorios;

import frb.edu.br.dominio.contratos.IVendas;
import frb.edu.br.dominio.entidades.VendasDto;
import frb.edu.br.infra.data.DaoUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VendasRepositorio extends DaoUtil implements IVendas{

    public VendasRepositorio() {
        super();
    }    

    @Override
    public boolean incluir(VendasDto venda) {
        String sql = "INSERT INTO vendas (idProduto, idVendedor, vlVenda, quantidade) " +
                     " VALUES (?, ?, ?, ?) ";
        PreparedStatement ps;
        int ret=-1;
        try {
            ps = getPreparedStatement(sql);
            ps.setInt(1, venda.getProduto().getIdproduto());
            ps.setInt(2, venda.getVendedor().getIdvendedor());
            ps.setDouble(3, venda.getVlvenda());
            ps.setInt(4, venda.getQuantidade());
            ret = ps.executeUpdate();
            ps.close();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, e);
        }catch (SQLException ex){
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret >0;
    }

    @Override
    public boolean alterar(VendasDto venda) {
        String sql = "UPDATE vendas SET idProduto=?, idVendedor=?, vlVenda=?, quantidade=? " +
                     " WHERE idvendas=?";
        PreparedStatement ps;
        int ret=-1;
        try {
            ps = getPreparedStatement(sql);
            ps.setInt(1, venda.getProduto().getIdproduto());
            ps.setInt(2, venda.getVendedor().getIdvendedor());
            ps.setDouble(3, venda.getVlvenda());
            ps.setInt(4, venda.getQuantidade());
            ps.setInt(5, venda.getIdvendas());
            ret = ps.executeUpdate();
            ps.close();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, e);
        }catch (SQLException ex){
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret >0;
    }

    @Override
    public boolean deletar(int id) {
        String sql = "DELETE FROM vendas " +
                     " WHERE idvendas=?";
        PreparedStatement ps;
        int ret=-1;
        try {
            ps = getPreparedStatement(sql);
            ps.setInt(1, id);
            ret = ps.executeUpdate();
            ps.close();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, e);
        }catch (SQLException ex){
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret >0;
    }

    @Override
    public VendasDto getRegistroPorId(int id) {
        VendasDto venda = new VendasDto();
        
        String sql = "SELECT idVendas, idProduto, idVendedor, vlVenda, quantidade " +
                     " FROM vendas WHERE idVendas=?";
        
        ProdutoRepositorio prod = new ProdutoRepositorio();
        VendedorRepositorio vend = new VendedorRepositorio();
        try {
            PreparedStatement ps = getPreparedStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while ( rs.next() ) {                
                venda = new VendasDto(rs.getInt("idVendas"), 
                        prod.getRegistroPorId(rs.getInt("idProduto")), 
                        vend.getRegistroPorId(rs.getInt("idVendedor")), 
                        rs.getDouble("vlVenda"), 
                        rs.getInt("quantidade"));
            }
            
        } catch (ClassNotFoundException e) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException ex) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
        return venda;
    }

    @Override
    public List<VendasDto> getListaTodos() {
        List<VendasDto> venda = new LinkedList<VendasDto>();
        
        String sql = "SELECT idVendas, idProduto, idVendedor, vlVenda, quantidade FROM vendas";
        
        ProdutoRepositorio prod = new ProdutoRepositorio();
        VendedorRepositorio vend = new VendedorRepositorio();
        try {
            PreparedStatement ps = getPreparedStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while ( rs.next() ) {                
                venda.add( new VendasDto(
                        rs.getInt("idVendas"), 
                        prod.getRegistroPorId(rs.getInt("idProduto")), 
                        vend.getRegistroPorId(rs.getInt("idVendedor")), 
                        rs.getDouble("vlVenda"), 
                        rs.getInt("quantidade")
                        )
                );
            }
            
        } catch (ClassNotFoundException e) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException ex) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
        return venda;
    }
    
}
