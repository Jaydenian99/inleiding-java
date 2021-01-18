package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht61 extends Applet {

    //Doubles
        double JAJJ;
        double Verdeling;
        double uitkomst;

    //Integer for x axis
        int xAxis;

    public void init() {

        setSize(500, 500);
        setBackground(Color.darkGray);

        JAJJ = 113;
        Verdeling = 4;
        uitkomst = JAJJ / 4;
        xAxis = 30;

    }

    public void paint(Graphics g) {

        g.setColor(Color.white);
        g.drawString("Jan, Ali, Jeannette en Jayden hebben samen een karwei verricht en daarmee €113 verdiend.", xAxis, 40);
        g.drawString("Wij willen dit geld eerlijk verdelen.", xAxis, 60);
        g.drawString("Heermee hebben we samen met een berekening het juiste verdeling gedaan.", xAxis, 80);
        g.drawString("De uitkomst is: €" + uitkomst, xAxis, 100);

    }
}
