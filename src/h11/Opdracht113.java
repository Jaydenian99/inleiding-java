package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht113 extends Applet {

    long[] getal;
    int i;

    public void init() {
        getal = new long[1000];
        getal[0] = 0;
        getal[1] = 1;

        for (i = 2; i < 1000; i++) {
            getal[i] = getal[i - 2] + getal[i - 1];
        }
    }

    public void paint(Graphics g) {
        int yPos = 20;

        for (i = 1; i < 1000; i++) {
            g.drawString("" + getal[i], 50, yPos);
            yPos += 20;
        }

    }

}
