package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

    TextField textField;
    int tafel;
    String s, tekst1, tekst2,tekst3,tekst4,tekst5,tekst6,tekst7,tekst8,tekst9,tekst10;

    @Override
    public void init() {
        textField = new TextField(20);
        textField.addActionListener(new TextFieldListener());


        add(textField);
    }


    @Override
    public void paint(Graphics g) {
        g.drawString("" + tekst1 , 50 ,60);
        g.drawString("" + tekst2 , 50 ,75);
        g.drawString("" + tekst3 , 50 ,90);
        g.drawString("" + tekst4 , 50 ,105);
        g.drawString("" + tekst5 , 50 ,120);
        g.drawString("" + tekst6 , 50 ,135);
        g.drawString("" + tekst7 , 50 ,150);
        g.drawString("" + tekst8 , 50 ,165);
        g.drawString("" + tekst9 , 50 ,180);
        g.drawString("" + tekst10 , 50 ,195);
    }


    class TextFieldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = textField.getText();
            tafel = Integer.parseInt(s);
            switch (tafel) {
                case 1:
                    tekst1 = "1x1 = 1";
                    tekst2 = "1x2 = 2";
                    tekst3 = "1x3 = 3";
                    tekst4 = "1x4 = 4";
                    tekst5 = "1x5 = 5";
                    tekst6 = "1x6 = 6";
                    tekst7 = "1x7 = 7";
                    tekst8 = "1x8 = 8";
                    tekst9 = "1x9 = 9";
                    tekst10 = "1x10 = 10";
                    break;
                case 2:
                    tekst1 = "2x1 = 2";
                    tekst2 = "2x2 = 4";
                    tekst3 = "2x3 = 6";
                    tekst4 = "2x4 = 8";
                    tekst5 = "2x5 = 10";
                    tekst6 = "2x6 = 12";
                    tekst7 = "2x7 = 14";
                    tekst8 = "2x8 = 16";
                    tekst9 = "2x9 = 18";
                    tekst10 = "2x10 = 20";
                    break;
                case 3:
                    tekst1 = "3x1 = 3";
                    tekst2 = "3x2 = 6";
                    tekst3 = "3x3 = 9";
                    tekst4 = "3x4 = 12";
                    tekst5 = "3x5 = 15";
                    tekst6 = "3x6 = 18";
                    tekst7 = "3x7 = 21";
                    tekst8 = "3x8 = 24";
                    tekst9 = "3x9 = 27";
                    tekst10 = "3x10 = 30";
                    break;
                case 4:
                    tekst1 = "4x1 = 4";
                    tekst2 = "4x2 = 8";
                    tekst3 = "4x3 = 12";
                    tekst4 = "4x4 = 16";
                    tekst5 = "4x5 = 20";
                    tekst6 = "4x6 = 24";
                    tekst7 = "4x7 = 28";
                    tekst8 = "4x8 = 32";
                    tekst9 = "4x9 = 36";
                    tekst10 = "4x10 = 40";
                    break;
                case 5:
                    tekst1 = "5x1 = 5";
                    tekst2 = "5x2 = 10";
                    tekst3 = "5x3 = 15";
                    tekst4 = "5x4 = 20";
                    tekst5 = "5x5 = 25";
                    tekst6 = "5x6 = 30";
                    tekst7 = "5x7 = 35";
                    tekst8 = "5x8 = 40";
                    tekst9 = "5x9 = 45";
                    tekst10 = "5x10 = 50";
                    break;
                case 6:
                    tekst1 = "6x1 = 6";
                    tekst2 = "6x2 = 12";
                    tekst3 = "6x3 = 18";
                    tekst4 = "6x4 = 24";
                    tekst5 = "6x5 = 30";
                    tekst6 = "6x6 = 36";
                    tekst7 = "6x7 = 42";
                    tekst8 = "6x8 = 48";
                    tekst9 = "6x9 = 54";
                    tekst10 = "6x10 = 60";
                    break;
                case 7:
                    tekst1 = "7x1 = 7";
                    tekst2 = "7x2 = 14";
                    tekst3 = "7x3 = 21";
                    tekst4 = "7x4 = 28";
                    tekst5 = "7x5 = 35";
                    tekst6 = "7x6 = 42";
                    tekst7 = "7x7 = 49";
                    tekst8 = "7x8 = 56";
                    tekst9 = "7x9 = 63";
                    tekst10 = "7x10 = 70";
                    break;
                case 8:
                    tekst1 = "8x1 = 8";
                    tekst2 = "8x2 = 16";
                    tekst3 = "8x3 = 24";
                    tekst4 = "8x4 = 32";
                    tekst5 = "8x5 = 40";
                    tekst6 = "8x6 = 48";
                    tekst7 = "8x7 = 56";
                    tekst8 = "8x8 = 64";
                    tekst9 = "8x9 = 72";
                    tekst10 = "8x10 = 80";
                    break;
                case 9:
                    tekst1 = "9x1 = 9";
                    tekst2 = "9x2 = 18";
                    tekst3 = "9x3 = 27";
                    tekst4 = "9x4 = 36";
                    tekst5 = "9x5 = 45";
                    tekst6 = "9x6 = 54";
                    tekst7 = "9x7 = 63";
                    tekst8 = "9x8 = 72";
                    tekst9 = "9x9 = 81";
                    tekst10 = "9x10 = 90";
                    break;
                case 10:
                    tekst1 = "10x1 = 10";
                    tekst2 = "10x2 = 20";
                    tekst3 = "10x3 = 30";
                    tekst4 = "10x4 = 40";
                    tekst5 = "10x5 = 50";
                    tekst6 = "10x6 = 60";
                    tekst7 = "10x7 = 70";
                    tekst8 = "10x8 = 80";
                    tekst9 = "10x9 = 90";
                    tekst10 = "10x10 = 100";
                    break;
                default:
                    tekst1 = "U hebt een verkeerd nummer ingetikt ..!";
                    tekst2 = "";
                    tekst3 = "";
                    tekst4 = "";
                    tekst5 = "";
                    tekst6 = "";
                    tekst7 = "";
                    tekst8 = "";
                    tekst9 = "";
                    tekst10 = "";

                    break;

            }
            repaint();
        }
    }
}
