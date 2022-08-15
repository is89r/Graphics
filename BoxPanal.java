import java.awt.Graphics;

import javax.swing.GrayFilter;
import javax.swing.JPanel;

import javafx.scene.paint.Color;
public class BoxPanal extends JPanel{

    public void paintComponent(Graphics pen){
        final int EDGE_LEFT = 175;
        final int EDGE_DOWN =  175; 
        final int BORDER1 = 10;
        final int  COLUMN_LEFT = EDGE_LEFT + BORDER1;
        final int COLUMN_TOP = EDGE_DOWN + BORDER1;
        final int COLUMN_RIGHT = COLUMN_LEFT + 130;
        
        pen.drawRect(EDGE_LEFT, EDGE_DOWN, 200, 200);
        pen.drawRect(COLUMN_LEFT, COLUMN_TOP, 50 ,  50);
        pen.drawRect(COLUMN_RIGHT, COLUMN_TOP , 50, 50);
        pen.drawRect(COLUMN_LEFT + 65, COLUMN_TOP + 90, 50, 100);
        pen.drawLine(175, 175,280, 50);
        pen.drawLine(375, 175, 280, 50);
    }
    
}
