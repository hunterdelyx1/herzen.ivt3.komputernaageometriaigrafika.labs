package komputernaageometriaigrafika;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab2 extends JPanel{
    JPanel contentPane;
    JPanel canvas;
    JCanvas jCanvas;
    private JButton button1;
    private JTextField x1TextField;
    private JTextField y1TextField;
    private JTextField x2TextField;
    private JTextField y2TextField;
    private JTextField x3TextField;
    private JTextField y3TextField;

    public lab2() {
        jCanvas = new JCanvas();

        canvas.add(jCanvas);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int[][] tmp = {
                            {Integer.parseInt(x1TextField.getText()), Integer.parseInt(y1TextField.getText())},
                            {Integer.parseInt(x2TextField.getText()), Integer.parseInt(y2TextField.getText())},
                            {Integer.parseInt(x3TextField.getText()), Integer.parseInt(y3TextField.getText())}};

                    jCanvas.setPoints(tmp);
                    jCanvas.repaint();
                } catch (Exception e){}
            }
        });
    }
}