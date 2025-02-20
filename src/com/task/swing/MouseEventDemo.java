package com.task.swing;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MouseEventDemo extends JFrame implements MouseMotionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

    // Constructor to set up the UI
    public MouseEventDemo() {
        // Create a TextField to display the mouse click position
        textField = new JTextField(20);
        textField.setEditable(false);
        
        // Add the TextField to the frame
        add(textField, BorderLayout.SOUTH);
        
        // Add mouse listeners to the frame
        addMouseListener(this);
        addMouseMotionListener(this);

        // Frame settings
        setTitle("Mouse Event Handler");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Method for handling mouse click events
    @Override
    public void mouseClicked(MouseEvent e) {
        textField.setText("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    // Method for handling mouse moved events
    @Override
    public void mouseMoved(MouseEvent e) {
        textField.setText("Mouse Moved at: (" + e.getX() + ", " + e.getY() + ")");
    }

    // Unused mouse event methods (required by interfaces)
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseDragged(MouseEvent e) {}

    // Main method to run the program
    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
