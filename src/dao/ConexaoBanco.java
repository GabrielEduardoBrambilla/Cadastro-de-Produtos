/**
 *
 * @author xtremebass
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Objeto
public class ConexaoBanco {   
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao; 
//Construtor
    public ConexaoBanco() {
       
        this.servidor = "200.195.171.124";
        this.banco = "grupo06_Brambilla";
        this.usuario = "grupo06";
        this.senha = "xyZ4d6lGuJ4EfOz0";
    }
    public boolean conectar(){
        try
        {
            this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
            return true;
        }
        catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    public Connection getConnection() {
        return conexao;
    }

}
