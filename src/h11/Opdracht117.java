package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht117 extends Applet {

    public void init() {

        setSize(500, 500);
        setBackground(Color.lightGray);

    }

    public void paint(Graphics g) {

        g.setColor(Color.magenta);
        int rad = 5;
        int dia = 10;
        for (int i = 0; i < 50; i++) {
            g.drawOval(250-(i*rad),250-(i*rad),(i+1)*dia,(i+1)*dia);
        }

    }

}
