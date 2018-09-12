package h05;

import java.awt.*;
import java.applet.*;

public class StaafDiagramSlim extends Applet {

    public void init() {
        setSize(500,500);


    }
    int gewichthans = 320;
    int gewichtjeroen = 390;
    int gewichtvalerie = 160;
    int yvalerie = 400 - gewichtvalerie;
    int yjeroen = 400 - 390;
    int yhans = 400 - 320;



    public void paint(Graphics g) {

        //De X en Y Lijnen.
        g.drawLine(55 , 400 , 55 , 0);
        g.drawLine(55 , 400 , 500 , 400);
        g.drawLine(65 , 0 , 45, 0);
        g.drawLine(65, 80 , 45 , 80);
        g.drawLine(65 , 160 , 45 , 160);
        g.drawLine(65 , 240 , 45 , 240);
        g.drawLine(65 , 320 , 45 , 320);
        g.drawLine(65 , 400 , 45 , 400);


        //De Stafen.
        g.setColor(Color.PINK);
        g.fillRect(80 , yjeroen , 100 , gewichtjeroen);
        g.drawString("Jeroen" , 110 , 415);
        g.setColor(Color.yellow);
        g.fillRect(230 , yhans , 100 ,gewichthans);
        g.drawString("Hans" , 270 , 415);
        g.setColor(Color.blue);
        g.drawString("Valerie" , 395 , 415);
        g.fillRect(370 , yvalerie , 100 ,gewichtvalerie);


        //De getallen van 0 tot 100
        g.setColor(Color.black);
        g.drawString("100" , 10 ,10);
        g.drawString("80" , 10 , 85);
        g.drawString("60" , 10 , 165);
        g.drawString("40" , 10 , 245);
        g.drawString("20" , 10 , 325);

    }
}
