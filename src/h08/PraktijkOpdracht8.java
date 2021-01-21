package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht8 extends Applet {

    //Buttons
    Button Multiply;
    Button Divide;
    Button Addition;
    Button Subtraction;
    Button Reset;

    //TextFields
    TextField First;
    TextField Second;

    //Integers and Doubles
    int W;
    int H;
    int yAxis;
    double GetalOne;
    double GetalTwo;

    public void init() {

        setBackground(Color.LIGHT_GRAY);

        //Buttons
            Multiply = new Button("x");
            Multiply.addActionListener(new ActionOne());

            Divide = new Button("/");
            Divide.addActionListener(new ActionTwo());

            Addition = new Button("+");
            Addition.addActionListener(new ActionThree());

            Subtraction = new Button("-");
            Subtraction.addActionListener(new ActionFour());

            Reset = new Button("Reset");
            Reset.addActionListener(new ResetKnop());

            add(Multiply);
            add(Divide);
            add(Addition);
            add(Subtraction);
            add(Reset);

        //TextFields
            First = new TextField("");
            Second = new TextField("");
            add(First);
            add(Second);

        //Integers and Doubles value
            W = 50;
            H = 25;
            yAxis = 50;

    }

    public void paint(Graphics g) {

        //TextFields
            First.setSize(W, H);
            First.setLocation(20, yAxis);

            Second.setSize(W, H);
            Second.setLocation(80, yAxis);

        //Buttons
            Multiply.setLocation(140, yAxis);
            Multiply.setSize(25, 25);

            Divide.setLocation(170, yAxis);
            Divide.setSize(25, 25);

            Addition.setLocation(200, yAxis);
            Addition.setSize(25, 25);

            Subtraction.setLocation(230, yAxis);
            Subtraction.setSize(25, 25);

            Reset.setSize(50,25);
            Reset.setLocation(20, 80);

    }

class ActionOne implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        String messageOne = First.getText();
        String messageTwo = Second.getText();
        GetalOne = Double.parseDouble(messageOne);
        GetalTwo = Double.parseDouble(messageTwo);
        First.setText(String.valueOf(GetalOne * GetalTwo));
        Second.setText("");

    }

}

class ActionTwo implements ActionListener{

    public void actionPerformed(ActionEvent e) {

        String messageOne = First.getText();
        String messageTwo = Second.getText();
        GetalOne = Double.parseDouble(messageOne);
        GetalTwo = Double.parseDouble(messageTwo);
        First.setText(String.valueOf(GetalOne / GetalTwo));
        Second.setText("");

    }

}

class ActionThree implements ActionListener{

    public void actionPerformed(ActionEvent e) {

        String messageOne = First.getText();
        String messageTwo = Second.getText();
        GetalOne = Double.parseDouble(messageOne);
        GetalTwo = Double.parseDouble(messageTwo);
        First.setText(String.valueOf(GetalOne + GetalTwo));
        Second.setText("");

    }

}

class ActionFour implements ActionListener{

    public void actionPerformed(ActionEvent e) {

        String messageOne = First.getText();
        String messageTwo = Second.getText();
        GetalOne = Double.parseDouble(messageOne);
        GetalTwo = Double.parseDouble(messageTwo);
        First.setText(String.valueOf(GetalOne - GetalTwo));
        Second.setText("");

    }

}

class ResetKnop implements ActionListener{

    public void actionPerformed(ActionEvent e) {

        First.setText("");
        Second.setText("");

    }
}

}
