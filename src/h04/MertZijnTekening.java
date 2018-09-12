package h04;

import java.awt.*;
import java.applet.*;


public class MertZijnTekening extends Applet {

    public void init() {

    }


    public void paint(Graphics G) {
        getGraphics().setColor(Color.black);
        getGraphics().drawLine(0 , 400 ,200 , 0);
        getGraphics().drawLine(0 , 400 , 400 , 400);
        getGraphics().drawLine(400 , 400 , 200 , 0);
    }
}


