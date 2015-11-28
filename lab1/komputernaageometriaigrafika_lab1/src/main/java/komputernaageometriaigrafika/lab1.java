package komputernaageometriaigrafika;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab1 extends JDialog{
    private JTextField aTextField;
    private JTextField bTextField;
    private JButton calcButton;
    private JPanel contentPane;
    private JTextField textField1;

    public lab1() {
        setContentPane(contentPane);
        setModal(true);

        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int a = Integer.parseInt(aTextField.getText());
                    int b = Integer.parseInt(bTextField.getText());
                    textField1.setText(Integer.toString(a + b));
                } catch (Exception e){
                    textField1.setText("ERROR");
                }
            }
        });
    }

    public static void main(String[] arg){
        lab1 dialog = new lab1();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
