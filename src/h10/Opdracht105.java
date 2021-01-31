package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht105 extends Applet {

    //Declareren
    Label Nederlands, Engels, Wiskunde, Gemiddeld;
    Button VolOnvOne, VolOnvTwo, VolOnvThree;
    Button Gemiddelde, Reset;
    TextField TekstVakOne, TekstVakTwo, TekstVakThree, GemiddeldTekstVak;
    String VoOne;
    String VoTwo;
    String VoThree;
    String TextOne;
    String TextTwo;
    String TextThree;
    String TextFour;
    double G;
    double NedGetal, EngGetal, WiskGetal, UitkomstGemiddeld;

    public void init() {

        setBackground(Color.lightGray);

        //Initialiseren
        Nederlands = new Label("Nederlands");
        add(Nederlands);
        Engels = new Label("Engels");
        add(Engels);
        Wiskunde = new Label("Wiskunde");
        add(Wiskunde);
        VolOnvOne = new Button("V/O");
        add(VolOnvOne);
        VolOnvTwo = new Button("V/O");
        add(VolOnvTwo);
        VolOnvThree = new Button("V/O");
        add(VolOnvThree);
        Gemiddelde = new Button("Berekenen");
        add(Gemiddelde);
        TekstVakOne = new TextField("", 3);
        add(TekstVakOne);
        TekstVakTwo = new TextField("", 3);
        add(TekstVakTwo);
        TekstVakThree = new TextField("", 3);
        add(TekstVakThree);
        Gemiddeld = new Label("Gemiddelde");
        add(Gemiddeld);
        GemiddeldTekstVak = new TextField("", 3);
        add(GemiddeldTekstVak);
        Reset =  new Button("Reset");
        add(Reset);
        Reset.addActionListener(new Reset());
        VolOnvOne.addActionListener(new ActionOne());
        VolOnvTwo.addActionListener(new ActionTwo());
        VolOnvThree.addActionListener(new ActionThree());
        Gemiddelde.addActionListener(new ActionFour());


    }

    public void paint(Graphics g) {

        //Labels
        Nederlands.setSize(75, 25);
        Nederlands.setLocation(25, 25);
        Engels.setSize(75, 25);
        Engels.setLocation(25, 50);
        Wiskunde.setSize(75, 25);
        Wiskunde.setLocation(25, 75);
        Gemiddeld.setSize(75, 25);
        Gemiddeld.setLocation(25, 150);

        //TekstVakken
        TekstVakOne.setLocation(100, 25);
        TekstVakTwo.setLocation(100, 50);
        TekstVakThree.setLocation(100, 75);
        GemiddeldTekstVak.setLocation(100, 150);

        //Buttons
        VolOnvOne.setLocation(155, 25);
        VolOnvTwo.setLocation(155, 50);
        VolOnvThree.setLocation(155, 75);
        Gemiddelde.setLocation(100, 115);
        Reset.setLocation(180, 115);

        //Strings
        if (TextOne != null)
            g.drawString(TextOne, 200, 40);
        if (TextTwo != null)
            g.drawString(TextTwo, 200, 64);
        if (TextThree != null)
            g.drawString(TextThree, 200, 88);
        if (TextFour != null)
            g.drawString(TextFour, 150, 165);

    }

class ActionOne implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        //System.out.println("KLIK");
        VoOne = TekstVakOne.getText();
        NedGetal = Double.parseDouble(VoOne);
        if (NedGetal > 5.5) {
            TextOne = "Voldoende";
        } else {
            TextOne = "Onvoldoende";
        }
        repaint();

    }

}

class ActionTwo implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        VoTwo = TekstVakTwo.getText();
        EngGetal = Double.parseDouble(VoTwo);
        if (EngGetal > 5.5) {
            TextTwo = "Voldoende";
        } else {
            TextTwo = "Onvoldoende";
        }
        repaint();
    }

}
class ActionThree implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        VoThree = TekstVakThree.getText();
        WiskGetal = Double.parseDouble(VoThree);
        if (WiskGetal > 5.5) {
            TextThree = "Voldoende";
        } else {
            TextThree = "Onvoldoende";
        }
        repaint();
    }

}

class ActionFour implements ActionListener {

    public void actionPerformed(ActionEvent e) {


        UitkomstGemiddeld = (NedGetal + EngGetal + WiskGetal) / 3;
        G = UitkomstGemiddeld;
        GemiddeldTekstVak.setText(String.valueOf(G));
        if (UitkomstGemiddeld > 5.5) {
            TextFour = "Je bent geslaagd";
        } else {
            TextFour = "Je bent niet geslaagd";
        }
        repaint();
    }

}

class Reset implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        TekstVakOne.setText("");
        TekstVakTwo.setText("");
        TekstVakThree.setText("");
        GemiddeldTekstVak.setText("");
        TextOne = "";
        TextTwo = "";
        TextThree = "";
        TextFour = "";
        repaint();

    }
}

}
