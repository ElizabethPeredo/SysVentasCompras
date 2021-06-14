/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author PcLab
 */
public class Conexión {
    //ATRIBUTOS
    public String db = "SysVentasCompras";
    public String url = "jdbc:mysql://127.0.0.1/"+db;
    public String user = "root";
    public String pass = "";
    //CONSTRUCTOR
    public Conexión()
    {
        
    }
    //METODOS
    public Connection Conectar()
    {
        Connection link = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            link=DriverManager.getConnection(this.url , this.user, this.pass);
        }
        catch (ClassNotFoundException | SQLException e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }
    public void Desconectar()
    {
        Connection link = null;
    }
}
