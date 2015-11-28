package komputernaageometriaigrafika;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class lab3 extends JPanel{
    JPanel contentPane;
    JPanel canvasHolder;
    private JButton button1;
    private JTextField aTextField;
    private JTextField bTextField;
    private JTextField cTextField;
    private JTextField xminField;
    private JTextField xmaxField;
    private JTextField yminField;
    private JTextField ymaxField;
    JCanvas jCanvas;

    public lab3() {
        jCanvas = new JCanvas();

        canvasHolder.add(jCanvas);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int A = Integer.parseInt(aTextField.getText());
                    int B = Integer.parseInt(bTextField.getText());
                    int C = Integer.parseInt(cTextField.getText());

                    int xmin = Integer.parseInt(xminField.getText());
                    int xmax = Integer.parseInt(xmaxField.getText());
                    int ymin = Integer.parseInt(yminField.getText());
                    int ymax = Integer.parseInt(ymaxField.getText());

                    List<Integer[]> dots = new ArrayList<Integer[]>();
                    int x = xmin;
                    int y = A*x*x+B*x+C;
                    while(x<=xmax){
                        int tmp_y = A*(x+1)*(x+1)+B*(x+1)+C;
                        if(y<ymax && y>ymin) dots.add(new Integer[]{x, y,(tmp_y<ymax && tmp_y>ymin)? 1 : 0});

                        y = tmp_y;
                        x++;
                    }

                    int[][] array = new int[dots.size()][];
                    for(int i = 0; i < dots.size(); i++) array[i] = new int[]{dots.get(i)[0], dots.get(i)[1], dots.get(i)[2]};

                    jCanvas.setPoints(array);
                    jCanvas.repaint();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}