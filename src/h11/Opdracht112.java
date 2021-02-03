package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht112 extends Applet {

    public void init() {

    setBackground(Color.lightGray);

    }

    public void paint(Graphics g) {

        int y = 0;
        int teller;
        for (teller = 10; teller < 21 ; teller++) {
            y += 20;
            g.setColor(Color.black);
            g.drawString("" + teller, 150, y);
        }

    }

}
