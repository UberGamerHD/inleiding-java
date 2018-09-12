package h04;

import java.applet.Applet;
import java.awt.*;

public class DobbelSteen extends Applet {

    public void init() {


    }

    public void paint(Graphics g) {
        g.drawRoundRect(0 , 0 , 200 , 200 , 20 , 20);
        g.fillOval(20 , 25 , 50 , 50);
        g.fillOval(135 , 25, 50 , 50);
        g.fillOval(20 , 125 , 50 , 50);
        g.fillOval(135 , 125 , 50 , 50);
    }
}
