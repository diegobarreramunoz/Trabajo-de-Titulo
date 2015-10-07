/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Diego
 */
public class Ireport{
    private ConexionBD ConexionBD = new ConexionBD();
    private Connection cn;
    private static final String pathf="src/Vista/ireport/";
    public Ireport() {
        
    }
    public JasperViewer crearOrden(){
        cn=ConexionBD.conectar();
        OrdenDeTrabajo Ordendetrabajo = new OrdenDeTrabajo();
        String path = pathf+"OrdendetrabajoEntrega.jasper";
        JasperViewer jv=null;
    try {
        Map parametro = new HashMap();
        parametro.put("num_orden", Ordendetrabajo.buscarUltimaOrden(Personal.getCODTIENDA()));
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
        jv = new JasperViewer(jp,false);
        jv.setTitle("Nueva Orden");
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    }
    finally{
            try{
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
            }
    }
    return jv;
    }
    public JasperViewer verOrden(Integer num){
        cn=ConexionBD.conectar();
        String path = pathf+"OrdendetrabajoEntrega.jasper";
        JasperViewer jv=null;
    try {
        Map parametro = new HashMap();
        parametro.put("num_orden", num);
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
        jv = new JasperViewer(jp,false);
        jv.setTitle("Ver Orden");
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    }finally{
            try{
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
            }
    }
    return jv;
    }
    public JasperViewer peticionRepuestos(String ESTADO1, String ESTADO2, String ESTADO3, String ESTADO4, String FECHAINI1, String FECHAFIN1, String FECHAINI2, String FECHAFIN2, String FECHA, Integer MI_COD_TIENDA, String COD_TIENDA, boolean REPUESTO_ESTADO_1, boolean REPUESTO_ESTADO_2){
        cn=ConexionBD.conectar();
        String path = pathf+"InformeRepuestos.jasper";
        JasperViewer jv=null;
    try {
        Map parametro = new HashMap();
        parametro.put("ESTADO1", ESTADO1);
        parametro.put("ESTADO2", ESTADO2);
        parametro.put("ESTADO3", ESTADO3);
        parametro.put("ESTADO4", ESTADO4);
        parametro.put("FECHAINI1", FECHAINI1);
        parametro.put("FECHAFIN1", FECHAFIN1);
        parametro.put("FECHAINI2", FECHAINI2);
        parametro.put("FECHAFIN2", FECHAFIN2);
        parametro.put("FECHA", FECHA);
        parametro.put("MI_COD_TIENDA", MI_COD_TIENDA);
        parametro.put("COD_TIENDA", COD_TIENDA);
        parametro.put("REPUESTO_ESTADO_1", REPUESTO_ESTADO_1);
        parametro.put("REPUESTO_ESTADO_2", REPUESTO_ESTADO_2);
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
        jv = new JasperViewer(jp,false);
        jv.setTitle("Peticion Repuestos");
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    }finally{
            try{
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
            }
    }
    return jv;
    }
    public JasperViewer informeClientes(String FALLA1, String FALLA2, String FALLA3, String FALLA4, String FALLA5, String FALLA6, String FALLA7, String ESTADO1, String ESTADO2, String ESTADO3, String ESTADO4, String FECHAINI1, String FECHAFIN1, String FECHAINI2, String FECHAFIN2, String COD_TIENDA, String FECHA, String RUT_C, Integer MI_COD_TIENDA){
        cn=ConexionBD.conectar();
        String path = pathf+"InformeClientes.jasper";
        JasperViewer jv=null;
    try {
        Map parametro = new HashMap();
        parametro.put("FALLA1", FALLA1);
        parametro.put("FALLA2", FALLA2);
        parametro.put("FALLA3", FALLA3);
        parametro.put("FALLA4", FALLA4);
        parametro.put("FALLA5", FALLA5);
        parametro.put("FALLA6", FALLA6);
        parametro.put("FALLA7", FALLA7);
        parametro.put("ESTADO1", ESTADO1);
        parametro.put("ESTADO2", ESTADO2);
        parametro.put("ESTADO3", ESTADO3);
        parametro.put("ESTADO4", ESTADO4);
        parametro.put("FECHAINI1", FECHAINI1);
        parametro.put("FECHAFIN1", FECHAFIN1);
        parametro.put("FECHAINI2", FECHAINI2);
        parametro.put("FECHAFIN2", FECHAFIN2);
        parametro.put("COD_TIENDA", COD_TIENDA);
        parametro.put("FECHA", FECHA);
        parametro.put("RUT_C", RUT_C);
        parametro.put("MI_COD_TIENDA", MI_COD_TIENDA);
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
        jv = new JasperViewer(jp,false);
        jv.setTitle("Informe Cliente");
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    }finally{
            try{
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
            }
    }
    return jv;
    }
    public JasperViewer informePersonal(String FALLA1, String FALLA2, String FALLA3, String FALLA4, String FALLA5, String FALLA6, String FALLA7, String ESTADO1, String ESTADO2, String ESTADO3, String ESTADO4, String FECHAINI1, String FECHAFIN1, String FECHAINI2, String FECHAFIN2, String COD_TIENDA, String FECHA, String RUT_P){
        cn=ConexionBD.conectar();
        String path = pathf+"InformePersonal.jasper";
        JasperViewer jv=null;
    try {
        Map parametro = new HashMap();
        parametro.put("FALLA1", FALLA1);
        parametro.put("FALLA2", FALLA2);
        parametro.put("FALLA3", FALLA3);
        parametro.put("FALLA4", FALLA4);
        parametro.put("FALLA5", FALLA5);
        parametro.put("FALLA6", FALLA6);
        parametro.put("FALLA7", FALLA7);
        parametro.put("ESTADO1", ESTADO1);
        parametro.put("ESTADO2", ESTADO2);
        parametro.put("ESTADO3", ESTADO3);
        parametro.put("ESTADO4", ESTADO4);
        parametro.put("FECHAINI1", FECHAINI1);
        parametro.put("FECHAFIN1", FECHAFIN1);
        parametro.put("FECHAINI2", FECHAINI2);
        parametro.put("FECHAFIN2", FECHAFIN2);
        parametro.put("COD_TIENDA", COD_TIENDA);
        parametro.put("FECHA", FECHA);
        parametro.put("RUT_P", RUT_P);
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
        jv = new JasperViewer(jp,false);
        jv.setTitle("Informe Personal");
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    }finally{
            try{
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
            }
    }
    return jv;
    }
    public JasperViewer informeTienda(String codtienda, String fechaini, String fechaterm){
        cn=ConexionBD.conectar();
        String path = pathf+"InformeTienda.jasper";
        JasperViewer jv=null;
    try {
        Map parametro = new HashMap();
        parametro.put("COD_TIENDA", codtienda);
        parametro.put("FECHA_INICIO", fechaini);
        parametro.put("FECHA_TERMINO", fechaterm);
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
        jv = new JasperViewer(jp,false);
        jv.setTitle("Informe Tienda");
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    }finally{
            try{
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
            }
    }
    return jv;
    }
    public JasperViewer informeEquipo(String codtienda, String fechaini, String fechaterm){
        cn=ConexionBD.conectar();
        String path = pathf+"InformeEquipo.jasper";
        JasperViewer jv=null;
    try {
        Map parametro = new HashMap();
        parametro.put("COD_TIENDA", codtienda);
        parametro.put("FECHA_INICIO", fechaini);
        parametro.put("FECHA_TERMINO", fechaterm);
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
        jv = new JasperViewer(jp,false);
        jv.setTitle("Informe Equipos");
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    }finally{
            try{
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
            }
    }
    return jv;
    }
    public JasperViewer informeTienda_Cliente(String FALLA1, String FALLA2, String FALLA3, String FALLA4, String FALLA5, String FALLA6, String FALLA7, String ESTADO1, String ESTADO2, String ESTADO3, String ESTADO4, String FECHAINI1, String FECHAFIN1, String FECHAINI2, String FECHAFIN2, Integer COD_TIENDA, String FECHA, Integer CANTIDAD){
        cn=ConexionBD.conectar();
        String path = pathf+"InformeTienda_Clientes.jasper";
        JasperViewer jv=null;
    try {
        Map parametro = new HashMap();
        parametro.put("FALLA1", FALLA1);
        parametro.put("FALLA2", FALLA2);
        parametro.put("FALLA3", FALLA3);
        parametro.put("FALLA4", FALLA4);
        parametro.put("FALLA5", FALLA5);
        parametro.put("FALLA6", FALLA6);
        parametro.put("FALLA7", FALLA7);
        parametro.put("ESTADO1", ESTADO1);
        parametro.put("ESTADO2", ESTADO2);
        parametro.put("ESTADO3", ESTADO3);
        parametro.put("ESTADO4", ESTADO4);
        parametro.put("FECHAINI1", FECHAINI1);
        parametro.put("FECHAFIN1", FECHAFIN1);
        parametro.put("FECHAINI2", FECHAINI2);
        parametro.put("FECHAFIN2", FECHAFIN2);
        parametro.put("COD_TIENDA", COD_TIENDA);
        parametro.put("FECHA", FECHA);
        parametro.put("CANTIDAD", CANTIDAD);
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
        jv = new JasperViewer(jp,false);
        jv.setTitle("Informe Tienda Clientes");
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    }finally{
            try{
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
            }
    }
    return jv;
    }
    public JasperViewer informeTienda_Personal(String FALLA1, String FALLA2, String FALLA3, String FALLA4, String FALLA5, String FALLA6, String FALLA7, String ESTADO1, String ESTADO2, String ESTADO3, String ESTADO4, String FECHAINI1, String FECHAFIN1, String FECHAINI2, String FECHAFIN2, Integer COD_TIENDA, String FECHA, Integer CANTIDAD){
        cn=ConexionBD.conectar();
        String path = pathf+"InformeTienda_Personal.jasper";
        JasperViewer jv=null;
    try {
        Map parametro = new HashMap();
        parametro.put("FALLA1", FALLA1);
        parametro.put("FALLA2", FALLA2);
        parametro.put("FALLA3", FALLA3);
        parametro.put("FALLA4", FALLA4);
        parametro.put("FALLA5", FALLA5);
        parametro.put("FALLA6", FALLA6);
        parametro.put("FALLA7", FALLA7);
        parametro.put("ESTADO1", ESTADO1);
        parametro.put("ESTADO2", ESTADO2);
        parametro.put("ESTADO3", ESTADO3);
        parametro.put("ESTADO4", ESTADO4);
        parametro.put("FECHAINI1", FECHAINI1);
        parametro.put("FECHAFIN1", FECHAFIN1);
        parametro.put("FECHAINI2", FECHAINI2);
        parametro.put("FECHAFIN2", FECHAFIN2);
        parametro.put("COD_TIENDA", COD_TIENDA);
        parametro.put("FECHA", FECHA);
        parametro.put("CANTIDAD", CANTIDAD);
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
        jv = new JasperViewer(jp,false);
        jv.setTitle("Informe Tienda Personal");
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    }finally{
            try{
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
            }
    }
    return jv;
    }
    public JasperViewer informeTienda_Marca(String FALLA1, String FALLA2, String FALLA3, String FALLA4, String FALLA5, String FALLA6, String FALLA7, String ESTADO1, String ESTADO2, String ESTADO3, String ESTADO4, String FECHAINI1, String FECHAFIN1, String FECHAINI2, String FECHAFIN2, Integer COD_TIENDA, String FECHA, Integer CANTIDAD){
        cn=ConexionBD.conectar();
        String path = pathf+"InformeTienda_Marca.jasper";
        JasperViewer jv=null;
    try {
        Map parametro = new HashMap();
        parametro.put("FALLA1", FALLA1);
        parametro.put("FALLA2", FALLA2);
        parametro.put("FALLA3", FALLA3);
        parametro.put("FALLA4", FALLA4);
        parametro.put("FALLA5", FALLA5);
        parametro.put("FALLA6", FALLA6);
        parametro.put("FALLA7", FALLA7);
        parametro.put("ESTADO1", ESTADO1);
        parametro.put("ESTADO2", ESTADO2);
        parametro.put("ESTADO3", ESTADO3);
        parametro.put("ESTADO4", ESTADO4);
        parametro.put("FECHAINI1", FECHAINI1);
        parametro.put("FECHAFIN1", FECHAFIN1);
        parametro.put("FECHAINI2", FECHAINI2);
        parametro.put("FECHAFIN2", FECHAFIN2);
        parametro.put("COD_TIENDA", COD_TIENDA);
        parametro.put("FECHA", FECHA);
        parametro.put("CANTIDAD", CANTIDAD);
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
        jv = new JasperViewer(jp,false);
        jv.setTitle("Informe Tienda Equipos Marca");
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    }finally{
            try{
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
            }
    }
    return jv;
    }
    public JasperViewer informeTienda_Modelo(String FALLA1, String FALLA2, String FALLA3, String FALLA4, String FALLA5, String FALLA6, String FALLA7, String ESTADO1, String ESTADO2, String ESTADO3, String ESTADO4, String FECHAINI1, String FECHAFIN1, String FECHAINI2, String FECHAFIN2, Integer COD_TIENDA, String FECHA, Integer CANTIDAD){
        cn=ConexionBD.conectar();
        String path = pathf+"InformeTienda_Modelo.jasper";
        JasperViewer jv=null;
    try {
        Map parametro = new HashMap();
        parametro.put("FALLA1", FALLA1);
        parametro.put("FALLA2", FALLA2);
        parametro.put("FALLA3", FALLA3);
        parametro.put("FALLA4", FALLA4);
        parametro.put("FALLA5", FALLA5);
        parametro.put("FALLA6", FALLA6);
        parametro.put("FALLA7", FALLA7);
        parametro.put("ESTADO1", ESTADO1);
        parametro.put("ESTADO2", ESTADO2);
        parametro.put("ESTADO3", ESTADO3);
        parametro.put("ESTADO4", ESTADO4);
        parametro.put("FECHAINI1", FECHAINI1);
        parametro.put("FECHAFIN1", FECHAFIN1);
        parametro.put("FECHAINI2", FECHAINI2);
        parametro.put("FECHAFIN2", FECHAFIN2);
        parametro.put("COD_TIENDA", COD_TIENDA);
        parametro.put("FECHA", FECHA);
        parametro.put("CANTIDAD", CANTIDAD);
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
        jv = new JasperViewer(jp,false);
        jv.setTitle("Informe Tienda Equipos Modelo");
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    }finally{
            try{
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
            }
    }
    return jv;
    }
    public JasperViewer informeTienda_Todos(String FALLA1, String FALLA2, String FALLA3, String FALLA4, String FALLA5, String FALLA6, String FALLA7, String ESTADO1, String ESTADO2, String ESTADO3, String ESTADO4, String FECHAINI1, String FECHAFIN1, String FECHAINI2, String FECHAFIN2, Integer COD_TIENDA, String FECHA, Integer CANTIDAD){
        cn=ConexionBD.conectar();
        String path = pathf+"InformeTienda_Todos.jasper";
        JasperViewer jv=null;
    try {
        Map parametro = new HashMap();
        parametro.put("FALLA1", FALLA1);
        parametro.put("FALLA2", FALLA2);
        parametro.put("FALLA3", FALLA3);
        parametro.put("FALLA4", FALLA4);
        parametro.put("FALLA5", FALLA5);
        parametro.put("FALLA6", FALLA6);
        parametro.put("FALLA7", FALLA7);
        parametro.put("ESTADO1", ESTADO1);
        parametro.put("ESTADO2", ESTADO2);
        parametro.put("ESTADO3", ESTADO3);
        parametro.put("ESTADO4", ESTADO4);
        parametro.put("FECHAINI1", FECHAINI1);
        parametro.put("FECHAFIN1", FECHAFIN1);
        parametro.put("FECHAINI2", FECHAINI2);
        parametro.put("FECHAFIN2", FECHAFIN2);
        parametro.put("COD_TIENDA", COD_TIENDA);
        parametro.put("FECHA", FECHA);
        parametro.put("CANTIDAD", CANTIDAD);
        JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
        jv = new JasperViewer(jp,false);
        jv.setTitle("Informe Tienda Equipos Todos");
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No se puede Mostrar el Informe \n Causas:\n"+ex.getMessage());
    }finally{
            try{
                if(cn!=null){
                    cn.close();
                }}
                catch(SQLException e){
                    System.out.print(e);
            }
    }
    return jv;
    }
}
