/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Cliente {
    //<editor-fold defaultstate="collapsed" desc="DECLARACION DE VARIABLES">
    private ConexionBD ConexionBD = new ConexionBD();
    private Connection cn;
    private String RUT_C;
    private String NOMBRE_C;
    private Integer TELEFONO;
    private String EMAIL;
    private String DIRECCION;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">
    public Cliente(){
    RUT_C=null;
    NOMBRE_C=null;
    TELEFONO=null;
    EMAIL=null;
    DIRECCION=null;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GETTER & SETTER">
    public String getRUT_C() {
        return RUT_C;
    }
    public void setRUT_C(String RUT_C) {
        this.RUT_C = RUT_C;
    }
    public String getNOMBRE_C() {
        return NOMBRE_C;
    }
    public void setNOMBRE_C(String NOMBRE_C) {
        this.NOMBRE_C = NOMBRE_C;
    }
    public Integer getTELEFONO() {
        return TELEFONO;
    }
    public void setTELEFONO(Integer TELEFONO) {
        this.TELEFONO = TELEFONO;
    }
    public String getEMAIL() {
        return EMAIL;
    }
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    public String getDIRECCION() {
        return DIRECCION;
    }
    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }
    //</editor-fold>
    
    public boolean buscarCliente(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "SELECT * FROM CLIENTE WHERE RUT_C = ?";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, RUT_C);
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                verifica = true;
                TELEFONO=rs.getInt(2);
                EMAIL= rs.getString(3).trim();
                DIRECCION=rs.getString(4).trim();
                NOMBRE_C = rs.getString(5).trim();
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Cliente " + ex.getMessage());
        }
        finally{
            try{
                if(cmd!=null){
                    cmd.close();
                }
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
                }
        }
        return verifica;
    }
    public boolean crearCliente(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try{
            String sql = "INSERT INTO CLIENTE(RUT_C, NOMBRE, TELEFONO, EMAIL, DIRECCION) VALUES(?, ?, ?, ?, ?)";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, RUT_C);
            cmd.setString(2, NOMBRE_C);
            cmd.setInt(3, TELEFONO);
            cmd.setString(4, EMAIL);
            cmd.setString(5, DIRECCION);
            if(cmd.executeUpdate()>=1)
            {
                verifica = true;
            }
        }
        catch(SQLException ex){
            if(ex.getErrorCode()==515){
            JOptionPane.showMessageDialog(null, "(CLIENTE)Uno de los campos es incorrecto");}
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "(CLIENTE)Uno de los campos es incorrecto");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        finally{
            try{
                if(cmd!=null){
                    cmd.close();
                }
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
                }
        }
        return verifica;
    }
    public boolean modificarCliente(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "UPDATE CLIENTE SET TELEFONO = ?, EMAIL = ?, "
                    + "DIRECCION = ?, NOMBRE = ? WHERE RUT_C = ?";
            cmd = cn.prepareStatement(sql);
            cmd.setInt(1, TELEFONO);
            cmd.setString(2, EMAIL);
            cmd.setString(3, DIRECCION);
            cmd.setString(4, NOMBRE_C);
            cmd.setString(5, RUT_C);
            if(cmd.executeUpdate()>=1)
            {
                verifica = true;
            }
        }
        catch(Exception ex)
        {
          System.out.println("Error: Cliente" + ex.getMessage());
        }
        finally{
            try{
                if(cmd!=null){
                    cmd.close();
                }
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
                }
        }
        return verifica;
    }
}
