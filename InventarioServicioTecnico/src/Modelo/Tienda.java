/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Diego
 */
public class Tienda {
    private ConexionBD ConexionBD = new ConexionBD();
    private Connection cn;
    private Integer CODTIENDA;
    private String NOMBRE;
    private String DIRECCION;
    private Integer TELEFONO;
    
    public Tienda(){
        CODTIENDA=null;
        NOMBRE=null;
        DIRECCION=null;
        TELEFONO=null;
    }
    
    public Integer getCODTIENDA() {
        return CODTIENDA;
    }
    public void setCODTIENDA(Integer CODTIENDA) {
        this.CODTIENDA = CODTIENDA;
    }
    public String getNOMBRE() {
        return NOMBRE;
    }
    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }
    public String getDIRECCION() {
        return DIRECCION;
    }
    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }
    public Integer getTELEFONO() {
        return TELEFONO;
    }
    public void setTELEFONO(Integer TELEFONO) {
        this.TELEFONO = TELEFONO;
    }
    
    public boolean crearTienda(Tienda tienda){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try{
            String sql = "INSERT INTO TIENDA(NOMBRE, DIRECCION, TELEFONO) VALUES(?, ?, ?)";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, tienda.getNOMBRE());
            cmd.setString(2, tienda.getDIRECCION());
            cmd.setInt(3, tienda.getTELEFONO());
            if(cmd.executeUpdate()>=1)
            {
                verifica = true;
            }
        }
        catch(Exception ex){}
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
    public boolean modificarTienda(Tienda tienda){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "UPDATE TIENDA SET NOMBRE = ?, DIRECCION = ?, TELEFONO = ? WHERE COD_TIENDA = ?";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, tienda.getNOMBRE());
            cmd.setString(2, tienda.getDIRECCION());
            cmd.setInt(3, tienda.getTELEFONO());
            cmd.setInt(4, tienda.getCODTIENDA());
            if(cmd.executeUpdate()>=1)
            {
                verifica = true;
            }
        }
        catch(Exception ex)
        {
          System.out.println("Error: Tienda" + ex.getMessage());
        }finally{
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
    public Tienda buscarTienda(Tienda tienda){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "SELECT NOMBRE, DIRECCION, TELEFONO FROM TIENDA WHERE COD_TIENDA = ?";
            cmd = cn.prepareStatement(sql);
            cmd.setInt(1, tienda.getCODTIENDA());
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                verifica = true;
                tienda.setNOMBRE(rs.getString(1).trim());
                tienda.setDIRECCION(rs.getString(2).trim());
                tienda.setTELEFONO(rs.getInt(3));
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Tienda" + ex.getMessage());
        }finally{
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
        return tienda;
    }
    public DefaultComboBoxModel comboTiendas(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        DefaultComboBoxModel listmodeltienda = new DefaultComboBoxModel();
        listmodeltienda.addElement("Seleccionar una Tienda");
        try
        {
            String sql = "SELECT COD_TIENDA, DIRECCION, NOMBRE, TELEFONO FROM TIENDA";
            cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                Tienda tienda = new Tienda();
                tienda.setCODTIENDA(rs.getInt(1));
                tienda.setDIRECCION(rs.getString(2).trim());
                tienda.setNOMBRE(rs.getString(3).trim());
                tienda.setTELEFONO(rs.getInt(4));
                listmodeltienda.addElement(tienda);
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Tienda" + ex.getMessage());
        }finally{
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
        return listmodeltienda;
    }

    @Override
    public String toString() {
        return CODTIENDA + " " + NOMBRE;
    }
    
}
