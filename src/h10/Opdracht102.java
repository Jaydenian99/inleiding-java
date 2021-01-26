package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.temporal.ValueRange;

public class Opdracht102 extends Applet {

    //Textfields and labels
    TextField TekstVak;
    Label Lb;

    //Strings and doubles
    String Text; //null
    double NummerInput;
    double lNummer = Double.MAX_VALUE;

    public void init() {
        setBackground(Color.lightGray);
        TekstVak = new TextField("", 10);
        add(TekstVak);
        TekstVak.addActionListener(new ActionOne());
        Lb = new Label("Tik in uw getal");
        add(Lb);
    }

    public void paint(Graphics g) {
        TekstVak.setLocation(20, 40);
        Lb.setLocation(20, 10);
        if (Text != null) {
            g.drawString(Text, 20, 90);
        }
    }

    class ActionOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message;
            message = TekstVak.getText();
            NummerInput = Double.parseDouble(message);
            if (NummerInput < lNummer ) {
                lNummer = NummerInput;
                Text = "Je laagste nummer is " + lNummer;
                repaint();
            }
        }
    }
}
