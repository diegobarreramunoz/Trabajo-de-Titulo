/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class repintado extends JPanel{
    private Color color1 = new Color(255,51,51);
    private Color color2 = new Color(153,153,255);
    @Override
    public void paint(Graphics g) {
  Graphics2D g2d = (Graphics2D) g;
  g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
  GradientPaint horizontalGradient = new GradientPaint(0, 0, getColor1(), getWidth(), 0, getColor2().darker());
  g2d.setPaint(horizontalGradient);
  g2d.fillRect(0, 0, getWidth(), getHeight());
  }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

}
