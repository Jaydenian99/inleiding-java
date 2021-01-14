package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht47 extends Applet {

    public void init() {

        setSize(500, 500);
        setBackground(Color.GRAY);

    }

    public void paint(Graphics g) {
        //Dice color and size
        g.setColor(Color.WHITE);
        g.fillRoundRect(105, 100, 200, 200, 50, 50);
        g.setColor(Color.BLACK);
        g.drawRoundRect(105, 100, 200, 200, 50, 50);

        //Dice four side
        g.setColor(Color.black);
        g.fillOval(140, 135, 50, 50);
        g.fillOval(140, 215, 50, 50);
        g.fillOval(220, 135, 50, 50);
        g.fillOval(220, 215, 50, 50);



    }
}
