package com.task.swing;

import javax.swing.*;
import java.awt.*;

public class SmileyFaceSwing extends JPanel {

	private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Set the color for the face
		g.setColor(Color.YELLOW);
		// Draw face (circle)
		g.fillOval(50, 50, 200, 200);
 
		// Set the color for the eyes
		g.setColor(Color.BLACK);
		// Draw left eye
		g.fillOval(90, 100, 30, 30);
		// Draw right eye
		g.fillOval(180, 100, 30, 30);

		// Draw the mouth (smile)
		g.drawArc(100, 150, 100, 50, 0, -180);
	}

	public static void main(String[] args) {
		// Create a frame to display the smiley face
		JFrame frame = new JFrame("Smiley Face Emoji");
		SmileyFaceSwing panel = new SmileyFaceSwing();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.add(panel);
		frame.setVisible(true);
	}
}
