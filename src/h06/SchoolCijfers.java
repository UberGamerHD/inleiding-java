package h06;

import java.applet.Applet;
import java.awt.*;

public class SchoolCijfers extends Applet {
    double a;
    double b;
    double c;
    double d;
    int e;
    double uitkomst;
    double uitkomst2;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = 10;
        uitkomst = (a + b + c) / d;
        uitkomst2 = uitkomst * e;
    }
    public void paint(Graphics g) {
        g.drawString("Hey Gemiddelde: " + uitkomst , 20 , 20);

    }
}
