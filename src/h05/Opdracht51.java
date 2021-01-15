package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht51 extends Applet {

    //Color variable
    Color fillincolor = Color.magenta;

    //Variable for height
    int breedte, hoogte;

    public void init() {
        //Declaration
        hoogte = 100;
        breedte = 175;

        setSize(500, 500);
        setBackground(Color.white);

    }

    public void paint(Graphics g) {

        //Line
        g.setColor(Color.BLACK);
        g.drawLine(50, 25, 225, 25);
        g.drawString("Lijn", 130, 40);

        //Rectangle
        g.setColor(Color.black);
        g.drawRect(50, 50, breedte, hoogte);
        g.drawString("Rechthoek", 115, 165);

        //Ellipse in front of a rectangle
        g.setColor(fillincolor);
        g.fillRect(235, 50, breedte, hoogte);
        g.setColor(Color.black);
        g.drawOval(235, 50, breedte, hoogte);
        g.drawString("Gevulde rechthoek met ovaal", 240, 165);

        //Ellipse with filled arc
        g.setColor(fillincolor);
        g.fillArc(418,50, breedte, 100, 0, 45);
        g.setColor(Color.BLACK);
        g.drawOval(418, 50, breedte, hoogte);
        g.drawString("Taartpunt met ovaal eromheen", 423, 165);

        //Rounded square
        g.setColor(Color.BLACK);
        g.drawRoundRect(50, 175, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde rechthoek", 83, 290);

        //Oval
        g.setColor(fillincolor);
        g.fillOval(234, 175, breedte, hoogte);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 283, 290);

        //Circle
        g.setColor(Color.black);
        g.drawOval(460, 175, 100, hoogte);
        g.drawString("Cirkel", 495, 290);



    }
}
