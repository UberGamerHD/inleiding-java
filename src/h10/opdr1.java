package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class opdr1 extends Applet {
    TextField tekstvak;
    String s, schermtekst, schermtekst2;
    int hoogstegetal, laagstegetal;
    int input;

    @Override
    public void init() {
        tekstvak = new TextField("" , 20);
        schermtekst = "";
        schermtekst2 = "";
        tekstvak.addActionListener( new TekstListener());
        tekstvak.addActionListener( new TekstListener2());
        hoogstegetal = 0;
        laagstegetal = 1000000000;
        add(tekstvak);
    }


    @Override
    public void paint(Graphics g) {
        g.drawString(schermtekst , 50 , 70);
        g.drawString(schermtekst2 , 50 , 50);

    }

    class TekstListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            input = Integer.parseInt(s);

            if (input > hoogstegetal) {
                hoogstegetal = input;
                schermtekst = "Hoogste getal: " + hoogstegetal;
                repaint();
            }

            }
        }
     class TekstListener2 implements ActionListener {
         @Override
         public void actionPerformed(ActionEvent e) {
             s = tekstvak.getText();
             input = Integer.parseInt(s);

             if (input < laagstegetal) {

                 laagstegetal = input;
                 schermtekst2 = "Laagste getal: " + laagstegetal;
                 repaint();
             }

         }
     }
    }
