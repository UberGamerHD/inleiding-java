package h06;

import java.applet.Applet;
import java.awt.*;

public class Secondes extends Applet {



    int a;
    int b;
    int c;
    int d;
    int uitkomstuur;
    int uitkomstdag;
    int uitkomstjaar;

    public void init() {
        a = 60;
        b = 60;
        c = 24;
        d = 365;
        uitkomstuur = a * b;
        uitkomstdag = uitkomstuur * c;
        uitkomstjaar = uitkomstdag * d;
    }

    public void paint(Graphics g) {
        g.drawString("Seconden per uur: " + uitkomstuur , 20 , 20);
        g.drawString("Seconden per dag: " + uitkomstdag , 20 , 40);
        g.drawString("Seconden per jaar: " + uitkomstjaar , 20 , 60);

    }
}