package h02;

import java.applet.Applet;
import java.awt.*;

public class AppletOpdracht extends Applet {

    public void init() {
                setSize(getWidth(500), getHeight(500));
                setBackground(Color.blue);
    }

    private int getHeight(int i) {
        return 500;
    }

    private int getWidth(int i) {
        return 500;
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Jayden Wong!", getX(50), getY(60));
    }

    private int getX(int i) {
        return 50;
    }

    private int getY(int i) {
        return 60;
    }


}
