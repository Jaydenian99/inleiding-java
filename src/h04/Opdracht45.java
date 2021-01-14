package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht45 extends Applet {

    public void init() {
        setSize(500, 500);
        setBackground(Color.blue);
    }


    public void paint(Graphics g) {
        //Ellipse
       g.setColor(Color.black);
       g.drawOval(100, 100, 300, 200);

       //Arc
        g.setColor(Color.yellow);
        g.fillArc(100, 100, 300, 200, 0, 90);

        //Overlap lines
        g.setColor(Color.BLACK);
        g.drawLine(100, 200, 400, 200);
        g.drawLine(250, 100, 250, 300);
    }
}
