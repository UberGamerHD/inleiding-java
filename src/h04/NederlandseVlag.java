package h04;

import java.applet.*;
import java.awt.*;

public class NederlandseVlag extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRect(0 , 0 , 400 , 200);
        g.drawLine(0 , 66 , 400 , 66);
        g.drawLine(0, 132 , 400 , 132);
        g.drawLine(400 , 200 , 400, 600);
        g.setColor(Color.RED);
        g.fillRect(0 , 0, 400 , 66);
        g.setColor(Color.blue);
        g.fillRect(0 , 132 , 400 , 68);
        }
}

