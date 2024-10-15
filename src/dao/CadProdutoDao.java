/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.CadProdutoM;

/**
 *
 * @author gabri
 */
public class CadProdutoDao {
      private ConexaoBanco conexao;
    
        public CadProdutoDao()
        {
            this.conexao = new ConexaoBanco();
        }
    
     public ArrayList<CadProdutoM> consultar() {
        
        ArrayList<CadProdutoM> listaCadastros = new ArrayList<CadProdutoM>();
        String sql = "SELECT * FROM products ";
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                ResultSet resultadoSentenca = sentenca.executeQuery();
                //percorrer cada linha do resultado
                while(resultadoSentenca.next()) 
                {
                    //resgata o valor de cada linha, selecionando pelo nome de cada coluna da tabela Escola
                    CadProdutoM cadastro = new CadProdutoM();
                    cadastro.setName(resultadoSentenca.getString("name"));
                    cadastro.setPrice(resultadoSentenca.getInt("price"));
                    cadastro.setDesc(resultadoSentenca.getString("description"));
                    cadastro.setQtd(resultadoSentenca.getInt("quantity"));
                    cadastro.setId(resultadoSentenca.getInt("id"));
                    
                    listaCadastros.add(cadastro);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return listaCadastros;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        } 
    }
       
     public CadProdutoM findById(String id){
         try
        {
            CadProdutoM cadastro = new CadProdutoM();

            if(this.conexao.conectar())
            {
                String sql = "SELECT * FROM products WHERE id = ? ";

                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1,id); 
                ResultSet resultadoSentenca = sentenca.executeQuery();
                if(resultadoSentenca.next()){
                System.out.println(resultadoSentenca);
                //percorrer cada linha do resultado
                    cadastro.setName(resultadoSentenca.getString("name"));
                    cadastro.setPrice(resultadoSentenca.getInt("price"));
                    cadastro.setDesc(resultadoSentenca.getString("description"));
                    cadastro.setQtd(resultadoSentenca.getInt("quantity"));
                    cadastro.setId(resultadoSentenca.getInt("id"));
                }

                this.conexao.getConnection().close();
                return cadastro;
            }
            
            return cadastro;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        } 
     }
     public void inserir(CadProdutoM cadastro) {
        String sql = "INSERT INTO products (name, price, quantity, description) VALUES (?,?,?,?)";
        
        try
        {
            if(this.conexao.conectar())
            {
                
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                
                sentenca.setString(1,cadastro.getName()); 
                sentenca.setString(2,String.valueOf(cadastro.getPrice()));
                sentenca.setString(3,String.valueOf(cadastro.getQtd())); 
                sentenca.setString(4,cadastro.getDesc());               
                sentenca.execute(); 
                sentenca.close(); 
                this.conexao.getConnection().close(); 
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
     public void update(CadProdutoM cadastro) {
       String sql = "UPDATE products SET name = ?, price = ?, quantity = ?, description = ? WHERE id = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                
                sentenca.setString(1,cadastro.getName()); 
                sentenca.setString(2,String.valueOf(cadastro.getPrice()));
                sentenca.setString(3,String.valueOf(cadastro.getQtd())); 
                sentenca.setString(4,cadastro.getDesc());               
                sentenca.setString(5,String.valueOf(cadastro.getId()));                
                sentenca.execute(); 
                sentenca.close(); 
                this.conexao.getConnection().close(); 
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
     public void delete(CadProdutoM cadastro){
                  String sql = "DELETE  FROM products WHERE id = ?";

        try
        {
            if(this.conexao.conectar())
            {
                
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setString(1,String.valueOf(cadastro.getId()));
                sentenca.execute(); 
                sentenca.close(); 
                this.conexao.getConnection().close(); 
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
     }
}
