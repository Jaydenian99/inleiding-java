package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht116 extends Applet {

    public void init() {

        setSize(500, 500);
        setBackground(Color.lightGray);

    }

    public void paint(Graphics g) {

        g.setColor(Color.magenta);
        int rad = 10;
        int dia = 20;
        for (int i = 0; i < 5; i++) {
            g.drawOval(100-(i*rad),100-(i*rad),(i+1)*dia,(i+1)*dia);
        }

    }

}
