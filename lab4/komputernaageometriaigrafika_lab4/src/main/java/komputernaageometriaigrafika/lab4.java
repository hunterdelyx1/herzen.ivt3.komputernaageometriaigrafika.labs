package komputernaageometriaigrafika;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class lab4 extends JPanel{
    public JPanel contentPane;
    private JPanel canvasHolder;
    private JButton button1;
    private JTextField v0TextField;
    private JTextField aTextField;
    private JTextField nTextField;
    private JCanvas jCanvas;

    public lab4() {
        jCanvas = new JCanvas();

        canvasHolder.add(jCanvas);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int V0   =  Integer.parseInt(v0TextField.getText());
                    Double a = Double.parseDouble(aTextField.getText());
                    int N    =   Integer.parseInt(nTextField.getText());

                    Double Vx = V0*Math.cos(Math.toRadians(a));
                    Double Vy = V0*Math.sin(Math.toRadians(a));

                    Double tn = Vy/5;
                    Double dt = tn/N;
                    Double x = 0.0;
                    Double y = 0.0;

                    List<Double[]> dots = new ArrayList<Double[]>();
                    dots.add(new Double[]{x,y, 1.0});
                    for(Double t = 0.0; t<=tn+dt; t+=dt){
                        x += Vx*dt;
                        y += Vy*dt;

                        Vy=Vy-10*dt;
                        dots.add(new Double[]{x,y, 1.0});
                    }

                    int[][] array = new int[dots.size()][];
                    for(int i = 0; i < dots.size(); i++) array[i] = new int[]{dots.get(i)[0].intValue(), dots.get(i)[1].intValue(), dots.get(i)[2].intValue()};

                    jCanvas.setPoints(array);
                    jCanvas.repaint();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
