package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht63 extends Applet {

    //Integers with positive values
    int PositiveOne;
    int PositiveTwo;
    int NegativeOne;

    public void init() {

        setSize(500, 500);
        setBackground(Color.darkGray);

        PositiveOne = 2147483647;
        PositiveTwo = 2147483647;
        NegativeOne = PositiveOne + PositiveTwo;

    }

    public void paint(Graphics g) {

        g.setColor(Color.white);
        g.drawString("2147483647 + 2147483647 =  " + NegativeOne, 50, 50);

    }
}
