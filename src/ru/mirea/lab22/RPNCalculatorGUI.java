package ru.mirea.lab22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
// 1 1 + vivod: 2 rabotaet
public class RPNCalculatorGUI extends JFrame {

    private JTextField inputField;
    private JTextArea resultArea;
    private Stack<Double> stack;

    public RPNCalculatorGUI() {
        stack = new Stack<>();

        setTitle("RPN Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);

        inputField = new JTextField();
        resultArea = new JTextArea();
        resultArea.setEditable(false);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });

        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.add(inputField);
        panel.add(calculateButton);
        panel.add(resultArea);

        getContentPane().add(panel);
    }

    private void calculate() {
        String expression = inputField.getText();
        try {
            double result = evaluateRPN(expression);
            resultArea.setText("Result: " + result);
        } catch (Exception ex) {
            resultArea.setText("Error: " + ex.getMessage());
        }
    }

    private double evaluateRPN(String expression) {
        String[] tokens = expression.split("\\s+");
        stack.clear();

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Not enough operands for operator: " + token);
                }

                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(token, operand1, operand2);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Invalid token: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression: " + expression);
        }

        return stack.pop();
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private boolean isOperator(String str) {
        return str.matches("[+\\-*/]");
    }

    private double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RPNCalculatorGUI().setVisible(true);
            }
        });
    }
}

