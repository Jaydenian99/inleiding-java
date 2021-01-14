package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht43 extends Applet {

    public void init() {
        setSize(500,500);
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        //Flag size and pole
        g.setColor(Color.lightGray);
        g.fillRect(250,125,4, 200);
        g.fillRect(250, 125, 150, 75);
        g.setColor(Color.red);

        //Flag color
        g.setColor(Color.red);
        g.fillRect(250, 125, 150, 25);
        g.setColor(Color.blue);
        g.fillRect(250, 175, 150, 25);

        //For pole to overlap color of the flag
        g.setColor(Color.lightGray);
        g.fillRect(250,125,4, 200);


    }
}
