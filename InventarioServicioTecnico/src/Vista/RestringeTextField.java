/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Diego
 */
class RestringeTextField extends PlainDocument {
    private int Limite;
    private boolean numerico;
    public RestringeTextField(int i) {
        super();
        this.numerico = false;
        this.Limite=i;
    }
    public RestringeTextField(int i, boolean num) {
        super();
        this.Limite=i;
        this.numerico=num;
    }
    
    @Override
    public void insertString(int compensacion, String str, AttributeSet attr) throws BadLocationException {
        if(str==null) {return;}
        if(((compensacion+str.length())<=Limite || Limite==0) && numerico==true){
            if(str.contains("0")||str.contains("1")||str.contains("2")||str.contains("3")||str.contains("4")||str.contains("5")||str.contains("6")||str.contains("7")||str.contains("8")||str.contains("9")){
            super.insertString(compensacion, str, attr);}
        }
        if((compensacion+str.length())<=Limite && numerico==false){
            super.insertString(compensacion, str, attr);
        }
    }
}
