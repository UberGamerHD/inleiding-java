package h11;

import java.applet.Applet;
import java.awt.*;

public class opdr5 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;
        int x = 0;

        while (teller < 5){
            y += 50;
            x += 50;
            g.drawRect(x,y,50,50);
            teller++;
        }
    }
}
