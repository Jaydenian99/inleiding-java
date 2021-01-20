package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht82 extends Applet {

        int counter;

        //Declare
        Button Male;
        Label LbMale;

        Button Female;
        Label LbFemale;

        Button PotMale;
        Label LbPotMale;

        Button PotFemale;
        Label LbPotFemale;

    public void init() {

        setBackground(Color.darkGray);


        //Buttons
        Male = new Button("Male");
        Female = new Button("Female");
        PotMale = new Button("Potential Male");
        PotFemale = new Button("Potential Female");
        add(Male);
        add(Female);
        add(PotMale);
        add(PotFemale);
        Male.addActionListener(new ButtonOne());
        Female.addActionListener(new ButtonTwo());
        PotMale.addActionListener(new ButtonThree());
        PotFemale.addActionListener(new ButtonFour());
        //Labels
        LbMale = new Label(String.valueOf(counter));
        LbFemale = new Label(String.valueOf(counter));
        LbPotMale = new Label(String.valueOf(counter));
        LbPotFemale = new Label(String.valueOf(counter));
        add(LbMale);
        add(LbFemale);
        add(LbPotMale);
        add(LbPotFemale);



    }

    public void paint(Graphics g) {

        //Buttons
        Male.setSize(100, 50);
        Male.setLocation(20, 20);
        Female.setSize(100, 50);
        Female.setLocation(20, 80);
        PotMale.setSize(100, 50);
        PotMale.setLocation(20, 140);
        PotFemale.setSize(100, 50);
        PotFemale.setLocation(20, 200);

        //Labels
        LbMale.setLocation(150, 30);
        LbFemale.setLocation(150, 90);
        LbPotMale.setLocation(150, 150);
        LbPotFemale.setLocation(150, 210);

    }

class ButtonOne implements ActionListener {
    int counter = 1;

    public void actionPerformed(ActionEvent e) {

        LbMale.setText(String.valueOf(counter));
        counter++;



    }
}

class ButtonTwo implements ActionListener {
    int counter = 1;

    public void actionPerformed(ActionEvent e) {

        LbFemale.setText(String.valueOf(counter));
        counter++;

    }
}

class ButtonThree implements ActionListener {
    int counter = 1;

    public void actionPerformed(ActionEvent e) {

        LbPotMale.setText(String.valueOf(counter));
        counter++;

    }
}

class ButtonFour implements ActionListener {
    int counter = 1;

    public void actionPerformed(ActionEvent e) {

        LbPotFemale.setText(String.valueOf(counter));
        counter++;

    }
}


}
