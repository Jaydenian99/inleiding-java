package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht10 extends Applet {

    //Declareren
    Label CijferIn, Types;
    String Getal, Tekst;
    TextField TekstVak;
    int GetalIn;
    Button Reset;

    public void init() {
    setBackground(Color.lightGray);

        //Initialiseren
        CijferIn = new Label("Typ uw cijfer in en druk op ''Enter'' om te bevestigen");
        add(CijferIn);
        Types = new Label("Is uw cijfer Slecht, Onvoldoende, Matig, Voldoende of Goed?");
        add(Types);
        TekstVak = new TextField("",3);
        add(TekstVak);
        TekstVak.addActionListener(new ActionOne());
        Reset = new Button("Reset");
        add(Reset);
        Reset.addActionListener(new ResetKnop());

    }

    public void paint(Graphics g) {

        CijferIn.setLocation(50, 50);
        TekstVak.setLocation(50, 75);
        Reset.setSize(75, 25);
        Reset.setLocation(50, 115);
        if (Tekst != null)
            g.drawString(Tekst, 100, 90);
        Types.setLocation(50, 25);

    }

class ActionOne implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Getal = TekstVak.getText();
        GetalIn = Integer.parseInt(Getal);
        switch (GetalIn) {
            case 1:
                Tekst = "Slecht";
                break;
            case 2:
                Tekst = "Slecht";
                break;
            case 3:
                Tekst = "Slecht";
                break;
            case 4:
                Tekst = "Onvoldoende";
                break;
            case 5:
                Tekst = "Matig";
                break;
            case 6:
                Tekst = "Voldoende";
                break;
            case 7:
                Tekst = "Voldoende";
                break;
            case 8:
                Tekst = "Goed";
                break;
            case 9:
                Tekst = "Goed";
                break;
            case 10:
                Tekst = "Goed";
                break;

        }
        if (GetalIn > 10) {
            Tekst = "Verkeerd cijfer ingevoerd";
        }
        if (GetalIn == 0) {
            Tekst = "Verkeerd cijfer ingevoerd";
        }
        repaint();

    }

}
class ResetKnop implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        TekstVak.setText("");
        repaint();
    }

}

}
