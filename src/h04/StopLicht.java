package h04;

import java.applet.Applet;
import java.awt.*;

public class StopLicht extends Applet {

    public void init() {


    }

    public void paint(Graphics g) {
        g.fillRoundRect(0 , 0 , 50 , 150 , 10 , 10);
        g.setColor(Color.red);
        g.fillOval(5 , 5 ,40 , 40 );
        g.setColor(Color.orange);
        g.fillOval(5 , 50 , 40 , 40);
        g.setColor(Color.green);
        g.fillOval(5 , 100 , 40 , 40);
    }
}
