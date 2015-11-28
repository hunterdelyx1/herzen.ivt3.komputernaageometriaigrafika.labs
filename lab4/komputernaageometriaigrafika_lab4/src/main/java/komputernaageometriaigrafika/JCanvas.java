package komputernaageometriaigrafika;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JCanvas extends JPanel{
    int[][] points;
    int[] size = {300, 300};

    public void setPoints(int[][] points) {
        this.points = points;
    }

    public JCanvas() {
        this.setBackground(new Color(255,255,255));
        points = new int[][]{};
        setPreferredSize(new Dimension(size[0],size[1]));
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        //graphics.translate(size[0]/2, size[1]/2);
        graphics.translate(0, size[1]);
        graphics.drawLine(size[0], 0, -size[0], 0);
        graphics.drawLine(0, size[1], 0, -size[1]);
        for(int i=0; i<points.length-1; i++){
            if(points[i][2]!=0) graphics.drawLine(points[i][0], -points[i][1], points[i+1][0], -points[i+1][1]);
        }
    }
}
