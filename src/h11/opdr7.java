package h11;

import java.applet.Applet;
import java.awt.*;

public class opdr7 extends Applet {

    @Override
    public void init() {
        setSize(700,700);
    }

    @Override
    public void paint(Graphics g) {
        int teller = 0;
        int breedte = 0;
        int lengte = 0;
        int x = 300;
        int y = 300;

        while (teller < 5) {
            breedte += 3;
            lengte += 3;
            x += -6;
            y += -6;


            g.drawOval(x,y,breedte,lengte);
            x++;
            y++;
            teller++;
        }
    }
}
