package h11;

import java.applet.Applet;
import java.awt.*;

public class opdr6 extends Applet {

    @Override
    public void init() {
        setSize(500,500);
    }

    @Override
    public void paint(Graphics g) {
        int teller= 0;
        int breedte = 0;
        int lengte = 0;
        int x = 200;
        int y = 200;

        while (teller < 5) {
            breedte += 10;
            lengte += 10;
            x += -6;
            y += -6;


            g.drawOval(x,y,breedte,lengte);
            x++;
            y++;
            teller++;
        }
    }
}
