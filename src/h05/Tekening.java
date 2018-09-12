package h04;

import java.applet.Applet;
import java.awt.*;

public class Tekening extends Applet {

    public void init() {

    }
    Color opvulkleur = Color.magenta;
    int breedte = 200;
    int hoogte = 105;


    public void paint(Graphics g) {
        g.drawLine(10 , 25 , 210 , 25);
        g.drawString("Lijn" , 100 , 40);
        g.drawRect(10 , 50 , breedte , 105);
        g.drawString("Rechthoek" , 80 , 170);
        g.drawOval(220 , 50 , breedte , hoogte);
        g.setColor(opvulkleur);
        g.fillRect(220, 50 , breedte , hoogte);
        g.setColor(Color.black);
        g.drawOval(220 , 50 , breedte , hoogte);
        g.drawOval(430, 50 , breedte , hoogte);
        g.drawString("Gevulde rechthoek met ovaal" , 240 , 170);
        g.setColor(opvulkleur);
        g.fillArc(430 , 50 , breedte , hoogte , 0 , 45);
        g.setColor(Color.black);
        g.drawRoundRect(10 , 180 , 200 , hoogte ,30 ,30);
        g.drawString("Taartpunt met ovaal eromheen" , 450 , 170);
        g.drawString("Afgeronde rechthoek" , 60 , 300);
        g.setColor(opvulkleur);
        g.fillOval(220 , 180 , breedte , hoogte);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal" ,290 , 300);
        g.drawOval(480, 180, 100 , 100);
        g.drawString("Cirkel" , 510 , 300);
    }
}
