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
        points = new int[][]{{20,150},{0,0},{150 ,40}};
        setPreferredSize(new Dimension(size[0],size[1]));
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.translate(size[0]/2, size[1]/2);
        graphics.drawLine(size[0], 0, -size[0], 0);
        graphics.drawLine(0, size[1], 0, -size[1]);
        /*
        int i;
        for(i=0; i<points.length-1; i++){
            graphics.drawLine(points[i][0], points[i][1], points[i+1][0], points[i+1][1]);
            System.out.println("graphics.drawLine(points["+i+"][0], points["+i+"][1], points["+i+"+1][0], points["+i+"+1][1]);");
        }*/

        graphics.setColor(new Color(0, 0, 0));
        graphics.drawLine(-points[0][0], -points[0][1], -points[1][0], -points[1][1]);
        graphics.setColor(new Color(255, 0, 0));
        graphics.drawLine(-points[1][0], -points[1][1], -points[2][0], -points[2][1]);
        graphics.setColor(new Color(0, 0, 255));
        graphics.drawLine(-points[0][0], -points[0][1], -points[points.length-1][0], -points[points.length-1][1]);
    }
}
