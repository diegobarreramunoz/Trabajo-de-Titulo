/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;


/**
 *
 * @author Diego
 */
public class ConexionBD {
    public DataSource dataSource;
    
    public Connection conectar(){
       Connection cn = null;
       try
       {
           inicializaPool();
           cn = dataSource.getConnection();
       }
       catch(SQLException ex){System.out.println("Error CONEXION " + ex.getMessage());}
       return cn;
   }
    
    private void inicializaPool(){
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUsername("sa");
        basicDataSource.setPassword("");
        basicDataSource.setUrl("jdbc:sqlserver://localhost;databaseName=BDserviciotecnico");
        //basicDataSource.setInitialSize(0);
        //basicDataSource.setMaxIdle(0);
        //basicDataSource.setMaxOpenPreparedStatements(0);
        basicDataSource.setMaxTotal(20);
        dataSource = basicDataSource;
    }
}
