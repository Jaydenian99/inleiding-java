package h06;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht6 extends Applet {

    //Gemiddelde cijfers
    double FiveNine;
    double SixThree;
    double SixNine;

    //Uitkomstgemiddeld om te vermenigvuldigen
    double UitKomstGemiddeld;

    //To convert for answer
    double ToConvert1;

    public void init() {

        setSize(500, 500);
        setBackground(Color.darkGray);
        FiveNine = 5.8;
        SixThree = 6.3;
        SixNine = 6.9;

        UitKomstGemiddeld = (FiveNine + SixThree + SixNine) / 3;
        ToConvert1 = Math.round(UitKomstGemiddeld * 10 ) / 10.0;




    }

    public void paint(Graphics g) {

        g.setColor(Color.white);
        g.drawString("Een cursist heeft drie cijfers behaald: 5,9; 6.3; 6,9.", 50, 30);
        g.drawString("Hij wilt weten wat zijn gemiddelde cijfer is. ", 50, 50);
        g.drawString("Het gemiddelde is: " + ToConvert1, 50, 70);


    }
}
