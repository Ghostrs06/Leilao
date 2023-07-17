package Produtos;

import Conect.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutosDao {
    
    public int salvarCadastro(Produtos p) {
        
        PreparedStatement st;

        Conexao cn = new Conexao();
        cn.conectar();

        int status;
        try {
            st = cn.getConexao().prepareStatement("INSERT INTO produtos (nome,valor,status) VALUES(?,?,?)");
            st.setString(1, p.getNome());
            st.setDouble(2, p.getValor());
            st.setString(3, p.getStatus());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return ex.getErrorCode();
        }
        
    }
    
    public List<Produtos> listagemProduto() {
        Conexao bd = new Conexao();
        bd.conectar();
        PreparedStatement st;
        ResultSet rs;
        
        String sql = "SELECT * FROM produtos";
        
        try {
            st = bd.getConexao().prepareStatement(sql);
            
            rs = st.executeQuery();
            List<Produtos> lista = new ArrayList<>();
            
            while(rs.next()) {
                Produtos p = new Produtos();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setValor(rs.getDouble("valor"));
                p.setStatus(rs.getString("status"));
                lista.add(p);
            }
            return lista;
            
        } catch(SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }
    
    public List<Produtos> listagemProdutoVendidos() {
        Conexao bd = new Conexao();
        bd.conectar();
        PreparedStatement st;
        ResultSet rs;
        
        String sql = "SELECT * FROM produtos WHERE status = 'vendido'";
        
        try {
            st = bd.getConexao().prepareStatement(sql);
            
            rs = st.executeQuery();
            List<Produtos> lista = new ArrayList<>();
            
            while(rs.next()) {
                Produtos p = new Produtos();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setValor(rs.getDouble("valor"));
                p.setStatus(rs.getString("status"));
                lista.add(p);
            }
            return lista;
            
        } catch(SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }
    
    public Produtos consultar(int id){
        Conexao bd = new Conexao();
        bd.conectar();
        PreparedStatement st;
        ResultSet rs; 
        
        try {
            Produtos p = new Produtos();
            st = bd.getConexao().prepareStatement("SELECT * from produtos WHERE id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            
            if(rs.next()){
                p.setId(rs.getInt("id"));
                return p;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }
    
    public int atualizar(Produtos p){
        int status;
        Conexao bd = new Conexao();
        bd.conectar();
        PreparedStatement st;
        try {
            st = bd.getConexao().prepareStatement("UPDATE produtos SET status = 'Vendido' WHERE id = ?");
            st.setInt(1,p.getId());
            status = st.executeUpdate();
            return status; 
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }
}
