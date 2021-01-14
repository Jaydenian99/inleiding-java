package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht46 extends Applet {

    public void init() {
        setSize(500, 500);
        setBackground(Color.WHITE);

    }


    public void paint(Graphics g) {
        //Stoplight
        g.setColor(Color.BLACK);
        g.fillRect(100, 90, 60, 180);

        //stoplight Color red
        g.setColor(Color.red);
        g.fillOval(105, 100, 49, 50);

        //Stoplight color yellow
        g.setColor(Color.yellow);
        g.fillOval(105, 155, 49, 50);

        //stoplight color green
        g.setColor(Color.green);
        g.fillOval(105, 210, 49, 50);

        //Stoplight pole
        g.setColor(Color.black);
        g.fillRect(120, 270, 20, 400);



    }
}
