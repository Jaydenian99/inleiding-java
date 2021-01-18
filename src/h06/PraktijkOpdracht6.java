package h06;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht6 extends Applet {

    //Gemiddelde cijfers
    double FiveNine;
    double SixThree;
    double SixNine;
    double UitkomstBijElkaarOpgeteld;
    double UitKomstGemiddeld;

    //Int to convert
    double ToConvert1;

    //Double to convert back
    double ToConvertBack;

    //Int to divide
    int Divide;

    //Int to multiply and divide
    int MultiVide;

    //One more
    double AverageTimesTen;

    //Zeros
    int Zero;

    //Voor hele getal
    double random;

    public void init() {

        setSize(500, 500);
        setBackground(Color.darkGray);
        FiveNine = 5.9;
        SixThree = 6.3;
        SixNine = 6.9;
        Divide = 3;
        Zero = 0;
        UitkomstBijElkaarOpgeteld = FiveNine + SixThree + SixNine;
        UitKomstGemiddeld = UitkomstBijElkaarOpgeteld / Divide;
        MultiVide = 10;
        AverageTimesTen = UitKomstGemiddeld * MultiVide;
        ToConvert1 = AverageTimesTen + Zero;
        ToConvertBack = ToConvert1 / MultiVide;
        random = 0.066666666666667;
        ToConvertBack = UitKomstGemiddeld - random;



    }

    public void paint(Graphics g) {

        g.setColor(Color.white);
        g.drawString("Een cursist heeft drie cijfers behaald: 5,9; 6.3; 6,9.", 50, 30);
        g.drawString("Hij wilt weten wat zijn gemiddelde cijfer is. ", 50, 50);
        g.drawString("Het gemiddelde is: " + ToConvertBack, 50, 70);


    }
}
