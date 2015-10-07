/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Diego
 */
public class OPAlter {
    
    public static boolean validarut(String ruti, String dvi){
    try{
    int rut = Integer.parseInt(ruti), m=0, s=1;;
    char dv = dvi.toUpperCase().charAt(0);
    for (;rut!=0;rut/=10){s=(s+rut%10*(9-m++%6))%11;}
    return dv == (char) (s!=0?s+47:75);}
    catch(Exception e){return false;}
    }
    
    public static boolean validaimei(String imei){
        //metodo validacion imei mediante algoritmo de luhn o modulo 10
        //generacion de variables
        boolean valida;
        char[] imeichar = imei.toCharArray();
        Integer suma=0;
        //recorre array
        for(int i=0;i<imeichar.length-1;i++){
            try{
                //convierte caracter en entero
                Integer digito = Integer.parseInt(String.valueOf(imeichar[i]));
                //valida si el puntero es par o inpar
                if(i%2!=0){
                    //si es par multiplica el digito por 2 y si el producto es de 2 cifras las separa y las adiciona para agregarlas a la suma
                    digito=digito*2;
                    if(digito.toString().length()>1){
                        suma=suma+(Integer.parseInt(digito.toString().substring(0, 1))+Integer.parseInt(digito.toString().substring(1, 2)));
                    }else{suma=suma+digito;}
                }
                //si es impar solo adiciona el digito a la suma
                else{suma=suma+digito;}
            }
            //si se ingresa un dato que no es numerico captura la excepción y retorna booleano de tipo falso
            catch(Exception e){
                valida=false; 
                break;
            }
        }
        //a 10 se le sustrae el resto de la division de la suma en 10 y compara que este valor sea igual al ultimo valor del array
        try{
        if(((10-(suma%10))==Integer.parseInt(String.valueOf(imeichar[imeichar.length-1])))||((10-(suma%10))==10 && 0==Integer.parseInt(String.valueOf(imeichar[imeichar.length-1])))){
            valida=true;
        }
        else{
            valida=false;
        }}catch(Exception e){valida=false;}
        return valida;
    }
    
    public static boolean esNumerico(String str){
    try{double d = Double.parseDouble(str);return true;}
    catch(Exception e)
    {return false;}
    }
    
    public static String convertirDateToString(Date fechita){
        String fecha;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        formatoFecha.setLenient(false);
        fecha = formatoFecha.format(fechita);
        return fecha;
    }
    
    public static java.sql.Date convertirUtilASQL(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    
    public static boolean validarFecha(String fec){
         try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            Date fecha = formatoFecha.parse(fec);
         } catch (Exception e) {
            return false;
         }
           return true;
    }

    public static Integer diferenciaFechas(String fechaactual, String fechaentrega){
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Integer retorno=null;
    try
    {
    Date date1=df.parse(fechaactual);
    Calendar cal1=Calendar.getInstance();
    Date date2=df.parse(fechaentrega);
    Calendar cal2=Calendar.getInstance();
    cal1.setTime(date1);
    long ldate1 = date1.getTime() + cal1.get(Calendar.ZONE_OFFSET) + cal1.get(Calendar.DST_OFFSET);
    cal2.setTime(date2);
    long ldate2 = date2.getTime() + cal2.get(Calendar.ZONE_OFFSET) + cal2.get(Calendar.DST_OFFSET);
    int hr1 = (int)(ldate1/3600000); //60*60*1000
    int hr2 = (int)(ldate2/3600000);
    int dia1 = hr1/24;
    int dia2 = hr2/24;
    retorno=dia2-dia1;
    }
    catch (Exception e){}
    return retorno;
    }
    
    public static Date restamesano(Date fecha, String factor, int valor){
    Calendar c1=Calendar.getInstance();
    c1.setTime(fecha);
    if("dia".equals(factor)){c1.add(Calendar.DAY_OF_MONTH, valor);}
    if("mes".equals(factor)){c1.add(Calendar.MONTH, valor);}
    if("año".equals(factor)){c1.add(Calendar.YEAR, valor);}
    return c1.getTime();
    }
}
