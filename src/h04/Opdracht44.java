package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht44 extends Applet {

    public void init() {

        setSize(500,500);
        setBackground(Color.LIGHT_GRAY);
    }

    public void paint(Graphics g) {

        //Bg rect
        g.setColor(Color.white);
        g.fillRect(100, 100, 270, 300);

        //First diagram
        g.setColor(Color.RED);
        g.fillRect(100,280, 90, 120);
        g.setColor(Color.BLACK);
        g.drawString("Valerie", 125, 420);

        //second diagram
        g.setColor(Color.yellow);
        g.fillRect(190, 100, 90, 300);
        g.setColor(Color.BLACK);
        g.drawString("Jeroen", 215, 420);

        //Third diagram
        g.setColor(Color.GREEN);
        g.fillRect(280, 160, 90, 240);
        g.setColor(Color.black);
        g.drawString("Hans", 310, 420);

        //Dividing lines
        g.setColor(Color.black);
        g.drawRect(100, 100, 270, 300);
        g.drawString("100kg", 60, 100 );
        g.setColor(Color.black);
        g.drawLine(100, 160, 370, 160);
        g.drawString("80kg", 60, 160 );
        g.drawLine(100, 220, 370, 220);
        g.drawString("60kg", 60, 220 );
        g.drawLine(100, 280, 370, 280);
        g.drawString("40kg", 60, 280 );
        g.drawLine(100, 340, 370, 340);
        g.drawString("20kg", 60, 340 );
        g.drawString("0kg", 60, 400);

        //Overlap
        g.setColor(Color.black);
        g.drawRect(100,100, 90, 300);
        g.drawRect(190, 100, 90, 300);

    }
}
