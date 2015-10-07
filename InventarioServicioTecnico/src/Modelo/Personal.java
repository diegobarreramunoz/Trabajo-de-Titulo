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
public class Personal {
    //<editor-fold defaultstate="collapsed" desc="DECLARACION DE VARIABLES">
    private ConexionBD ConexionBD = new ConexionBD();
    private Connection cn;
    private static String RUT_P;
    private static String NOMBRE_P;
    private static Integer TELEFONO;
    private static String CONTRASENA;
    private static String PERMISO;
    private static String AYUDACONTRASENA;
    private static String COLORES;
    private static String TITULO;
    private static Integer CODTIENDA;
    private String MRUT_P;
    private String MNOMBRE_P;
    private Integer MTELEFONO;
    private String MCONTRASENA;
    private String MPERMISO;
    private String MAYUDACONTRASENA;
    private String MCOLORES;
    private String MTITULO;
    private Integer MCODTIENDA;
    private DefaultComboBoxModel listmodelnombre = new DefaultComboBoxModel();
    private DefaultComboBoxModel listmodelrut = new DefaultComboBoxModel();
    private DefaultComboBoxModel listmodelcantidad = new DefaultComboBoxModel();
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">
    public Personal() {
        MRUT_P=null;
        MNOMBRE_P=null;
        MTELEFONO=null;
        MCONTRASENA=null;
        MPERMISO=null;
        MAYUDACONTRASENA=null;
        MCOLORES=null;
        MTITULO=null;
        MCODTIENDA=null;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="METODOS GETTER & SETTER">
    public static String getRUT_P() {
        return RUT_P;
    }
    public static void setRUT_P(String RUT_P) {
        Personal.RUT_P = RUT_P;
    }
    public static String getNOMBRE_P() {
        return NOMBRE_P;
    }
    public static void setNOMBRE_P(String NOMBRE_P) {
        Personal.NOMBRE_P = NOMBRE_P;
    }
    public static String getCONTRASENA() {
        return CONTRASENA;
    }
    public static void setCONTRASENA(String CONTRASENA) {
        Personal.CONTRASENA = CONTRASENA;
    }
    public static String getPERMISO() {
        return PERMISO;
    }
    public static void setPERMISO(String PERMISO) {
        Personal.PERMISO = PERMISO;
    }
    public static String getAYUDACONTRASENA() {
        return AYUDACONTRASENA;
    }
    public static void setAYUDACONTRASENA(String AYUDACONTRASENA) {
        Personal.AYUDACONTRASENA = AYUDACONTRASENA;
    }
    public static String getCOLORES() {
        return COLORES;
    }
    public static void setCOLORES(String COLORES) {
        Personal.COLORES = COLORES;
    }
    public static String getTITULO() {
        return TITULO;
    }
    public static void setTITULO(String TITULO) {
        Personal.TITULO = TITULO;
    }
    public static Integer getCODTIENDA() {
        return CODTIENDA;
    }
    public static void setCODTIENDA(Integer CODTIENDA) {
        Personal.CODTIENDA = CODTIENDA;
    }
    public static Integer getTELEFONO() {
        return TELEFONO;
    }
    public static void setTELEFONO(Integer TELEFONO) {
        Personal.TELEFONO = TELEFONO;
    }
    
    public String getMRUT_P() {
        return MRUT_P;
    }
    public void setMRUT_P(String MRUT_P) {
        this.MRUT_P = MRUT_P;
    }
    public String getMNOMBRE_P() {
        return MNOMBRE_P;
    }
    public void setMNOMBRE_P(String MNOMBRE_P) {
        this.MNOMBRE_P = MNOMBRE_P;
    }
    public String getMCONTRASENA() {
        return MCONTRASENA;
    }
    public void setMCONTRASENA(String MCONTRASENA) {
        this.MCONTRASENA = MCONTRASENA;
    }
    public String getMPERMISO() {
        return MPERMISO;
    }
    public void setMPERMISO(String MPERMISO) {
        this.MPERMISO = MPERMISO;
    }
    public String getMAYUDACONTRASENA() {
        return MAYUDACONTRASENA;
    }
    public void setMAYUDACONTRASENA(String MAYUDACONTRASENA) {
        this.MAYUDACONTRASENA = MAYUDACONTRASENA;
    }
    public String getMCOLORES() {
        return MCOLORES;
    }
    public void setMCOLORES(String MCOLORES) {
        this.MCOLORES = MCOLORES;
    }
    public String getMTITULO() {
        return MTITULO;
    }
    public void setMTITULO(String MTITULO) {
        this.MTITULO = MTITULO;
    }
    public Integer getMCODTIENDA() {
        return MCODTIENDA;
    }
    public void setMCODTIENDA(Integer MCODTIENDA) {
        this.MCODTIENDA = MCODTIENDA;
    }
    public Integer getMTELEFONO() {
        return MTELEFONO;
    }
    public void setMTELEFONO(Integer MTELEFONO) {
        this.MTELEFONO = MTELEFONO;
    }
    public DefaultComboBoxModel getListmodelrut() {
        return listmodelrut;
    }

    public DefaultComboBoxModel getListmodelcantidad() {
        return listmodelcantidad;
    }
    //</editor-fold>

    public boolean validaEntrada(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "SELECT PERMISO, COLORES, TITULO, COD_TIENDA, NOMBRE, TELEFONO, AYUDACONTRASENA FROM PERSONAL WHERE RUT_P = ? AND CONTRASENA = ?";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, RUT_P);
            cmd.setString(2, CONTRASENA);
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                verifica = true;
                Personal.PERMISO=rs.getString(1).trim();
                Personal.CODTIENDA=rs.getInt(4);
                try{Personal.NOMBRE_P=rs.getString(5).trim();}catch(Exception e){NOMBRE_P="";}
                try{Personal.TELEFONO=rs.getInt(6);}catch(Exception e){TELEFONO=null;}
                try{Personal.AYUDACONTRASENA=rs.getString(7).trim();}catch(Exception e){AYUDACONTRASENA="";}
                try{Personal.TITULO=rs.getString(3).trim();}catch(Exception e){TITULO=null;}
                try{Personal.COLORES=rs.getString(2).trim();}catch(Exception e){COLORES=null;}
            }           
        }
        catch(Exception ex){System.out.println("Error: Personal validaEntrada " + ex.getMessage());}
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
    public boolean ayudaContraseña(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "SELECT AYUDACONTRASENA FROM PERSONAL WHERE RUT_P = ?";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, getRUT_P());
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                verifica = true;
                Personal.AYUDACONTRASENA=rs.getString(1);
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Personal " + ex.getMessage());
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
    public DefaultComboBoxModel comboPersonalROOT(int largo){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        listmodelnombre.removeAllElements();
        listmodelrut.removeAllElements();
        listmodelcantidad.removeAllElements();
        listmodelnombre.addElement("Seleccionar un Tecnico");
        listmodelrut.addElement("");
        listmodelcantidad.addElement(0);
        try
        {
            String sql = "SELECT (SELECT COUNT(*) FROM ORDEN_TRABAJO WHERE ORDEN_TRABAJO.RUT_P = PERSONAL.RUT_P), RUT_P, NOMBRE "+
                         "FROM PERSONAL WHERE RUT_P <> '00000000-0' "+
                         "GROUP BY RUT_P, NOMBRE";
            cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                listmodelcantidad.addElement(rs.getInt(1));
                listmodelrut.addElement(rs.getString(2));
                listmodelnombre.addElement(rs.getString(3).substring(0, largo));
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Personal comboPersonal " + ex.getMessage());
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
        return listmodelnombre;
    }
    public DefaultComboBoxModel comboTecnicosMiTienda(int largo){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        listmodelnombre.removeAllElements();
        listmodelrut.removeAllElements();
        listmodelcantidad.removeAllElements();
        listmodelnombre.addElement("Seleccionar un Tecnico");
        listmodelrut.addElement("");
        listmodelcantidad.addElement(0);
        try
        {
            String sql ="SELECT " +
                        "(SELECT COUNT(*) " +
                        "FROM ORDEN_TRABAJO O " +
                        "WHERE O.RUT_P = P.RUT_P " +
                        "AND (O.ESTADO='Ingresado' OR O.ESTADO='Procesando')), " +
                        "P.RUT_P, " +
                        "P.NOMBRE " +
                        "FROM PERSONAL P " +
                        "WHERE P.PERMISO = 'T' AND P.COD_TIENDA = ? " +
                        "GROUP BY P.RUT_P, P.NOMBRE";
            cmd = cn.prepareStatement(sql);
            cmd.setInt(1, CODTIENDA);
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                listmodelcantidad.addElement(rs.getInt(1));
                listmodelrut.addElement(rs.getString(2).trim());
                listmodelnombre.addElement(rs.getString(3).substring(0, largo));
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Personal comboTecnicosMiTienda " + ex.getMessage());
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
        return listmodelnombre;
    }
    public boolean crearPersonal(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try{
            String sql = "INSERT INTO PERSONAL(RUT_P, COD_TIENDA, NOMBRE, CONTRASENA, TELEFONO, PERMISO, AYUDACONTRASENA) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?)";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, MRUT_P);
            cmd.setInt(2, MCODTIENDA);
            cmd.setString(3, MNOMBRE_P);
            cmd.setString(4, MCONTRASENA);
            cmd.setInt(5, MTELEFONO);
            cmd.setString(6, MPERMISO);
            cmd.setString(7, MAYUDACONTRASENA);
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
    public boolean modificarMisDatos(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        { 
            String sql = "UPDATE PERSONAL SET NOMBRE = ?, TELEFONO=?, COD_TIENDA=?, CONTRASENA = ?, "
                    + "PERMISO = ?, AYUDACONTRASENA = ? WHERE RUT_P = ?";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, MNOMBRE_P);
            cmd.setInt(2, MTELEFONO);
            cmd.setInt(3, MCODTIENDA);//
            cmd.setString(4, MCONTRASENA);
            cmd.setString(5, MPERMISO);//
            cmd.setString(6, MAYUDACONTRASENA);
            cmd.setString(7, MRUT_P);
            if(cmd.executeUpdate()>=1)
            {
                verifica = true;
                NOMBRE_P=MNOMBRE_P;
                TELEFONO=MTELEFONO;
                CODTIENDA=MCODTIENDA;
                CONTRASENA=MCONTRASENA;
                PERMISO=MPERMISO;
                AYUDACONTRASENA=MAYUDACONTRASENA;
            }
        }
        catch(Exception ex)
        {
          System.out.println("Error: Personal " + ex.getMessage());
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
    public boolean modificarPersonalAT(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "UPDATE PERSONAL SET NOMBRE=?, TELEFONO=?, COD_TIENDA=?, CONTRASENA=?, "
                    + "AYUDACONTRASENA=?, PERMISO=? WHERE RUT_P = ?";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, MNOMBRE_P);
            cmd.setInt(2, MTELEFONO);
            cmd.setInt(3, MCODTIENDA);
            cmd.setString(4, MCONTRASENA);
            cmd.setString(5, MAYUDACONTRASENA);
            cmd.setString(6, MPERMISO);
            cmd.setString(7, MRUT_P);
            if(cmd.executeUpdate()>=1)
            {
                verifica = true;
            }
        }
        catch(Exception ex)
        {
          System.out.println("Error: Personal " + ex.getMessage());
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
    public boolean buscarPersonal(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "SELECT NOMBRE, TELEFONO, COD_TIENDA, CONTRASENA, AYUDACONTRASENA, PERMISO FROM PERSONAL WHERE RUT_P=?";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, MRUT_P);
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                verifica = true;
                MNOMBRE_P = rs.getString(1).trim();
                MTELEFONO=rs.getInt(2);
                MCODTIENDA= rs.getInt(3);
                MCONTRASENA=rs.getString(4).trim();
                MAYUDACONTRASENA = rs.getString(5).trim();
                MPERMISO = rs.getString(6).trim();
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: Personal " + ex.getMessage());
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
    public boolean modificarConfiguracion(){
        cn = ConexionBD.conectar();
        PreparedStatement cmd = null;
        boolean verifica = false;
        try
        {
            String sql = "UPDATE PERSONAL SET COLORES = ?, TITULO = ? WHERE RUT_P = ?";
            cmd = cn.prepareStatement(sql);
            cmd.setString(1, COLORES);
            cmd.setString(2, TITULO);
            cmd.setString(3, RUT_P);
            if(cmd.executeUpdate()>=1)
            {
                verifica = true;
            }
        }
        catch(Exception ex)
        {
          System.out.println("Error: Personal " + ex.getMessage());
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
    public boolean primeruso(){
    cn = ConexionBD.conectar();
    PreparedStatement cmd = null;
    boolean com=false;
       try
            {
                String sql = "SELECT (SELECT COUNT(*) FROM PERSONAL), RUT_P, CONTRASENA FROM PERSONAL";
                cmd = cn.prepareStatement(sql);
                ResultSet rs = cmd.executeQuery();
                rs.next();
                if(rs.getInt(1)==1 && "00000000-0".equals(rs.getString(2).trim()) && "root".equals(rs.getString(3).trim()))
                {
                    com=true;
                }
            }
            catch(Exception ex){com=false;}
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
   return com;
   }
}
