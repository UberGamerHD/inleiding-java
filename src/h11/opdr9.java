package h11;

import java.applet.Applet;
import java.awt.*;

public class opdr9 extends Applet {

    @Override
    public void init() {
        setSize(500, 500);

    }


    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int breedte = 50;
        int hoogte = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        g.drawRect(50,50 ,400,400);
    }
}
