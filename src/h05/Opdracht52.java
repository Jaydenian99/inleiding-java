package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht52 extends Applet {
    //Val informatie
    int valhoogte;
    int valgewicht;
    String valstring;

    //Jeroen informatie
    int jerhoogte;
    int jergewicht;
    String jerstring;

    //Hans informatie
    int janshoogte;
    int jansgewicht;
    String jansstring;

    public void init() {

        //Valerie gewicht en hoogte verandering
        valgewicht = 60;
        valhoogte = -3 * valgewicht;
        valstring = "Valerie " + valgewicht + "kg";

        //Jeroen gewicht en hoogte verandering
        jergewicht = 100;
        jerhoogte = -3 * jergewicht;
        jerstring = "Jeroen " + jergewicht + "kg";

        //Jans gewicht en hoogte verandering
        jansgewicht = 80;
        janshoogte = -3 * jansgewicht;
        jansstring = "Jans " + jansgewicht + "kg";


        setSize(500,500);
        setBackground(Color.lightGray);
    }

    public void paint(Graphics g) {

        //Bg rect
        g.setColor(Color.white);
        g.fillRect(100, 100, 270, 300);

        //First diagram
        g.setColor(Color.RED);
        g.fillRect(100,400, 90, valhoogte);
        g.setColor(Color.BLACK);
        g.drawString(valstring, 108, 420);


        //second diagram
        g.setColor(Color.yellow);
        g.fillRect(190, 400, 90, jerhoogte);
        g.setColor(Color.BLACK);
        g.drawString(jerstring, 195, 420);

        //Third diagram
        g.setColor(Color.GREEN);
        g.fillRect(280, 400, 90, janshoogte);
        g.setColor(Color.black);
        g.drawString(jansstring, 295, 420);

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
