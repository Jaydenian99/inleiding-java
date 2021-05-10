package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht121 extends Applet {

    int Getallen [];
    int Totaal = 0;
    int Gemiddeld = 0;

    public void init() {

        setBackground(Color.lightGray);

        Getallen = new int[10];

        Getallen [0] = 12;
        Getallen [1] = 21;
        Getallen [2] = 30;
        Getallen [3] = 43;
        Getallen [4] = 86;
        Getallen [5] = 23;
        Getallen [6] = 11;
        Getallen [7] = 69;
        Getallen [8] = 67;
        Getallen [9] = 13;
        for (int i = 0; i < Getallen.length; i++) {
            Totaal += Getallen[i];
        }
        Gemiddeld = Totaal / 10;

    }

    public void paint(Graphics g) {


        for (int i = 0; i < Getallen.length; i++) {
            g.drawString("" + Getallen[i], 50, 20 * i + 20);
        }

        g.drawString("Het gemiddelde is " + Gemiddeld, 100, 100);
        repaint();
    }

}
