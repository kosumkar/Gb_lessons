package Gb_Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonListener implements ActionListener {
    private final JTextField textField;

    public CalcButtonListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (textField.getText().indexOf('*') != -1) {

            String[] values = textField.getText().split("\\*");
            int sum = Integer.parseInt(values[0]);

            for (int i = 1; i < values.length; i++) {
                sum *= Integer.parseInt(values[1]);
            }
            textField.setText(String.valueOf(sum));
      }

        if (textField.getText().indexOf('-') == -1) {
            String[] values = textField.getText().split("\\+");
            int sum = Integer.parseInt(values[0]);

            for (int i = 1; i < values.length; i++) {
                sum += Integer.parseInt(values[1]);
            }
            textField.setText(String.valueOf(sum));

        } else {

            String[] values = textField.getText().split("-");
            int sum = Integer.parseInt(values[0]);
            for (int i = 1; i < values.length; i++) {
                sum -= Integer.parseInt(values[1]);
            }
            textField.setText(String.valueOf(sum));

        }

    }
}
