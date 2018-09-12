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
    int geheel;
    double gebroken;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = 10;
        uitkomst = (a + b + c) / d;
        uitkomst2 = uitkomst * 10;
        uitkomst2 = (int) uitkomst2;
        uitkomst2 = (uitkomst2 / e);

    }
    public void paint(Graphics g) {
        g.drawString("Het Gemiddelde: " + uitkomst2 , 20 , 20);

    }
}
