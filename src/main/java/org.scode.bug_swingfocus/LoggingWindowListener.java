package org.scode.bug_swingfocus;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 */
public class LoggingWindowListener implements WindowListener {
	private void log(WindowEvent e) {
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
}
