package com.task.swing;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

@SuppressWarnings("removal")
public class CursorPositionApplet extends Applet {

	private static final long serialVersionUID = 1L;
	private int x = 0, y = 0;

	@Override
	public void init() {
		// Adding MouseMotionListener to detect mouse movement
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				repaint(); // Repaint the applet to update cursor position
			}
		});

		// Adding KeyListener to detect key events (any key press)
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// Get the key pressed and display in the applet
				String keyPressed = "Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode());
				System.out.println(keyPressed); // Output to console
			}
		});

		// Set the applet to be focusable to capture key events
		setFocusable(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		// Display the x and y position of the cursor
		g.drawString("Cursor Position - X: " + x + ", Y: " + y, 20, 20);
	}

	// Main method to run the applet as an application
	public static void main(String[] args) {
		JFrame frame = new JFrame("Cursor Position Applet");
		CursorPositionApplet applet = new CursorPositionApplet();

		frame.add(applet);
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		applet.init();
	}
}
