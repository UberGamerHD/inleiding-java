package h02;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
        setBackground(Color.white);


    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Mert", 50, 60);
        g.setColor(Color.RED);
        g.drawString("Ari", 50 , 70);

    }

}

