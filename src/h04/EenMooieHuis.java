package h04;

import java.applet.*;
import java.awt.*;

public class EenMooieHuis extends Applet{

    public void init() {

    }

    public void paint(Graphics G) {
        getGraphics().setColor(Color.black);
        getGraphics().drawRect(0 , 200 , 200 , 200);
        getGraphics().drawLine(0 , 200 , 100 , 100);
        getGraphics().drawLine(200 , 200 , 100 ,100);
        getGraphics().drawLine(180 , 400 , 180 , 320);
        getGraphics().drawLine(120 , 400 , 120 , 320);
        getGraphics().drawLine(120 , 320 , 180 , 320);
        getGraphics().drawRect(20 , 320, 50, 50);
    }

}
