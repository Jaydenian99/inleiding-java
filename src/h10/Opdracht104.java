package h10;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht104 extends Applet {

    //Declareren
    Label Lb, LbTwo;
    TextField Tekstvak;
    TextField TekstVakTwo;
    int Maand;
    int Jaartal;
    String s, sTwo, Tekst, TekstTwo;
    Button Enter, EnterTwo, Reset;

    public void init() {

        setBackground(Color.lightGray);

        //Initialiseren
        Lb = new Label("Type in een jaartaal ");
        add(Lb);
        LbTwo = new Label("Type in een maandnummer ");
        add(LbTwo);
        Tekstvak = new TextField("", 20);
        Tekstvak.addActionListener(new ActionOne());
        add(Tekstvak);
        Tekst = "";
        TekstVakTwo = new TextField("", 20);
        add(TekstVakTwo);
        TekstVakTwo.addActionListener(new ActionTwo());
        Enter = new Button("Is het een schrikkeljaar?");
        add(Enter);
        EnterTwo = new Button("Maandnaam en aantal dagen");
        add(EnterTwo);
        EnterTwo.addActionListener(new ActionOne());
        Enter.addActionListener(new ActionTwo());
        Reset = new Button("Reset");
        add(Reset);
        Reset.addActionListener(new ActionThree());


    }

    public void paint(Graphics g) {

        //Locatie van Labels en Tekstvak
        Lb.setLocation(20, 20);
        LbTwo.setLocation(20, 110);
        Tekstvak.setLocation(20, 140);
        TekstVakTwo.setLocation(20, 50);
        g.drawString(Tekst, 20, 180);
        if (TekstTwo != null)
            g.drawString(TekstTwo, 20, 90);
        Enter.setSize(200, 25);
        Enter.setLocation(200, 50);
        EnterTwo.setSize(200,25);
        EnterTwo.setLocation(200, 140);
        Reset.setSize(50, 25);
        Reset.setLocation(20, 200);

    }

class ActionOne implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            s = Tekstvak.getText();
            Maand = Integer.parseInt(s);
            //int YearInput = Integer.parseInt(String.valueOf(TekstVakTwo));

            //Maandnaam en aantal dagen
            switch (Maand) {

                case 1:
                    Tekst = "In Januari heb je 31 dagen";
                    break;
                case 2:
                    if ( (Jaartal % 4 == 0 && !(Jaartal % 100 == 0)) ||
                            Jaartal % 400 == 0 ) {
                        Tekst = "In Februari heb je 29 dagen";
                    } else {
                        Tekst = "In Februari heb je 28 dagen";
                    }
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

class ActionTwo implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        sTwo = TekstVakTwo.getText();
        Jaartal = Integer.parseInt(sTwo);
        if ((Jaartal % 4 == 0 && !(Jaartal % 100 == 0)) ||
                Jaartal % 400 == 0) {
            TekstTwo = "Het jaar " + Jaartal + " is een schrikkeljaar";
        } else {
            TekstTwo = "Het jaar " + Jaartal + " is geen schrikkeljaar";
        }
        repaint();

    }

}
class ActionThree implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Tekstvak.setText("");
        TekstVakTwo.setText("");

    }
}

}
