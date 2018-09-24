package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdr3 extends Applet {
    TextField tekstvak, tekstvakJaar;
    Label label, label2;
    String s, tekst, s2, tekst2;
    int dag;
    int jaar;

    public void init() {
        setSize(500,500);
        tekstvak = new TextField("", 20);
        tekstvakJaar = new TextField("" , 20);
        label = new Label("Type het maandnummer en druk op enter");
        label2 = new Label("Typer hier een jaargetal in en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvakJaar.addActionListener( new SchrikkelListener() );
        tekst = "";
        tekst2 = "";
        add(label2);
        add(label);
        add(tekstvak);
        add(tekstvakJaar);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 100 );
        g.drawString(tekst2, 50, 250);
        tekstvakJaar.setLocation(35, 200);
        tekstvak.setLocation(35, 50);
        label2.setLocation(50 , 150);
        label.setLocation(50,20);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "Januari met 31 dagen.";
                    break;
                case 2:
                    tekst = "Februari met 28 dagen.";
                    break;
                case 3:
                    tekst = "Maart met 31 dagen.";
                    break;
                case 4:
                    tekst = "April met 30 dagen.";
                    break;
                case 5:
                    tekst = "Mei met 30 dagen.";
                    break;
                case 6:
                    tekst = "Juni met 30 dagen.";
                    break;
                case 7:
                    tekst = "Juli met 31 dagen.";
                    break;
                case 8:
                    tekst = "Augustus 31 dagen.";
                    break;
                case 9:
                    tekst = "September met 30 dagen.";
                    break;
                case 10:
                    tekst = "Oktober met 31 dagen.";
                    break;
                case 11:
                    tekst = "November met 30 dagen.";
                    break;
                case 12:
                    tekst = "December met 31 dagen.";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
    class SchrikkelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s2 = tekstvakJaar.getText();
            jaar = Integer.parseInt(s2);
            if ( (jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0 ) {
                tekst2 = "Dit jaar is een schrikkeljaar!";

                }
            else {
                tekst2 = "Dit is geen schrikkeljaar.";
            }
            repaint();

        }
    }
}