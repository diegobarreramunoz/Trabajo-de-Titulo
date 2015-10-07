/**
 * @author Monillo007
 * :: Visita http://monillo007.blogspot.com ::
 */
package Vista;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

public class FormatoTabla implements TableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        JTextField campoTexto = new JTextField();
        campoTexto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        campoTexto.setOpaque(true);
        campoTexto.setHorizontalAlignment(JTextField.CENTER);
        campoTexto.setText(String.valueOf(value));
        if(value instanceof String){
            if(((String)table.getValueAt(row, table.getColumnCount()-1)).equals("Si")){campoTexto.setBackground(new Color(51, 255, 153));}
            if(((String)table.getValueAt(row, table.getColumnCount()-1)).equals("No")){campoTexto.setBackground(new Color(255, 153, 102));}          
            
            try{
            if((Integer.parseInt(String.valueOf(table.getValueAt(row, table.getColumnCount()-1))))<0){campoTexto.setBackground(new Color(255, 153, 102));}
            if((Integer.parseInt(String.valueOf(table.getValueAt(row, table.getColumnCount()-1))))==0){campoTexto.setBackground(new Color(255, 255, 0));}
            if((Integer.parseInt(String.valueOf(table.getValueAt(row, table.getColumnCount()-1))))==1){campoTexto.setBackground(new Color(204, 153, 255));}
            if((Integer.parseInt(String.valueOf(table.getValueAt(row, table.getColumnCount()-1))))==2){campoTexto.setBackground(new Color(153, 153, 255));}
            if((Integer.parseInt(String.valueOf(table.getValueAt(row, table.getColumnCount()-1))))==3){campoTexto.setBackground(new Color(153, 153, 255));}
            if((Integer.parseInt(String.valueOf(table.getValueAt(row, table.getColumnCount()-1))))>=4){campoTexto.setBackground(new Color(51, 255, 153));}}
            catch(Exception e){}
        }
        //if(((Double)table.getValueAt(row, table.getColumnCount()-1)).compareTo(new Double(0))==-1){ 
         //   campoTexto.setBackground(new Color(0xFE899B)); 
         ////   campoTexto.setOpaque(true); 
        //}
        if(isSelected){ 
            campoTexto.setBackground(Color.lightGray.brighter().brighter()); 
        }
        return campoTexto;
    }
    
}
