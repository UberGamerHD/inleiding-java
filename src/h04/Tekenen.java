package h04;

import java.applet.Applet;
import java.awt.*;

public class Tekenen extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(10 , 25 , 210 , 25);
        g.drawString("Lijn" , 100 , 40);
        g.drawRect(10 , 50 , 200 , 105);
        g.drawString("Rechthoek" , 80 , 170);
        g.drawOval(220 , 50 , 200 , 105);
        g.setColor(Color.magenta);
        g.fillRect(220, 50 , 200 , 105);
        g.setColor(Color.black);
        g.drawOval(220 , 50 , 200 , 105);
        g.drawOval(430, 50 , 200 , 105);
        g.drawString("Gevulde rechthoek met ovaal" , 240 , 170);
        g.setColor(Color.magenta);
        g.fillArc(430 , 50 , 200 , 105 , 0 , 45);
        g.setColor(Color.black);
        g.drawRoundRect(10 , 180 , 200 , 105 ,30 ,30);
        g.drawString("Taartpunt met ovaal eromheen" , 450 , 170);
        g.drawString("Afgeronde rechthoek" , 60 , 300);
        g.setColor(Color.magenta);
        g.fillOval(220 , 180 , 200 , 105);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal" ,290 , 300);
        g.drawOval(480, 180, 100 , 100);
        g.drawString("Cirkel" , 510 , 300);
    }
}
