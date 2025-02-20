package com.task.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeDetails {

    public static void main(String[] args) {
        // Create the first frame for input
        JFrame inputFrame = new JFrame("Enter Employee Details");
        inputFrame.setSize(300, 200);
        inputFrame.setLayout(new GridLayout(4, 2));
        inputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create labels and text fields for employee details
        JLabel lblEno = new JLabel("Employee No:");
        JTextField txtEno = new JTextField();
        
        JLabel lblEName = new JLabel("Employee Name:");
        JTextField txtEName = new JTextField();
        
        JLabel lblSal = new JLabel("Salary:");
        JTextField txtSal = new JTextField();
        
        JButton btnSubmit = new JButton("Submit");

        // Add components to the input frame
        inputFrame.add(lblEno);
        inputFrame.add(txtEno);
        inputFrame.add(lblEName);
        inputFrame.add(txtEName);
        inputFrame.add(lblSal);
        inputFrame.add(txtSal);
        inputFrame.add(btnSubmit);

        // Action Listener for the Submit button
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve user input
                String eno = txtEno.getText();
                String eName = txtEName.getText();
                String salary = txtSal.getText();

                // Create the second frame to display employee details
                JFrame displayFrame = new JFrame("Employee Details");
                displayFrame.setSize(300, 150);
                displayFrame.setLayout(new GridLayout(3, 1));

                // Create labels for displaying the details
                JLabel displayEno = new JLabel("Employee No: " + eno);
                JLabel displayEName = new JLabel("Employee Name: " + eName);
                JLabel displaySal = new JLabel("Salary: " + salary);

                // Add components to the display frame
                displayFrame.add(displayEno);
                displayFrame.add(displayEName);
                displayFrame.add(displaySal);

                // Set the display frame to be visible
                displayFrame.setVisible(true);
            }
        });

        // Set the input frame to be visible
        inputFrame.setVisible(true);
    }
}
