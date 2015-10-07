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
public class Equipo {
    //<editor-fold defaultstate="collapsed" desc="DECLARACION DE VARIABLES">
    private ConexionBD ConexionBD = new ConexionBD();
    private Connection cn;
    private String IMEI;
    private String MARCA;
    private String MODELO;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">
    public Equipo(){
        IMEI=null;
        MARCA=null;
        MODELO=null;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GETTER & SETTER">
    public String getIMEI() {
        return IMEI;
    }
    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
    public String getMARCA() {
        return MARCA;
    }
    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }
    public String getMODELO() {
        return MODELO;
    }
    public void setMODELO(String MODELO) {
        this.MODELO = MODELO;
    }
    //</editor-fold>
    
    public String buscarMarca(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        String RESULTADO = "";
        try
        {
            String sql = "SELECT TOP 1 SUBSTRING(MARCA,?,?) FROM EQUIPO WHERE MARCA LIKE ? ORDER BY MARCA";
            cmd = cn.prepareStatement(sql);
            cmd.setInt(1, MARCA.length()+1);
            cmd.setInt(2, 50);
            cmd.setString(3, MARCA+"%");
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                RESULTADO=rs.getString(1).trim();
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Equipo " + ex.getMessage());
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
        return RESULTADO;
        
    }
    public String buscarModelo(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        String RESULTADO = "";
        try
        {
            String sql = "SELECT TOP 1 SUBSTRING(MODELO,?,?) FROM EQUIPO WHERE MODELO LIKE ? AND MARCA = ? ORDER BY MODELO";
            cmd = cn.prepareStatement(sql);
            cmd.setInt(1, MODELO.length()+1);
            cmd.setInt(2, 60);
            cmd.setString(3, MODELO+"%");
            cmd.setString(4, MARCA);
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                
                RESULTADO=rs.getString(1).trim();
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Equipo " + ex.getMessage());
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
        return RESULTADO;
        
    }
    public boolean buscarImei(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "SELECT MARCA, MODELO FROM EQUIPO WHERE IMEI=?";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1,IMEI);
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                verifica = true;
                this.MARCA=rs.getString(1).trim();
                this.MODELO=rs.getString(2).trim();
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Equipo " + ex.getMessage());
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
    public boolean crearEquipo(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try{
            String sql = "INSERT INTO EQUIPO(IMEI, MARCA, MODELO) VALUES(?, ?, ?)";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, IMEI);
            cmd.setString(2, MARCA);
            cmd.setString(3, MODELO);
            if(cmd.executeUpdate()>=1)
            {
                verifica = true;
            }
        }
        catch(SQLException ex){
            if(ex.getErrorCode()==515){
            JOptionPane.showMessageDialog(null, "(EQUIPO)Uno de los campos es incorrecto");}
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "(EQUIPO)Uno de los campos es incorrecto");
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
    public boolean modificarEquipo(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "UPDATE EQUIPO SET MARCA = ?, MODELO = ? WHERE IMEI = ?";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, MARCA);
            cmd.setString(2, MODELO);
            cmd.setString(3, IMEI);
            if(cmd.executeUpdate()>=1)
            {
                verifica = true;
            }
        }
        catch(Exception ex)
        {
          System.out.println("Error: Equipo " + ex.getMessage());
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
