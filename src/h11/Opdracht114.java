package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht114 extends Applet {
    int teller;
    int drie;
    Label Lb;

    public void init() {
        setBackground(Color.lightGray);

        drie = 3;
        for (teller = 1; teller < 11; teller++) {
           Lb = new Label(drie + "x" + teller + "=" + (drie*teller));
           add(Lb);

        }

    }

    public void paint(Graphics g) {



        }
    }


