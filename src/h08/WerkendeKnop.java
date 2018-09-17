package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class WerkendeKnop extends Applet {
    TextField tekstsvak;
    Button knop;
    Button resetknop;
    String schermtekst;
    Label label;

    public void init() {
        // OK-Knop
        schermtekst = new String();
        knop = new Button();
        knop.setLabel("Ok-Knop");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        // Reset-Knop
        resetknop = new Button("Reset Knop");
        ResetListener rl = new ResetListener();

        resetknop.addActionListener( rl );
        add(resetknop);
        // Tekst Vak
        tekstsvak = new TextField("" , 20);
        label = new Label();
        schermtekst = "";
        add(label);
        add(tekstsvak);



    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50 ,60);

    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = tekstsvak.getText();
            repaint();
        }
    }
    class ResetListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstsvak.setText(" ");
            repaint();
        }
    }
}