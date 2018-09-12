package h06;

import java.applet.Applet;
import java.awt.*;

public class Getallen extends Applet {
    int a, b , c, uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;
    }
    public void paint(Graphics g) {
        g.drawString("Jan:             " + uitkomst , 20 , 20);
        g.drawString("Ali:               " + uitkomst , 20 , 30);
        g.drawString("Jeannete:  " + uitkomst, 20 , 40 );
        g.drawString("Mert:            " + uitkomst , 20 , 50);
    }
}
