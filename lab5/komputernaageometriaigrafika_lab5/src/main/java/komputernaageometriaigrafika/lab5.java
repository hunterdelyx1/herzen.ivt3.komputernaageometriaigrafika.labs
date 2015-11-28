package komputernaageometriaigrafika;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class lab5 extends JPanel{
    public JPanel contentPane;
    private JPanel canvasHolder;
    private JTextField nTextField;
    private JButton Button;
    private JCanvas jCanvas;

    public lab5() {
        jCanvas = new JCanvas();

        canvasHolder.add(jCanvas);
        Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int N = Integer.parseInt(nTextField.getText());

                    List<Double[]> dots = new ArrayList<Double[]>();
                    if(N>2) {
                        int da = 360/N;
                        if (da > 0) {
                            for (int a = 0; a <= 360; a += da) {
                                double rad_a = Math.toRadians(a);
                                double x = 100 * Math.cos(rad_a);
                                double y = 100 * Math.sin(rad_a);
                                dots.add(new Double[]{x, y, 1.0});
                            }

                            int[][] array = new int[dots.size()][];
                            for (int i = 0; i < dots.size(); i++)
                                array[i] = new int[]{dots.get(i)[0].intValue(), dots.get(i)[1].intValue(), dots.get(i)[2].intValue()};

                            jCanvas.setPoints(array);
                            jCanvas.repaint();
                        }
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
