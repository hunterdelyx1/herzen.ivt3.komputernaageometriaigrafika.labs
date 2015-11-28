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

        lab4 lab4 = new lab4();

        pane.add(lab4.contentPane, BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new App("avk-lab-3");
    }
}