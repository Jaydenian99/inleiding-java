package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht122 extends Applet {

    Button[] Knopje = new Button[25];

    public void init() {

        for (int i = 0; i < Knopje.length; i++) {
            Knopje[i] = new Button("Knopje" + i);
            add(Knopje[i]);

        }

    }


    public void paint(Graphics g) {

        for (int i = 0; i < Knopje.length; i++)
            Knopje[i].setSize(75, 75);
        }

    }

