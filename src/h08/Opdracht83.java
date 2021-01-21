package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht83 extends Applet {

    //Declareren
        Button OkKnop;
        Button ResetKnop;
        TextField Tekstvak;
        Label Lb;

    //Doubles and Integers
        double Getal;
        double Btw;
        int xAxis;
        int Breedte;

    public void init() {

        setBackground(Color.LIGHT_GRAY);
        setSize(500,500);

        //OkKnop
            OkKnop = new Button("Ok");
            add(OkKnop);
            OkKnop.addActionListener(new ActionList());

        //Tekstvak
            Tekstvak = new TextField("");
            add(Tekstvak);
            Tekstvak.addActionListener(new ActionList());

        //Label
            Lb = new Label("");
            add(Lb);

        //BTW
            Btw = 1.21;

        //Integer For xAxis and Width
        xAxis = 40;
        Breedte = 75;

        //ResetKnop
        ResetKnop = new Button("Reset");
        add(ResetKnop);
        ResetKnop.addActionListener(new ResetList());

    }

    public void paint(Graphics g) {

        //OkKnop
            OkKnop.setSize(Breedte,25);
            OkKnop.setLocation(xAxis,20);

        //TekstVak
            Tekstvak.setSize(Breedte,25);
            Tekstvak.setLocation(xAxis, 60);
            g.drawString("€", 30, 75 );

        //Label
            Lb.setSize(Breedte, 15);
            Lb.setLocation(xAxis, 100);
            g.drawString("€", 30, 112);

            g.drawString("Het bedrag inclusief BTW is €" + Getal * Btw, xAxis, 140);

        //ResetKnop
            ResetKnop.setSize(Breedte, 25);
            ResetKnop.setLocation(140, 20);

    }

class ActionList implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        //Tekstvak en label
            String message = Tekstvak.getText();
            Lb.setText(message);
            Getal = Double.parseDouble(message);
            repaint();

    }

}

class ResetList implements ActionListener{

    public void actionPerformed(ActionEvent e) {

        //Tekstvak en label
        Tekstvak.setText("");
        Lb.setText("");

    }

}

}
