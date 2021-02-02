package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht111 extends Applet {

    public void init() {

        setSize(500, 500);
        setBackground(Color.lightGray);

    }

    public void paint(Graphics g) {

        g.setColor(Color.magenta);
        int x = 20;
        for (int i = 0; i < 10; i++) {
            g.drawLine(x, 20 , x, 400);
            x += 40;
        }

    }

}
