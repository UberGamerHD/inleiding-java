package h11;

import java.applet.Applet;
import java.awt.*;

public class opdr8 extends Applet {

    @Override
    public void init() {
        setSize(600,600);
    }


    public void paint(Graphics g) {
        int teller = 0;
        int breedte = 0;
        int lengte = 0;

        while (teller < 100) {
            breedte += 5;
            lengte += 5;


            g.drawOval(50,50,breedte,lengte);
            teller++;
        }
    }
}
