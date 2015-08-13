package com.smarcotte.jframe_demo;

import javax.swing.JFrame;

public class Launcher
{

	public static void main(String[] args)
	{
		// launch our application
		MyApplication app = new MyApplication();
		
		// show the frame here or at the bottom of the JFrame constructor
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setTitle("My Very Cool Application");
		app.setBounds(100, 100, 300, 200);
		app.setVisible(true);

	}

}
