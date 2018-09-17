package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rekenmachine extends Applet {
    Button plusKnop, minKnop, deelKnop, keerKnop;
    TextField textField1, textField2;
    double getal1;
    double getal2;
    double plustotaal;
    double mintotaal;
    double deeltotaal;
    double keertotaal;


    @Override
    public void init() {
        setSize(500, 300);
        textField1 = new TextField("", 10);
        textField2 = new TextField("", 10);
        add(textField1);
        add(textField2);


        plusKnop = new Button("+");
        PlusListener pl = new PlusListener();
        plusKnop.addActionListener(pl);
        add(plusKnop);

        minKnop = new Button("-");
        MinListener ml = new MinListener();
        minKnop.addActionListener(ml);
        add(minKnop);

        deelKnop = new Button("/");
        DeelListener dl = new DeelListener();
        deelKnop.addActionListener(dl);
        add(deelKnop);

        keerKnop = new Button("x");
        KeerListener kl = new KeerListener();
        keerKnop.addActionListener(kl);
        add(keerKnop);


    }

    class PlusListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input1 = textField1.getText();
            String input2 = textField2.getText();
            getal1 = Double.parseDouble(input1);
            getal2 = Double.parseDouble(input2);

            plustotaal = getal1 + getal2;
            textField1.setText("" + plustotaal);
            textField2.setText("");


        }

    }

    class MinListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input1 = textField1.getText();
            String input2 = textField2.getText();
            getal1 = Double.parseDouble(input1);
            getal2 = Double.parseDouble(input2);

            mintotaal = getal1 - getal2;
            textField1.setText("" + mintotaal);
            textField2.setText("");
        }
    }

    class DeelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String input1 = textField1.getText();
            String input2 = textField2.getText();
            getal1 = Double.parseDouble(input1);
            getal2 = Double.parseDouble(input2);

            deeltotaal = getal1 / getal2;
            textField1.setText("" + deeltotaal);
            textField2.setText("");

        }
    }
    class KeerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input1 = textField1.getText();
            String input2 = textField2.getText();
            getal1 = Double.parseDouble(input1);
            getal2 = Double.parseDouble(input2);

            keertotaal = getal1 * getal2;
            textField1.setText("" + keertotaal);
            textField2.setText("");
        }
    }
}