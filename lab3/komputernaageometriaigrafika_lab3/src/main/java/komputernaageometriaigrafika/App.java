package komputernaageometriaigrafika;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    public App(String name) {
        super(name);
        setResizable(false);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = this.getContentPane();

        lab3 lab3 = new lab3();

        pane.add(lab3.contentPane, BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new App("avk-lab-3");
    }
}