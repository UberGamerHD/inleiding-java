package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr4 extends Applet {


    @Override
    public void init() {
    }


    @Override
    public void paint(Graphics g) {
        g.drawString("1 x 3 = 3" , 50 ,60);
        g.drawString("2 x 3 = 6", 50 , 75);
        g.drawString("3 x 3 = 9",50 , 90);
        g.drawString("4 x 3 = 12",50 , 105);
        g.drawString("5 x 3 = 15", 50, 120);
        g.drawString("6 x 3 = 18",50 , 135);
        g.drawString("7 x 3 = 21",50 , 150);
        g.drawString("8 x 3 = 24",50 , 165);
        g.drawString("9 x 3 = 27",50 , 180);
        g.drawString("10 x 3 = 30",50 , 195);
    }
}
