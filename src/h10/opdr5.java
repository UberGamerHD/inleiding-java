package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdr5 extends Applet {

TextField textField;
double input;
String s, tekst, geslaagdtekst;
double totaal, aantal, gemiddelde;
Button knop;



    @Override
    public void init() {
        knop = new Button("ok");
        knop.addActionListener(new GemiddeldeListener());
        textField = new TextField("" , 20);
        textField.addActionListener( new SchoolListener() );

        add(textField);
        add(knop);
        tekst = "Joehoe";
        geslaagdtekst = "";
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst , 50, 60);
        g.drawString("Joun gemiddelde cijfer is: " + gemiddelde + geslaagdtekst , 50 , 80);
    }


    class SchoolListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = textField.getText();
            input = Double.parseDouble(s);

            aantal++;
            totaal+= input;

            if (input > 5.5) {
                tekst = "" + input + "  is een voldoende!";
            }
            else {
                tekst = "" + input + "  is een onvoldoende.";

            }
            repaint();
        }
    }
    class GemiddeldeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            gemiddelde = totaal / aantal;

            if (gemiddelde > 5.5) {
                geslaagdtekst = " en je bent geslaagd!";
            }
            else {
                geslaagdtekst = " en je bent niet geslaagd.";
            }
            repaint();
        }

    }
}
