package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht41 extends Applet {


    public void init() {
        setSize(500, 500);
        setBackground(Color.white);


    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.pink);
        g.drawLine(50, 120, 200, 120);
        g.drawLine(50, 120, 125, 20);
        g.drawLine(125,20, 200,120);

    }
}
