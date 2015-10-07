/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class OrdenDeTrabajo {
    //<editor-fold defaultstate="collapsed" desc="DECLARACION DE VARIABLES">
    private ConexionBD ConexionBD = new ConexionBD();
    private Connection cn;
    private Integer NUM_ORDEN;
    private String RUT_P;
    private String IMEI;
    private String SERIE;
    private String RUT_C;
    private Integer CODLOCAL;
    private Date FECHA_ING;
    private Date FECHA_EN;
    private String DIAGNO;
    private Integer ABONO;
    private Integer TOTAL;
    private String DESCRIP_OBSER;
    private String ESTADO;
    private String FALLA;
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">
    public OrdenDeTrabajo(){
        CODLOCAL=null;
        IMEI=null;
        RUT_C=null;
        NUM_ORDEN = null;
        RUT_P = null;
        FECHA_ING = null;
        FECHA_EN = null;
        DIAGNO = null;
        ABONO = null;
        TOTAL = null;
        DESCRIP_OBSER = null;
        ESTADO = null;
        FALLA=null;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="METODOS GETTER & SETTER">
    public String getSERIE() {
        return SERIE;
    }
    public void setSERIE(String SERIE) {
        this.SERIE = SERIE;
    }
    public int getNUM_ORDEN() {
        return NUM_ORDEN;
    }
    public void setNUM_ORDEN(Integer NUM_ORDEN) {
        this.NUM_ORDEN = NUM_ORDEN;
    }
    public String getRUT_P() {
        return RUT_P;
    }
    public void setRUT_P(String RUT_P) {
        this.RUT_P = RUT_P;
    }
    public String getIMEI() {
        return IMEI;
    }
    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
    public String getRUT_C() {
        return RUT_C;
    }
    public void setRUT_C(String RUT_C) {
        this.RUT_C = RUT_C;
    }
    public Date getFECHA_ING() {
        return FECHA_ING;
    }
    public void setFECHA_ING(Date FECHA_ING) {
        this.FECHA_ING = FECHA_ING;
    }
    public Date getFECHA_EN() {
        return FECHA_EN;
    }
    public void setFECHA_EN(Date FECHA_EN) {
        this.FECHA_EN = FECHA_EN;
    }
    public String getDIAGNO() {
        return DIAGNO;
    }
    public void setDIAGNO(String DIAGNO) {
        this.DIAGNO = DIAGNO;
    }
    public int getABONO() {
        return ABONO;
    }
    public void setABONO(Integer ABONO) {
        this.ABONO = ABONO;
    }
    public int getTOTAL() {
        return TOTAL;
    }
    public void setTOTAL(Integer TOTAL) {
        this.TOTAL = TOTAL;
    }
    public String getDESCRIP_OBSER() {
        return DESCRIP_OBSER;
    }
    public void setDESCRIP_OBSER(String DESCRIP_OBSER) {
        this.DESCRIP_OBSER = DESCRIP_OBSER;
    }
    public String getESTADO() {
        return ESTADO;
    }
    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }
    public Integer getCODLOCAL() {
        return CODLOCAL;
    }
    public void setCODLOCAL(Integer CODLOCAL) {
        this.CODLOCAL = CODLOCAL;
    }
    public String getFALLA() {
        return FALLA;
    }
    public void setFALLA(String FALLA) {
        this.FALLA = FALLA;
    }

    
    
    //</editor-fold>
    
    public boolean crearOrden(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try{
            String sql = "INSERT " +
            "INTO " +
            "ORDEN_TRABAJO " +
            "(IMEI, RUT_C, RUT_P, FECHA_ING, FECHA_ENT, ABONO, TOTAL, DESCRIP_OBSER, DIAGNOSTICO, ESTADO, COD_TIENDA, FALLA, SERIE) " +
            "VALUES " +
            "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, IMEI);
            cmd.setString(2, RUT_C);
            cmd.setString(3, RUT_P);
            cmd.setDate(4, OPAlter.convertirUtilASQL(FECHA_ING));
            cmd.setDate(5, OPAlter.convertirUtilASQL(FECHA_EN));
            cmd.setInt(6, ABONO);
            cmd.setInt(7, TOTAL);
            cmd.setString(8, DESCRIP_OBSER);
            cmd.setString(9, DIAGNO);
            cmd.setString(10, ESTADO);
            cmd.setInt(11, CODLOCAL);
            cmd.setString(12, FALLA);
            cmd.setString(13, SERIE);
            if(cmd.executeUpdate()>=1)
            {
                verifica = true;
            }
        }
        catch(SQLException ex){
            if(ex.getErrorCode()==515){JOptionPane.showMessageDialog(null, "(ORDEN)Uno de los campos es incorrecto");}
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "(ORDEN)Uno de los campos es incorrecto");
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
    public Integer buscarUltimaOrden(Integer codtienda){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        Integer num_orden = null;
        try
        {
            String sql = "SELECT MAX(NUM_ORDEN) FROM ORDEN_TRABAJO WHERE COD_TIENDA = ?";
            cmd = cn.prepareStatement(sql);
            cmd.setInt(1, codtienda);
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                num_orden=rs.getInt(1);
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
        return num_orden;
    }
    public boolean buscarOrden(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "SELECT RUT_P, RUT_C, COD_TIENDA, IMEI, FECHA_ING, FECHA_ENT, ABONO, "
                    + "TOTAL, ESTADO, FALLA, DESCRIP_OBSER, DIAGNOSTICO "
                    + "FROM ORDEN_TRABAJO "
                    + "WHERE (NUM_ORDEN = ? AND SUBSTRING(IMEI,1,3)= SUBSTRING(?,1,3))";
            cmd = cn.prepareStatement(sql);
            cmd.setInt(1, NUM_ORDEN);
            cmd.setString(2, IMEI);
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                verifica = true;
                RUT_P=rs.getString(1).trim();
                RUT_C=rs.getString(2).trim();
                CODLOCAL=rs.getInt(3);
                IMEI=rs.getString(4).trim();
                FECHA_ING=rs.getDate(5);
                FECHA_EN=rs.getDate(6);
                ABONO=rs.getInt(7);
                TOTAL=rs.getInt(8);
                ESTADO=rs.getString(9).trim();
                FALLA=rs.getString(10).trim();
                DESCRIP_OBSER=rs.getString(11).trim();
                DIAGNO=rs.getString(12).trim();                
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Orden " + ex.getMessage());
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
    public DefaultComboBoxModel buscarOrdenesImei(){
        DefaultComboBoxModel ORDENES = new DefaultComboBoxModel();
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        ORDENES.addElement("Seleccione un Codigo de Orden");
        try
        {
            String sql = "SELECT O.IMEI, E.MARCA, O.NUM_ORDEN " +
                         "FROM ORDEN_TRABAJO O INNER JOIN EQUIPO E ON O.IMEI = E.IMEI " +
                         "WHERE O.SERIE = ? AND O.IMEI = ? " +
                         "ORDER BY FECHA_ING DESC";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, SERIE);
            cmd.setString(2, IMEI);
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                ORDENES.addElement(rs.getString(1).substring(0, 3)+"-"+rs.getString(2).substring(0, 1)+"-"+rs.getInt(3));
            }
            if(ORDENES.getSize()==1){ORDENES.removeAllElements(); JOptionPane.showMessageDialog(null, "(ORDEN) La Orden no ha sido encontrada en la base de datos");}
        }
        catch(SQLException | HeadlessException ex)
        {
            System.out.println("Error: Orden " + ex.getMessage());
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
        return ORDENES;
    }
    public boolean eliminarOrden(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "DELETE FROM ORDEN_TRABAJO WHERE NUM_ORDEN = ? AND SUBSTRING(IMEI,1,3)= ?";
            cmd = cn.prepareStatement(sql);
            cmd.setInt(1, NUM_ORDEN);
            cmd.setString(2, IMEI.substring(0, 3));
            if(cmd.executeUpdate()>=1)
            {
                verifica = true;
            }
        }
        catch(Exception ex)
        {
          JOptionPane.showMessageDialog(null, "(ORDEN) No se pudo Eliminar debido a un error en el codigo ingresado");
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
    public boolean modificarOrdenA(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "UPDATE ORDEN_TRABAJO SET RUT_P = ?, FECHA_ENT = ?, "
                    + "ABONO = ?, TOTAL = ?, DESCRIP_OBSER = ?, DIAGNOSTICO = ?, "
                    + "ESTADO = ?, FALLA = ? WHERE NUM_ORDEN = ? AND SUBSTRING(IMEI,1,3)= ?";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, RUT_P);
            cmd.setDate(2, OPAlter.convertirUtilASQL(FECHA_EN));
            cmd.setInt(3, ABONO);
            cmd.setInt(4, TOTAL);
            cmd.setString(5, DESCRIP_OBSER);
            cmd.setString(6, DIAGNO);
            cmd.setString(7, ESTADO);
            cmd.setString(8, FALLA);
            cmd.setInt(9, NUM_ORDEN);
            cmd.setString(10, IMEI.substring(0, 3));
            if(cmd.executeUpdate()>=1)
            {
                verifica = true;
            }
        }
        catch(Exception ex)
        {
          JOptionPane.showMessageDialog(null, "(ORDEN) No se pudo modificar debido a un error en los datos ingresados");
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
    public DefaultTableModel tablaOrdenesTecnico(DefaultTableModel modelo){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        modelo.setRowCount(0);
        try
        {
            String sql = "SELECT SUBSTRING(O.IMEI,1,3), SUBSTRING(E.MARCA,1,1), O.NUM_ORDEN, E.MARCA, E.MODELO, O.FALLA, O.FECHA_ENT, O.ESTADO " +
                            "FROM ORDEN_TRABAJO O INNER JOIN EQUIPO E ON O.IMEI = E.IMEI " +
                            "WHERE RUT_P = ? " +
                            "AND O.ESTADO <> 'Entregado' ORDER BY O.FECHA_ENT";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, Personal.getRUT_P());
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                modelo.addRow(new Object []{
                    rs.getString(1)+"-"+rs.getString(2)+"-"+String.valueOf(rs.getInt(3)), 
                    rs.getString(4).trim(),
                    rs.getString(5).trim(),
                    rs.getString(6).trim(),
                    df.format(rs.getDate(7)),
                    rs.getString(8).trim(),
                    String.valueOf(OPAlter.diferenciaFechas(df.format(new Date()), df.format(rs.getDate(7))))});
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Orden " + ex.getMessage());
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
        return modelo;
    }
    public DefaultTableModel tablaOrdenesAdministrador(DefaultTableModel modelo){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        modelo.setRowCount(0);
        try
        {
            String sql = "SELECT O.NUM_ORDEN, O.IMEI, P.NOMBRE, E.MARCA, E.MODELO, O.FALLA, O.FECHA_ING, O.FECHA_ENT, O.ESTADO " +
                            "FROM ORDEN_TRABAJO O INNER JOIN EQUIPO E ON O.IMEI = E.IMEI " +
                            "INNER JOIN PERSONAL P ON O.RUT_P = P.RUT_P " +
                            "WHERE O.COD_TIENDA = ? " +
                            "AND O.ESTADO <> 'Entregado' ORDER BY P.NOMBRE, O.FALLA";
            cmd = cn.prepareStatement(sql);
            cmd.setInt(1, Personal.getCODTIENDA());
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                modelo.addRow(new Object []{rs.getString(2).substring(0, 3)+"-"+rs.getString(4).substring(0, 1)+"-"+String.valueOf(rs.getInt(1)), 
                rs.getString(3).trim(), 
                rs.getString(4).trim(),
                rs.getString(5).trim(),
                rs.getString(6).trim(),
                df.format(rs.getDate(7)),
                df.format(rs.getDate(8)),
                rs.getString(9).trim(),
                String.valueOf(OPAlter.diferenciaFechas(df.format(new Date()), df.format(rs.getDate(8))))});
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Orden " + ex.getMessage());
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
        return modelo;
    }
    
    
    public DefaultTableModel tablaRepuestos(DefaultTableModel modelo, Integer CodOrden){
        cn = ConexionBD.conectar();
        modelo.setRowCount(0);
        PreparedStatement cmd = null;
        try
        {
            String sql = "SELECT NUM_ORDEN, REPUESTO, ESTADO FROM REPUESTO WHERE NUM_ORDEN = ?";
            cmd = cn.prepareStatement(sql);
            cmd.setInt(1, CodOrden);
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                modelo.addRow(new Object []{rs.getInt(1), rs.getString(2).trim(), rs.getBoolean(3)});
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Orden " + ex.getMessage());
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
        return modelo;
    }
    public DefaultTableModel tablaRepuestos2(DefaultTableModel modelo, Integer CodOrden){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        try
        {
            String sql = "SELECT (SUBSTRING(O.IMEI,1,3)+'-'+SUBSTRING(E.MARCA,1,1)+'-'+CAST(O.NUM_ORDEN AS VARCHAR(MAX))) AS CODIGO, O.NUM_ORDEN, R.REPUESTO,  R.ESTADO \n" +
                            "FROM REPUESTO R INNER JOIN ORDEN_TRABAJO O ON R.NUM_ORDEN = O.NUM_ORDEN\n" +
                            "INNER JOIN EQUIPO E ON O.IMEI = E.IMEI\n" +
                            "WHERE O.ESTADO <> 'Entregado' AND O.NUM_ORDEN=?";
            cmd = cn.prepareStatement(sql);
            cmd.setInt(1, CodOrden);
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                    modelo.addRow(new Object []{rs.getString(1).trim(), rs.getInt(2), rs.getString(3).trim(), rs.getBoolean(4)});   
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Orden " + ex.getMessage());
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
        return modelo;
    }
    
    
    
    public boolean IngresaRepuesto(DefaultTableModel modelo){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica=false;
        try{
            String sql = "INSERT INTO REPUESTO (NUM_ORDEN, REPUESTO, ESTADO) VALUES (?, ?, ?)";
            cmd = cn.prepareStatement(sql);
            for(int i=0;i<modelo.getRowCount();i++){
                if(!String.valueOf(modelo.getValueAt(i, 0)).trim().isEmpty()){
                    cmd.setInt(1, ((Integer)modelo.getValueAt(i, modelo.getColumnCount()-3)));
                    cmd.setString(2, String.valueOf(modelo.getValueAt(i, modelo.getColumnCount()-2)));
                    cmd.setBoolean(3, (boolean)modelo.getValueAt(i, modelo.getColumnCount()-1));
                    cmd.addBatch();
                }
            }
            cmd.executeBatch();
            verifica = true;
        }catch(Exception e){
            System.out.println("Error: Orden " + e.getMessage());
            verifica = false;
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
    public void EliminaRepuesto(Integer CodOrden){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        try{
            String sql = "DELETE FROM REPUESTO WHERE NUM_ORDEN = ?";
            cmd = cn.prepareStatement(sql);
            cmd.setInt(1, CodOrden);
            cmd.executeUpdate();
        }catch(Exception e){
            System.out.println("Error: Orden " + e.getMessage());
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
    }
    
    
    public boolean buscadatoentabla(DefaultTableModel modelo, Integer valor){
        boolean verifica = true;
        for(int i=0; i<modelo.getRowCount();i++){
            if(modelo.getValueAt(i, 1)==valor){verifica=false;}
        }
        return verifica;
    }
}