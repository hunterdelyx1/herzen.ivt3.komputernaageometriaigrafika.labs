package komputernaageometriaigrafika;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.util.Arrays;

public class lab6 extends JPanel{
    public JPanel contentPane;
    private JPanel canvasHolder;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton Button;
    private JTextField textField5;
    private JCanvas jCanvas;

    private int form[][] = new int[][]{{0, 0, 1}, {40, 100, 1}, {80, 0, 1}, {0, 50, 1}, {80, 50, 1}, {0, 0, 1},
                                                  {0, 50, 1}, {40, 100, 1}, {80, 50, 1}, {80, 0, 1}, {0, 0, 1}};

    private int[][] multiply_matrices(int[][] m1, Double[][] m2){
        int[][] result = new int[m1.length][3];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m2.length; k++) {
                    result[i][j] += (double)m1[i][k] * m2[k][j];
                }
            }
            result[i][2] = 1;
        }

        return result;
    }

    public lab6() {
        jCanvas = new JCanvas();
        canvasHolder.add(jCanvas);

        jCanvas.setPoints(form);
        jCanvas.repaint();

        Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    Double angle = Double.parseDouble(textField5.getText());

                    Double[][] rotateMatrix = new Double[][]{{ Math.cos(Math.toRadians(angle)), Math.sin(Math.toRadians(angle))},
                            {-Math.sin(Math.toRadians(angle)), Math.cos(Math.toRadians(angle))}};

                    Double[][] ordMatrix = new Double[][]{{Double.parseDouble(textField1.getText()), Double.parseDouble(textField2.getText())},
                            {Double.parseDouble(textField3.getText()), Double.parseDouble(textField4.getText())}};

                    int[][] new_form = multiply_matrices(form, ordMatrix);
                    new_form = multiply_matrices(new_form, rotateMatrix);

                    jCanvas.setPoints(new_form);
                    jCanvas.repaint();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
