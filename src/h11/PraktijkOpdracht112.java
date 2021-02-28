package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht112 extends Applet {

    Label Lb;
    Button Knopje;
    int Getal;
    boolean FirstTime;

    public void init() {


        setBackground(Color.lightGray);
        Lb = new Label("Klik op ''Ok'' om de volgende tafel te zien ");
        add(Lb);
        Knopje = new Button("Ok");
        add(Knopje);
        Knopje.addActionListener(new ActionOne());
        FirstTime = true;

    }

    public void paint(Graphics g) {

        int xAxis = 50;
        int yAxis = 150;
        Lb.setLocation(50, 50);
        Knopje.setLocation(50, 75);
        if (Getal < 11 && Getal > 0) {
            for (int teller = 1; teller < 11; teller++) {
                g.drawString(Getal + "x" + teller + "=" + (Getal*teller), xAxis, yAxis);
                yAxis += 20;
            }

        }
    }

class ActionOne implements ActionListener{

    public void actionPerformed(ActionEvent e) {

        Getal+=1;

        repaint();

    }

}

}
