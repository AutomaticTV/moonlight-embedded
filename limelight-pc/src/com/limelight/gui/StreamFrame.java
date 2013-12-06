package com.limelight.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class StreamFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public void build() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(1280,720);
		//This might break if the screen res is too small...not sure though
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		this.setVisible(true);
	}
}
