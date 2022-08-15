import java.awt.Color;

import javax.swing.Box;
import javax.swing.JFrame;

/**
 * Shapes
 */
public class Shapes {
    public static void main(String[] args) {
        JFrame aFram = new JFrame();
        aFram.setBackground(Color.ORANGE);
        aFram.setSize(600,500);
        aFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aFram.setTitle("A House");


        BoxPanal box = new BoxPanal();
        aFram.add(box);
        aFram.setVisible(true);
    }
}