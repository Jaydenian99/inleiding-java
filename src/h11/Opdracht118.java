package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht118 extends Applet {

    public void init() {

        setSize(500, 500);
        setBackground(Color.lightGray);

    }

    public void paint(Graphics g) {

        g.setColor(Color.magenta);
        int Width = 200;
        int Height = 200;
        for (int i = 0; i < 100; i++) {
            g.drawOval(150, 150, Width, Height);
            Width ++;
            Height ++;
        }

    }

}
