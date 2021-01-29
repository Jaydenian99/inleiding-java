package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht103 extends Applet {

    //Declareren
    Label Lb;
    TextField Tekstvak;
    int Maand;
    String S, Tekst;

    public void init() {

     setBackground(Color.lightGray);

        //Initialiseren
        Lb = new Label("Type hier een maandnummer in ");
        add(Lb);
        Tekstvak = new TextField("", 20);
        Tekstvak.addActionListener(new ActionOne());
        add(Tekstvak);
        Tekst = "";


    }

    public void paint(Graphics g) {

        //Locatie van Labels en Tekstvak
        Lb.setLocation(20, 20);
        Tekstvak.setLocation(20, 50);
        g.drawString(Tekst, 20, 100);

    }

class ActionOne implements ActionListener{

    public void actionPerformed(ActionEvent e) {

        S = Tekstvak.getText();
        Maand = Integer.parseInt(S);

        //Maandnaam en aantal dagen
            switch (Maand) {

                case 1:
                    Tekst = "In Januari heb je 31 dagen";
                    break;
                case 2:
                    Tekst = "In Februari heb je 28/29 dagen";
                    break;
                case 3:
                    Tekst = "In Maart heb je 31 dagen";
                    break;
                case 4:
                    Tekst = "In April heb je 30 dagen";
                    break;
                case 5:
                    Tekst = "In Mei heb je 31 dagen";
                    break;
                case 6:
                    Tekst = "In Juni heb je 30 dagen";
                    break;
                case 7:
                    Tekst = "In Juli heb je 31 dagen";
                    break;
                case 8:
                    Tekst = "In Augustus heb je 31 dagen";
                    break;
                case 9:
                    Tekst = "In September heb je 30 dagen";
                    break;
                case 10:
                    Tekst = "In Oktober heb je 31 dagen";
                    break;
                case 11:
                    Tekst = "In November heb je 30 dagen";
                    break;
                case 12:
                    Tekst = "In December heb je 31 dagen";
                    break;

            }
            repaint();
    }
}

}
