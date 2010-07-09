package org.scode.bug_swingfocus;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.*;

/**
 */
public class LoggingListener implements WindowListener, CaretListener, FocusListener, MouseListener {
	private void log(Object e) {
		System.out.println(e.toString());
	}

	public void windowOpened(WindowEvent e) {
		log(e);
	}

	public void windowClosing(WindowEvent e) {
		log(e);
	}

	public void windowClosed(WindowEvent e) {
		log(e);
	}

	public void windowIconified(WindowEvent e) {
		log(e);
	}

	public void windowDeiconified(WindowEvent e) {
		log(e);
	}

	public void windowActivated(WindowEvent e) {
		log(e);
	}

	public void windowDeactivated(WindowEvent e) {
		log(e);
	}

	public void focusGained(FocusEvent e) {
		log(e);
	}

	public void focusLost(FocusEvent e) {
		log(e);
	}

	public void caretUpdate(CaretEvent e) {
		log(e);
	}

	public void mousePressed(MouseEvent e) {
		log(e);
	}

	public void mouseReleased(MouseEvent e) {
		log(e);
	}

	public void mouseClicked(MouseEvent e) {
		log(e);
	}

	public void mouseEntered(MouseEvent e) {
		log(e);
	}

	public void mouseExited(MouseEvent e) {
		log(e);
	}
}
