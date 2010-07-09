package org.scode.bug_swingfocus;

import javax.swing.*;

/**
 */
public class TestFrame extends JFrame {
	public TestFrame() {
		LoggingListener l = new LoggingListener();

		JTextField tf = new JTextField();

		addWindowListener(l);
		tf.addCaretListener(l);
		tf.addFocusListener(l);
		tf.addMouseListener(l);

		add(tf);
	}
}
