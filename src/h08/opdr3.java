package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdr3 extends Applet {
    Button knop;
    Label label;
    TextField tekstvak;
    String output;
    double getal;



    public void init() {
        knop = new Button("Ok");
        label = new Label("Type hier het getal zonder btw");
        tekstvak = new TextField("" , 20);
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);

        // Knoppen toevoegen.
        add(knop);
        add(label);
        add(tekstvak);

       // output = "Bedrag incl btw: " + getal;


    }

    public void paint(Graphics g) {
        g.drawString("Bedrag incl btw: " + getal , 50 , 60);


    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            output = tekstvak.getText();
            getal = Double.parseDouble(output);
            getal = getal * 1.21;
            repaint();
        }
    }
}
