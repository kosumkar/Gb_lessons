package Gb_Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        setTitle("Calculator");
        setBounds(50, 50, 300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JTextField inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField, BorderLayout.CENTER);

        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(5, 3));

        add(top, BorderLayout.NORTH);
        add(bottom, BorderLayout.CENTER);

        DigitButtonListener digitButtonListener = new DigitButtonListener(inputField);
        CalcButtonListener calcButtonListener = new CalcButtonListener(inputField);

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(digitButtonListener);
            bottom.add(button);
        }

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();

                StringBuilder sb = new StringBuilder(inputField.getText());
                sb.append(button.getText());

                inputField.setText(sb.toString());
            }
        };

        JButton add = new JButton("+");
        add.addActionListener(actionListener);
        bottom.add(add);

        JButton minus = new JButton("-");
        minus.addActionListener(actionListener);
        bottom.add(minus);

        JButton multi = new JButton("*");
        multi.addActionListener(actionListener);
        bottom.add(multi);


        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(null);
            }
        });
        bottom.add(clear);


        JButton calc = new JButton("=");
        calc.addActionListener(calcButtonListener);
        bottom.add(calc);


        setVisible(true);

    }
}
