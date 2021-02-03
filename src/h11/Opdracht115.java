package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht115 extends Applet {

    public void init() {

        setSize(500, 500);
        setBackground(Color.lightGray);

    }

    public void paint(Graphics g) {

        g.setColor(Color.MAGENTA);
        int xAxis = 20;
        int yAxis = 20;
        for (int i = 0; i < 5; i++) {
            g.drawRect(xAxis, yAxis, 25, 25);
            xAxis += 25;
            yAxis += 25;
        }

    }

}
