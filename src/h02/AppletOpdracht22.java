package h02;

// Necessary classes imported
import java.applet.Applet;
import java.awt.*;

public class AppletOpdracht22 extends Applet {
    /* Init Method*/
    public void init() {
        setSize(500, 500);
        setBackground(Color.white);
    }

    /* Paint Method */
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Jayden", 50, 60);
        g.setColor(Color.red);
        g.drawString("Wong", 50, 80);
    }
}