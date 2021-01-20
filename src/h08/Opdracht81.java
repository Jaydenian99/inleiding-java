package h08;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht81 extends Applet {

    //Declareren
    Button OkKnop;
    Button ResetKnop;
    TextField Tekstvak;
    Label Sticker;

    public void init() {

        setBackground(Color.pink);


        //Initialiseren
        OkKnop = new Button("Ok");
        Tekstvak = new TextField("", 30);
        ResetKnop = new Button("Reset");
        Sticker = new Label("Ik ben een label");
        add(Sticker);
        add(ResetKnop);
        add(OkKnop);
        add(Tekstvak);

        OkKnop.addActionListener(new Action());
        ResetKnop.addActionListener(new Reset());

    }

    public void paint(Graphics g) {


        //OkKnop
        OkKnop.setSize(40, 25);
        OkKnop.setLocation(80, 100);

        //Reset Knop
        ResetKnop.setSize(40, 25);
        ResetKnop.setLocation(160, 100);

        //Textfield
        Tekstvak.setLocation(20, 60);

        //Label
        Sticker.setLocation(20, 140);

    }

class Action implements ActionListener {


    public void actionPerformed(ActionEvent e) {

        String message = Tekstvak.getText();
        Sticker.setText(message);


    }
}

class Reset implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Sticker.setText("");
        Tekstvak.setText("");

    }
}
}
