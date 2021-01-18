package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht62 extends Applet {

    //Doubles for Seconds and amount of minutes in Hour, Day and Year
        double Seconds, Hour, Day, Year;
        double UitkomstOne;
        double UitkomstTwo;
        double UitkomstThree;
        double UitkomstFour;

    //Integer for x Axis
    int xAxis;

    public void init() {

        setSize(500, 500);
        setBackground(Color.darkGray);

        Seconds = 60;
        Hour = 60;
        Day = 24;
        Year = 365;
        UitkomstOne = Seconds * Hour;
        UitkomstTwo = UitkomstOne * Day;
        UitkomstThree = UitkomstTwo * Year;
        UitkomstFour = UitkomstOne + UitkomstTwo + UitkomstThree;
        xAxis = 50;


    }

    public void paint(Graphics g) {

        g.setColor(Color.white);
        g.drawString("The amount of seconds that you have in an hour is: " + UitkomstOne, xAxis, 50);
        g.setColor(Color.yellow);
        g.drawString("The amount of seconds that you have in one day is: " + UitkomstTwo, xAxis, 70);
        g.setColor(Color.MAGENTA);
        g.drawString("The amount of seconds that you have in one year is: " + UitkomstThree, xAxis, 90);
        g.setColor(Color.pink);
        g.drawString("The amount of seconds that you have in one hour, one day and one year counted together is: " + UitkomstFour, xAxis, 110);
    }

}
