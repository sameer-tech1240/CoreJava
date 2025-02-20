package com.task.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTableGUI {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Multiplication Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Create input field for the number
        JTextField numberField = new JTextField(10);
        JLabel instructionLabel = new JLabel("Enter a number:");
        JButton generateButton = new JButton("Generate Table");
        JTextArea resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        // Add components to the frame
        frame.add(instructionLabel);
        frame.add(numberField);
        frame.add(generateButton);
        frame.add(scrollPane);

        // ActionListener for the button
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = numberField.getText();
                try {
                    int number = Integer.parseInt(input);
                    StringBuilder table = new StringBuilder();
                    for (int i = 1; i <= 10; i++) {
                        table.append(number).append(" x ").append(i).append(" = ").append(number * i).append("\n");
                    }
                    resultArea.setText(table.toString()); // Display the multiplication table
                } catch (NumberFormatException ex) {
                    resultArea.setText("Please enter a valid number."); // Error message for invalid input
                }
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
