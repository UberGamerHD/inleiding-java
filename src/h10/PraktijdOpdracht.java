package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijdOpdracht extends Applet {

    TextField textField;
    int dag;
    String s, tekst;

    @Override
    public void init() {
        textField = new TextField("", 10);
        tekst = "";
        add(textField);
        textField.addActionListener(new TekstvakListener());
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst , 50 , 60);

    }

    class TekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = textField.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst = "Een 1 is een slecht.";
                    break;
                case 2:
                    tekst = "Een 2 is een slecht.";
                    break;
                case 3:
                    tekst = "Een 3 is een slecht.";
                    break;
                case 4:
                    tekst = "Een 4 is een onvoldoende.";
                    break;
                case 5:
                    tekst = "Een 5 is een matig.";
                    break;
                case 6:
                    tekst = "Een 6 is een voldoende!.";
                    break;
                case 7:
                    tekst = "Een 7 is een voldoende!";
                    break;
                case 8:
                    tekst = "Een 8 is een goed!";
                    break;
                case 9:
                    tekst = "Een 9 is een goed!";
                    break;
                case 10:
                    tekst = "Een 10 is een goed!";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";

            }
            repaint();

        }
    }
}
