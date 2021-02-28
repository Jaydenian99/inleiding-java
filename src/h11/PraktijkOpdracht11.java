package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class PraktijkOpdracht11 extends Applet {

    //Declareren
    Label Lb;
    Button Knopje;
    TextField Tekstvak;
    String Tekst;
    int Getal;
    boolean firstTime;

    public void init() {

        setBackground(Color.lightGray);

        //Initialiseren
        Lb = new Label("Typ hier uw cijfer in en klik op ''Ok''");
        add(Lb);
        Knopje = new Button("Ok");
        add(Knopje);
        Knopje.addActionListener(new ActionOne());
        Tekstvak = new TextField("", 5);
        add(Tekstvak);
        Tekstvak.addActionListener(new ActionOne());
        firstTime = true;

    }

    public void paint(Graphics g) {

        int xAxis = 50;
        int yAxis = 185;
        Lb.setLocation(50, 50);
        Tekstvak.setLocation(50, 85);
        Knopje.setLocation(50, 125);
        if (Getal < 10 && Getal > 0){
            for (int teller = 1; teller < 11; teller++){
                g.drawString(Getal + "x" + teller + "=" + (Getal*teller), xAxis, yAxis);
                yAxis +=20;
            }
        } else {
            if (!firstTime) g.drawString("Nummer is te hoog, kies tussen 1 en 10", xAxis, yAxis);
        }
    }

class ActionOne implements ActionListener{

    public void actionPerformed(ActionEvent e) {

        Tekst = Tekstvak.getText();
        Getal = Integer.parseInt(Tekst);
        firstTime = false;
        repaint();
    }
}

}
