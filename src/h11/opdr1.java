package h11;

import java.applet.Applet;
import java.awt.*;

public class opdr1 extends Applet {

    @Override
    public void init() {

    }


    @Override
    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;


        while (teller < 10) {
            x += 20;
            g.drawLine(x , 50 , x, 300);
            teller++;
        }
    }
}
