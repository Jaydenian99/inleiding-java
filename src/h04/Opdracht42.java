package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht42 extends Applet {

    public void init() {

        setSize(500, 500);
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        //House design
        g.setColor(Color.white);
        g.drawRect(120,200, 250, 200);
        //Door design
        g.setColor(Color.GRAY);
        g.fillRect(223,325,50,75);
        g.drawRect(223, 325, 50, 75);
        g.setColor(Color.ORANGE);
        g.fillOval(255,365,10,10);
        g.drawOval(255,365,10, 10);
        //Roof design
        g.setColor(Color.white);
        g.drawLine(120, 200, 246, 50);
        g.drawLine(246, 50, 370, 200);
        //Window design
        g.setColor(Color.GRAY);
        g.drawRect(160,325,30, 35);
        g.drawRect(305, 325, 30, 35);
        //to overlap the color of the door
        g.drawRect(120,200, 250, 200);


    }
}
