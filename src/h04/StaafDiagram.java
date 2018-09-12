package h04;

import java.awt.*;
import java.applet.*;

public class StaafDiagram extends Applet {

    public void init() {


    }

    public void paint(Graphics g) {
        g.drawLine(55 , 400 , 55 , 0);
        g.drawLine(55 , 400 , 500 , 400);
        g.drawLine(65 , 0 , 45, 0);
        g.drawLine(65, 80 , 45 , 80);
        g.drawLine(65 , 160 , 45 , 160);
        g.drawLine(65 , 240 , 45 , 240);
        g.drawLine(65 , 320 , 45 , 320);
        g.drawLine(65 , 400 , 45 , 400);
        g.setColor(Color.PINK);
        g.fillRect(80 , 0 , 100 , 400);
        g.drawString("Jeroen" , 110 , 415);
        g.setColor(Color.yellow);
        g.fillRect(230 , 80 , 100 ,320);
        g.drawString("Hans" , 270 , 415);
        g.setColor(Color.blue);
        g.drawString("Valerie" , 395 , 415);
        g.fillRect(370 , 240 , 100 ,160);

        g.setColor(Color.black);
        g.drawString("100" , 10 ,10);
        g.drawString("80" , 10 , 85);
        g.drawString("60" , 10 , 165);
        g.drawString("40" , 10 , 245);
        g.drawString("20" , 10 , 325);

    }
}
