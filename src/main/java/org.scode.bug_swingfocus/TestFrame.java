package org.scode.bug_swingfocus;

import javax.swing.*;

/**
 */
public class TestFrame extends JFrame {
	public TestFrame() {
		addWindowListener(new LoggingWindowListener());
		JTextField tf = new JTextField();
		add(tf);
	}
}
